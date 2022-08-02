package com.dening.study.api.web.controller;

import ch.qos.logback.classic.Logger;
import com.dening.study.api.service.NacosDemoService;
import com.dening.study.api.web.pojo.dto.ProjectInfoDTO;
import com.dening.study.api.web.pojo.req.ProjectInfoReq;
import com.dening.study.api.web.pojo.vo.ProjectInfoVO;
import com.github.xiaoymin.knife4j.annotations.ApiOperationSupport;
import com.github.xiaoymin.knife4j.annotations.ApiSupport;
import io.swagger.annotations.ApiOperation;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * knife4j的controller优先级：@ApiSupport(order =1) > @ApiSort(1) > @Api(tags="", position = 1)
 * 同一个controller方法排序：@ApiOperationSupport(order = 1)
 */
@ApiSupport(order = 1) //分组Controller排序或者着使用增强注解@ApiSort(1)
@RestController
@RequestMapping(value = "/api/swagger/demo")
public class ProjectSwaggerDemoController {
    private Logger logger = (Logger) LoggerFactory.getLogger(ProjectSwaggerDemoController.class);
    @Autowired
    NacosDemoService nacosDemoService;

    @ApiOperationSupport(order = 1) // 方法排序
    @ApiOperation(value = "/api/swagger/demo/getProjectInfo")
    @PostMapping("/getProjectInfo")
    public ProjectInfoDTO getProjectInfo(@RequestBody ProjectInfoReq req) {

        ProjectInfoDTO dto = new ProjectInfoDTO();
        Long projectId = req.getProjectId();
        dto.setProjectId(projectId);
        logger.info("/api/swagger/demo/getProjectInfo被调用");
        ProjectInfoVO infoVO = new ProjectInfoVO();
        String projectName = req.getProjectName();
        infoVO.setProjectName(projectName);
        infoVO.setProjectDesc("swagger测试项目");
        infoVO.setNacosValue(nacosDemoService.getDemoNacosParam());
        dto.setInfoVO(infoVO);

        return dto;
    }
}
