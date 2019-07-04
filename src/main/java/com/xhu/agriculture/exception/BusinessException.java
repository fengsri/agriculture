package com.xhu.agriculture.exception;

import com.xhu.agriculture.enums.ErrorCodeEnum;
import lombok.Getter;

/**
 * @Description 业务异常
 * @Author chenlinghong
 * @Date 2019/4/19 0:32
 * @Version V1.0
 */
@Getter
public class BusinessException extends RuntimeException {

    /**
     * 异常码
     */
    private String code;

    public BusinessException(String message, Throwable cause) {
        super(message, cause);
    }

    public BusinessException(ErrorCodeEnum errorEnum) {
        super(errorEnum.getMsg());
        this.code = errorEnum.getCode();
    }

    public BusinessException(String code, String message) {
        super(message);
        this.code = code;
    }

}
