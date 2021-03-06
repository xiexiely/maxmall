package com.maxmall.provider.merchant.model.dto.merchant;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.io.Serializable;

@Data
@ApiModel(value = "分销商返点配置查询")
public class DisCommissionQueryDto implements Serializable {

    @ApiModelProperty(value = "等级名称")
    private String name;

    private Integer pageNum;

    private Integer pageSize;
}