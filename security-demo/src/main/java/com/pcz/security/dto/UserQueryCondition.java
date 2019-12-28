package com.pcz.security.dto;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

/**
 * @author picongzhi
 */
@Data
@ApiModel(value = "用户查询条件")
public class UserQueryCondition {
    private String username;

    @ApiModelProperty(value = "年龄起始值", example = "1")
    private Integer age;

    @ApiModelProperty(value = "年龄终止值", example = "1")
    private Integer ageTo;

    private String xxx;
}
