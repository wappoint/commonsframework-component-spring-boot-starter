package io.jiazhang.framework.constant;

/**
 * @author George Jia
 * @qq 676002187
 * @wechat linger_zhang
 * @date 2020-06-11 11:26
 */
public enum BusinessStatus {
    SUCCESS(1, ""),
    BAD_REQUEST(2, ""),
    INTERNAL_SERVER_ERROR(3, "");

    /**
     * 业务异常码
     */
    private final Integer code;

    /**
     * 业务异常信息描述
     */
    private final String message;

    private BusinessStatus(Integer code, String message) {
        this.code = code;
        this.message = message;
    }

    public Integer getCode() {
        return code;
    }


    public String getMessage() {
        return message;
    }
}
