package com.dening.study.api.common.exception;

/**
 * 错误信息定义枚举
 */
public enum GlobalExceptionMsgEnum {

    SUCCESS("201", "请求成功"),
    FAIL("202", "请求失败"),
    BUSINESS_ERROR("999", "业务自定义异常");

    /**
     * 错误码
     */
    private String code;

    /**
     * 错误描述
     */
    private String msg;

    GlobalExceptionMsgEnum(String code, String msg) {
        this.code = code;
        this.msg = msg;
    }

    public String getCode() {
        return code;
    }

    public String getMsg() {
        return msg;
    }
}
