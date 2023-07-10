package org.zfx.vo.test;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;

@Data
@Builder
@ApiModel("测试出参")
@AllArgsConstructor
public class TestResponse {
    @ApiModelProperty("测试出参3")
    private String test3;
    @ApiModelProperty("测试出参4")
    private String test4;
}
