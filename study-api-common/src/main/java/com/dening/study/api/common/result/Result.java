package com.dening.study.api.common.result;

import com.dening.study.api.common.exception.GlobalExceptionMsgEnum;
import lombok.Getter;
import lombok.Setter;

import java.io.Serial;
import java.io.Serializable;

@Getter
@Setter
public class Result<T> implements Serializable {

    @Serial
    private static final long serialVersionUID = 747276176256579475L;

    public static final String SUCCESS = "201";
    public static final String FAIL = "202";


    private String code;
    private String msg;
    private T data;


    public Result() {
    }

    public Result(String code, String msg) {
        super();
        this.code = code;
        this.msg = msg;
    }

    public Result(String code, String msg, T data) {
        super();
        this.code = code;
        this.msg = msg;
        this.data = data;
    }

    public Result(GlobalExceptionMsgEnum globalExceptionMsgEnum) {
        super();
        this.code = globalExceptionMsgEnum.getCode();
        this.msg = globalExceptionMsgEnum.getMsg();
        this.data = null;
    }

    /***
     * 创建空的 无数据的 成功返回对象
     *
     * @param <T>
     * @return
     */
    public static <T> Result<T> createOK() {
        Result<T> ok = new Result<>(SUCCESS, "");
        return ok;
    }

    /***
     * 创建空的 无数据的 成功返回对象
     *
     * @param <T>
     * @return
     */
    public static <T> Result<T> createFail() {
        Result<T> fail = new Result<>(FAIL, "");
        return fail;
    }

    public static <T> Result<T> createFail(GlobalExceptionMsgEnum globalExceptionMsgEnum) {
        Result<T> fail = new Result<>(globalExceptionMsgEnum.getCode(), globalExceptionMsgEnum.getMsg());
        return fail;
    }

    /***
     * 创建空的 无数据的 成功返回对象
     *
     * @param <T>
     * @return
     */
    public static <T> Result<T> createFail(String message) {
        Result<T> fail = new Result<>(FAIL, "");
        fail.setMsg(message);
        return fail;
    }

    public static <T> Result<T> createFail(String code, String message) {
        Result<T> fail = new Result<>(code, message);
        return fail;
    }

    public static <T> Result<T> createFail(String code, String message, T data) {
        Result<T> fail = new Result<>(code, message, data);
        return fail;
    }

    /**
     * 根据返回的数据，创建成功的返回对象
     *
     * @param data
     * @param <T>
     * @return
     */
    public static <T> Result<T> createOK(T data) {
        Result<T> ok = createOK();
        ok.setMsg("数据访问成功");
        ok.setData(data);
        return ok;
    }

    public static <T> Result<T> createOK(T data, String message) {
        Result<T> ok = createOK();
        ok.setMsg(message);
        ok.setData(data);
        return ok;
    }
}

