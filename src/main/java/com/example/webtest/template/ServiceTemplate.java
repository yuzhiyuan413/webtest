package com.example.webtest.template;

import com.example.webtest.exception.ServiceException;
import com.example.webtest.exception.Status;
import com.example.webtest.exception.StatusCodeException;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public abstract class ServiceTemplate <T> {
    public static final int STATUS_CHECK_PARAMS = Status.ERROR;

    public static final int STATUS_SERVER_UNAVAILABLE = -503;

    protected Logger logger = LoggerFactory.getLogger(getClass());

    protected ServiceTemplate() {
    }

    protected abstract void checkParam();

    protected abstract T process();

    public T excute() {
        return doExcute();
    }

    private T doExcute() {
        try {
            checkParam();
        } catch (IllegalArgumentException e) {
            throw new StatusCodeException(e, Status.error(STATUS_CHECK_PARAMS, e.getMessage()));
        } catch (StatusCodeException e) {
            throw e;
        }

        try {
            T result = process();
            // doSuccess()
            return result;
        } catch (ServiceException e) {
            return null;
        } catch (StatusCodeException e) {
            return null;
        } catch (NullPointerException e) {
            return null;
        } catch (Throwable e) {
            return null;
        } finally {
            // finalProcess()
        }
    }
}
