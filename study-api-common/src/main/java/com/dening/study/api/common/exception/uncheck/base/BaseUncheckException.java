package com.dening.study.api.common.exception.uncheck.base;

import java.io.Serial;

/**
 * 非受检异常
 */
public class BaseUncheckException extends RuntimeException {
    @Serial
    private static final long serialVersionUID = 6908814904213686929L;

    public static final String ERRCODE_SUCCESS = "201";
    public static final String ERRCODE_FAIL = "202";

    private String code;
    private String message;

    public BaseUncheckException() {
    }


    public BaseUncheckException(String message) {
        super(message);
        this.code = ERRCODE_FAIL;
    }

    public BaseUncheckException(String message, Throwable e) {
        super(message, e);
        this.message = message;
        this.code = ERRCODE_FAIL;
    }

    public BaseUncheckException(String code, String message) {
        super(message);
        this.code = code;
    }


    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    @Override
    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}
