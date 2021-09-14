package com.zph.zg.base.setting;

import java.io.Serializable;

public class BaseResponse<T> implements Serializable {
    private Boolean success = true;
    private Integer code;
    private String message;
    private String path;
    private String throwable;
    private T data;
    private String accessToken;

    public BaseResponse() {
    }

    public Boolean getSuccess() {
        return this.success;
    }

    public String getAccessToken() {
        return this.accessToken;
    }

    public void setAccessToken(String accessToken) {
        this.accessToken = accessToken;
    }

    public void setSuccess(Boolean success) {
        this.success = success;
    }

    public Integer getCode() {
        return this.code;
    }

    public void setCode(Integer code) {
        this.code = code;
    }

    public String getMessage() {
        return this.message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public String getPath() {
        return this.path;
    }

    public void setPath(String path) {
        this.path = path;
    }

    public String getThrowable() {
        return this.throwable;
    }

    public void setThrowable(String throwable) {
        this.throwable = throwable;
    }

    public T getData() {
        return this.data;
    }

    public void setData(T data) {
        this.data = data;
    }
}
