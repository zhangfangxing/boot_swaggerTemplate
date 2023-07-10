package org.zfx.vo.test;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

@Data
@ApiModel("测试入参")
public class TestRequest {
    @ApiModelProperty("测试入参1")
    private String test1;
    @ApiModelProperty("测试入参2")
    private String test2;
}