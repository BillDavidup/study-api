package com.dening.study.api.common.exception.uncheck;


import com.dening.study.api.common.exception.uncheck.base.BaseUncheckException;

import java.io.Serial;

/**
 * 自定义检查异常
 */
public class BusinessException extends BaseUncheckException {

    @Serial
    private static final long serialVersionUID = 8890176554619382722L;

    public BusinessException() {
    }

    public BusinessException(String message) {
        super(message);
    }

    public BusinessException(String message, Throwable e) {
        super(message, e);
    }

    public BusinessException(String code, String message) {
        super(code, message);
    }

}
