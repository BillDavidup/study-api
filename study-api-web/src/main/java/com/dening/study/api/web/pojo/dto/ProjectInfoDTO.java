package com.dening.study.api.web.pojo.dto;

import com.dening.study.api.web.pojo.vo.ProjectInfoVO;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.PostMapping;

@ApiModel()
public class ProjectInfoDTO {
    @ApiModelProperty(required = true, name = "项目ID", value = "999")
    Long projectId;
    @ApiModelProperty(name = "项目信息实体", value = "项目信息实体")
    ProjectInfoVO infoVO;

    public Long getProjectId() {
        return projectId;
    }

    public void setProjectId(Long projectId) {
        this.projectId = projectId;
    }

    public ProjectInfoVO getInfoVO() {
        return infoVO;
    }

    public void setInfoVO(ProjectInfoVO infoVO) {
        this.infoVO = infoVO;
    }
}
