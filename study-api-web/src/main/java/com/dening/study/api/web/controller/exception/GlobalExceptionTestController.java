package com.dening.study.api.web.controller.exception;

import com.dening.study.api.common.exception.uncheck.BusinessException;
import com.dening.study.api.web.result.Result;
import io.swagger.annotations.ApiOperation;
import lombok.extern.slf4j.Slf4j;
import org.apache.commons.lang3.StringUtils;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * 全局异常测试控制器
 */
@RestController
@RequestMapping(value = "/api/exception")
@Slf4j
public class GlobalExceptionTestController {

    @ApiOperation(value = "/checkGlobalBusinessException")
    @GetMapping("/checkGlobalBusinessException")
    public Result<Object> checkGlobalBusinessException(@RequestParam String user) {
        log.info("全局自定义异常测试接口checkGlobalException调用,用户：{}", user);

        if (StringUtils.isBlank(user)) {
            BusinessException e = new BusinessException("用户姓名不能为空");
            throw e;
        }
        return Result.createOK("Welcome Business:" + user);
    }

    @ApiOperation(value = "/checkGlobalNPEException")
    @GetMapping("/checkGlobalNPEException")
    public Result<Object> checkGlobalNPEException(@RequestParam String user) {
        log.info("全局NPE异常测试接口checkGlobalException调用,用户：{}", user);
        if (StringUtils.isBlank(user)) {
            NullPointerException e = new NullPointerException("测试空指针异常");
            throw e;
        }
        return Result.createOK("Welcome NPE:" + user);
    }

}
