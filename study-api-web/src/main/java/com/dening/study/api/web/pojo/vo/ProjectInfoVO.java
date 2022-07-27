package com.dening.study.api.web.pojo.vo;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

@ApiModel
public class ProjectInfoVO {
    @ApiModelProperty(name = "项目名称", value = "高级项目")
    String projectName;
    @ApiModelProperty(name = "项目描述", value = "该项目用于swagger接口文档的测试")
    String projectDesc;

    public String getProjectName() {
        return projectName;
    }

    public void setProjectName(String projectName) {
        this.projectName = projectName;
    }

    public String getProjectDesc() {
        return projectDesc;
    }

    public void setProjectDesc(String projectDesc) {
        this.projectDesc = projectDesc;
    }
}
