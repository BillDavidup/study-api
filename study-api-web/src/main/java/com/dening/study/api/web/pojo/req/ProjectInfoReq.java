package com.dening.study.api.web.pojo.req;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

@ApiModel
public class ProjectInfoReq {
    @ApiModelProperty(required = true, name = "项目ID", value = "999")
    Long projectId;
    @ApiModelProperty(name = "项目名称", value = "高级项目")
    String projectName;

    public Long getProjectId() {
        return projectId;
    }

    public void setProjectId(Long projectId) {
        this.projectId = projectId;
    }

    public String getProjectName() {
        return projectName;
    }

    public void setProjectName(String projectName) {
        this.projectName = projectName;
    }
}
