package org.zfx.vo;

import lombok.Data;

@Data
public class Result<T> {
    private int code;
    private String message;
    private T data;

    /**
     * 成功
     */
    public static <T> Result<T> success(T data) {
        Result<T> result = new Result<T>();
        result.setCode(ResultCode.SUCCESS.getCode());
        result.setMessage(ResultCode.SUCCESS.getMessage());
        result.setData(data);
        return result;
    }
    /**
     * 失败
     */
    public static <T> Result<T> error(T data) {
        Result<T> result = new Result<T>();
        result.setCode(ResultCode.INTERNAL_SERVER_ERROR.getCode());
        result.setMessage(ResultCode.INTERNAL_SERVER_ERROR.getMessage());
        result.setData(data);
        return result;
    }
}
