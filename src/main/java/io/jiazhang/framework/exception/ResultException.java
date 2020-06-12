package io.jiazhang.framework.exception;

import io.jiazhang.framework.constant.BusinessStatus;

/**
 * @author George Jia
 * @qq 676002187
 * @wechat linger_zhang
 * @date 2020-06-11 11:22
 */
public class ResultException extends Exception {
    private static final long serialVersionUID = -6937763465049507069L;

    BusinessStatus businessStatus;

    public ResultException() {

    }

    public ResultException(BusinessStatus businessStatus) {
        super(businessStatus.getMessage());
        this.businessStatus = businessStatus;
    }


    public BusinessStatus getBusinessStatus() {
        return businessStatus;
    }
}
