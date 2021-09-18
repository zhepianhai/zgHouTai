package com.zph.zg.base.controller;

import com.zph.zg.base.setting.BaseException;
import com.zph.zg.base.setting.BaseResponse;
import org.springframework.web.bind.annotation.ControllerAdvice;

import java.util.HashMap;
import java.util.Map;

@ControllerAdvice
public abstract class BaseController {
    /**
     * 返回成功信息
     *
     * @return
     */
    public static BaseResponse buildSuccessResponse() {
        BaseResponse response = new BaseResponse();
        response.setSuccess(true);
        return response;
    }

    /**
     * 返回成功信息
     *
     * @param data
     * @return
     */
    public static <T> BaseResponse<T> buildSuccessResponse(T data) {

        BaseResponse<T> response = new BaseResponse<T>();
        response.setSuccess(true);
        response.setCode(0);
        if (data == null) {
            Map<String, Object> params = new HashMap<>(0);
            response.setData((T) params);
            return response;
        }
        if (data instanceof String || data instanceof Integer || data instanceof Double || data instanceof Short
                || data instanceof Character || data instanceof Boolean || data instanceof Float || data instanceof Long) {
            Map<String, Object> params = new HashMap<>(1);
            params.put("key", data);
            response.setData((T) params);
        } else {
            response.setData(data);
        }
        return response;
    }

    /**
     * 返回失败信息
     *
     * @return
     */
    public static BaseResponse buildFailResponse() {
        BaseResponse response = new BaseResponse();
        response.setSuccess(false);
        return response;
    }
    /**
     * 返回失败信息
     *
     * @param message
     * @return
     */
    public static BaseResponse buildFailResponse(String message) {
        BaseResponse response = new BaseResponse();
        response.setSuccess(false);
        response.setMessage(message);
        return response;
    }

    /**
     * 返回失败信息
     *
     * @return
     */
    public static BaseResponse buildFailResponse(Exception e) {
        BaseResponse response = new BaseResponse();
        response.setSuccess(false);
        response.setMessage(e.getMessage());
        response.setThrowable(e.getClass().getName());
        if (e instanceof BaseException) {
            response.setCode(((BaseException) e).getCode());
        }
        return response;
    }
    /**
     * 返回成功信息--返回提示信息
     *
     * @param code
     * @param message
     * @return
     */
    public static BaseResponse buildSuccessResponse(Integer code, String message) {
        BaseResponse response = new BaseResponse();
        response.setSuccess(true);
        response.setCode(code);
        response.setMessage(message);
        return response;
    }

    /**
     * 返回成功信息--返回提示信息
     *
     * @param code
     * @param message
     * @return
     */
    public static BaseResponse buildSuccessResponse(Integer code, String message, String accessToken) {
        BaseResponse response = new BaseResponse();
        response.setSuccess(true);
        response.setAccessToken(accessToken);
        response.setCode(code);
        response.setMessage(message);
        return response;
    }

    /**
     * 返回成功信息--带对象
     *
     * @param code
     * @param message
     * @return
     */
    public static <T> BaseResponse<T> buildSuccessResponse(Integer code, String message, T data) {
        BaseResponse response = new BaseResponse();
        response.setSuccess(true);
        response = buildSuccessResponse(data);
        response.setCode(code);
        response.setMessage(message);

        return response;
    }

    /**
     * 返回失败信息
     *
     * @param code
     * @param message
     * @param path
     * @param throwable
     * @return
     */
    public static BaseResponse buildFailResponse(Integer code, String message, String path, String throwable) {
        BaseResponse response = new BaseResponse();
        response.setSuccess(false);
        response.setCode(code);
        response.setMessage(message);
        response.setPath(path);
        response.setThrowable(throwable);
        return response;
    }
    /**
     * 返回失败信息
     * */
    public static BaseResponse buildFailResponse(Integer code, String message, boolean isSuccess) {
        BaseResponse response = new BaseResponse();
        response.setSuccess(Boolean.valueOf(isSuccess));
        response.setCode(code);
        response.setMessage(message);
        return response;
    }
}
