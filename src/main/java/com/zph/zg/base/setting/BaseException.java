package com.zph.zg.base.setting;
public class BaseException extends RuntimeException {
    private static final long serialVersionUID = -4465133464877558188L;
    private Integer code;

    public BaseException(String message) {
        super(message);
    }

    public BaseException(Integer code, String message) {
        super(message);
        this.setCode(code);
    }

    public BaseException(String message, Throwable cause) {
        super(message, cause);
    }

    public BaseException(Integer code, String message, Throwable cause) {
        super(message, cause);
        this.setCode(code);
    }

    public Integer getCode() {
        return this.code;
    }

    public void setCode(Integer code) {
        this.code = code;
    }
}
