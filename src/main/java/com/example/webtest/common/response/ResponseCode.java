package com.example.webtest.common.response;

import lombok.Getter;

/**
 * 所有错误码都应该放在这里
 */
@Getter
public enum ResponseCode {
    SUCCESS("0", null),
    PARAM_INVALID("param_invalid", "参数不合法"),
    FAIL("internal_server_error", "内部服务器错误");

    private final String code;
    private final String message;
    ResponseCode(String code, String message){
        this.code = code;
        this.message = message;
    }
}
