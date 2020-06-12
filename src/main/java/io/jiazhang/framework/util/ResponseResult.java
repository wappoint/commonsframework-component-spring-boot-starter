package io.jiazhang.framework.util;

import io.jiazhang.framework.constant.BusinessStatus;

import java.io.Serializable;

/**
 * @author George Jia
 * @qq 676002187
 * @wechat linger_zhang
 * @date 2020-06-11 12:41
 */
public class ResponseResult<T> implements Serializable {
    private static final long serialVersionUID = 3586345335066261069L;


    /**
     * 返回结果的时间
     */
    private String timestamp;
    /**
     * 业务状态码
     */
    private Integer code;
    /**
     * 信息描述
     */
    private String message;
    /**
     * 返回参数
     */
    private T data;

    private ResponseResult(BusinessStatus businessStatus, T data) {
        this.timestamp = LocalDateTimeUtils.getNowTime();
        this.code = businessStatus.getCode();
        this.message = businessStatus.getMessage();
        this.data = data;
    }

    public static <T> ResponseResult<T> success(T data) {
        return new ResponseResult<T>(BusinessStatus.SUCCESS, data);
    }

    /**
     * 业务成功返回业务代码,描述和返回的参数
     */
    public static <T> ResponseResult<T> success(BusinessStatus businessStatus, T data) {
        if (businessStatus == null) {
            return success(data);
        }
        return new ResponseResult<T>(businessStatus, data);
    }

    /**
     * 业务异常返回业务代码和描述信息
     */
    public static <T> ResponseResult<T> failure() {
        return new ResponseResult<T>(BusinessStatus.INTERNAL_SERVER_ERROR, null);
    }

    /**
     * 业务异常返回业务代码,描述和返回的参数
     */
    public static <T> ResponseResult<T> failure(BusinessStatus businessStatus) {
        return failure(businessStatus, null);
    }

    /**
     * 业务异常返回业务代码,描述和返回的参数
     */
    public static <T> ResponseResult<T> failure(BusinessStatus businessStatus, T data) {
        if (businessStatus == null) {
            return failure();
        }
        return new ResponseResult<T>(businessStatus, data);
    }

    public String getTimestamp() {
        return timestamp;
    }

    public void setTimestamp(String timestamp) {
        this.timestamp = timestamp;
    }

    public Integer getCode() {
        return code;
    }

    public void setCode(Integer code) {
        this.code = code;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }
}
