package org.zfx.controller.test;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.v3.oas.annotations.parameters.RequestBody;
import lombok.extern.slf4j.Slf4j;
import org.apache.commons.lang3.StringUtils;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.zfx.vo.ResultCode;
import org.zfx.vo.test.TestRequest;
import org.zfx.vo.test.TestResponse;

@Slf4j
@RestController
@RequestMapping("/test")
@Api(value = "TestController", tags = { "测试文档使用情况" })
public class TestController {
    @ApiOperation(value="test hello1", notes = "hello everybody! is error!")
    @RequestMapping(value = "/hello1", method = RequestMethod.POST,produces = "application/json;charset=utf-8")
    public TestResponse hello1(@RequestBody() TestRequest testRequest){
        log.info("test hello1");
        throw new RuntimeException("test ex");
    }
/*
{
    "code": 500,
    "message": "异常错误",
    "data": "test ex"
}
*/

    @ApiOperation(value="test hello2", notes = "hello everybody! is okay!")
    @RequestMapping(value = "/hello2", method = RequestMethod.POST,produces = "application/json;charset=utf-8")
    public TestResponse hello2(@RequestBody() TestRequest testRequest){
        log.info("test hello2");
        return TestResponse.builder()
                .test3("test3:"+testRequest.getTest1())
                .test4("test4:"+testRequest.getTest2())
                .build();
    }
/*
{
    "code": 200,
    "message": "成功",
    "data": {
            "test3": "test3:1fff",
            "test4": "test4:2fff"
     }
}
*/


}
