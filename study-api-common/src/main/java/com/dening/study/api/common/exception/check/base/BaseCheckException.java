package com.dening.study.api.common.exception.check.base;

import java.io.Serial;

/**
 * 受检异常
 */
public class BaseCheckException extends Exception {

    @Serial
    private static final long serialVersionUID = 1548632723589972753L;

    public static final String ERRCODE_SUCCESS = "201";
    public static final String ERRCODE_FAIL = "202";

    private String code;
    private String message;

    public BaseCheckException() {
    }


    public BaseCheckException(String message) {
        super(message);
        this.code = ERRCODE_FAIL;
    }

    public BaseCheckException(String message, Throwable e) {
        super(message, e);
        this.message = message;
        this.code = ERRCODE_FAIL;
    }

    public BaseCheckException(String code, String message) {
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
