package com.dening.study.api.web.config.exception;

import com.alibaba.fastjson.JSON;
import com.dening.study.api.common.exception.GlobalExceptionMsgEnum;
import com.dening.study.api.common.exception.uncheck.BusinessException;
import com.dening.study.api.common.result.Result;
import org.apache.commons.lang3.exception.ExceptionUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;

/**
 * 自定义全局异常处理类
 * https://mp.weixin.qq.com/s/nRsxgjVzXUwjgGtZnSU8Sw
 */
@ControllerAdvice
public class GlobalExceptionHandler {

    private static final Logger LOGGER = LoggerFactory.getLogger(GlobalExceptionHandler.class);

    /**
     * 处理自定义的业务异常
     *
     * @param req
     * @param e
     * @return
     */
    @ExceptionHandler(value = BusinessException.class)
    @ResponseBody
    public <T> Result<T> businessExceptionHandler(HttpServletRequest req, BusinessException e) {
        LOGGER.error("请求API【{}】,请求参数【{}】,发生业务异常！原因是：{}", req.getRequestURI(),
                JSON.toJSONString(req.getParameterMap()), ExceptionUtils.getStackTrace(e));
        return Result.createFail(GlobalExceptionMsgEnum.BUSINESS_ERROR.getCode(), GlobalExceptionMsgEnum.BUSINESS_ERROR.getMsg());
    }

    /**
     * 处理空指针的异常
     *
     * @param req
     * @param e
     * @return
     */
    @ExceptionHandler(value = NullPointerException.class)
    @ResponseBody
    public <T> Result<T> exceptionHandler(HttpServletRequest req, NullPointerException e) {

        LOGGER.error("请求API【{}】,请求参数【{}】,发生空指针异常！原因是：{}", req.getRequestURI(),
                JSON.toJSONString(req.getParameterMap()), e.toString());
        return Result.createFail(GlobalExceptionMsgEnum.FAIL.getCode(), ExceptionUtils.getStackTrace(e));
    }

    /**
     * 处理其他异常
     *
     * @param req
     * @param e
     * @return
     */
    @ExceptionHandler(value = Exception.class)
    @ResponseBody
    public <T> Result<T> exceptionHandler(HttpServletRequest req, Exception e) {

        LOGGER.error("请求API【{}】,请求参数【{}】,未知异常！原因是：{}", req.getRequestURI(),
                JSON.toJSONString(req.getParameterMap()), ExceptionUtils.getStackTrace(e));
        return Result.createFail(GlobalExceptionMsgEnum.FAIL);
    }

}
