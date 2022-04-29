package com.my.blog.common.lang;

import lombok.Data;

import java.io.Serializable;

/**
 * @author hjy
 */
@Data
public class Result implements Serializable {


    private int code;
    private String message;
    private Object data;

    public static Result success(int code, String message, Object data) {
        Result result = new Result();
        result.setCode(code);
        result.setMessage(message);
        result.setData(data);
        return result;
    }


    public static Result success(Object data) {
        return success(200, "success", data);
    }

    public static Result fail(int code, String message) {
        Result result = new Result();
        result.setCode(code);
        result.setMessage(message);
        return result;
    }

    public static Result fail() {
        return fail(400, "fail");
    }

}
