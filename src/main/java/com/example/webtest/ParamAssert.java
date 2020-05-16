package com.example.webtest;

import com.example.webtest.exception.Status;
import com.example.webtest.exception.StatusCodeException;

import java.util.Objects;

public class ParamAssert {
    public static <T> void notNull(T object, String msg) {
        if (Objects.isNull(object)) {
            throw new StatusCodeException(Status.error(msg));
        }
        return;
    }

    public static <T> void notNull(T object) {
        if (Objects.isNull(object)) {
            throw new StatusCodeException(Status.error(""));
        }
        return;
    }
}
