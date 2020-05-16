package com.example.webtest.common.response;

import lombok.Data;
import org.springframework.http.HttpStatus;

import java.io.Serializable;
import java.util.Objects;

@Data
public class ResponseResult <T> implements Serializable {

    /**
     * HTTP 状态码
     */
    private Integer statusCode;

    /**
     * 逻辑状态码，成功时返回"0"，其他值表示逻辑失败
     */
    private String code;

    /**
     * 错误信息，成功时返回null
     */
    private String message;

    /**
     * 返回的结果数据，默认为null
     */
    private T data;

    public ResponseResult(Integer statusCode, ResponseCode responseCode, String message, T data){
        this.code = responseCode.getCode();

        if (Objects.isNull(message)) {
            this.message = responseCode.getMessage();
        } else {
            this.message = message;
        }

        this.statusCode = statusCode;
        this.data = data;
    }

    public static <T> ResponseResult<T> renderSuccess(){
        return new ResponseResult(HttpStatus.OK.value(), ResponseCode.SUCCESS, null, null);
    }

    public static <T> ResponseResult<T> renderSuccess(T data){
        return new ResponseResult(HttpStatus.OK.value(), ResponseCode.SUCCESS, null, data);
    }

    public static <T> ResponseResult<T> renderError(Integer statusCode, ResponseCode responseCode, String message){
        return new ResponseResult(statusCode, responseCode.FAIL, message, null);
    }

    public static <T> ResponseResult<T> renderError(Integer statusCode, ResponseCode responseCode){
        return new ResponseResult(statusCode, responseCode.FAIL, null, null);
    }
}
