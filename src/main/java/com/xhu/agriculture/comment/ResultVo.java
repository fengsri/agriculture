package com.xhu.agriculture.comment;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

/**
 * @Description TODO
 * @Author chenlinghong
 * @Date 2019/3/29 18:21
 **/
@Data
@AllArgsConstructor
@NoArgsConstructor
public class ResultVo<T> implements Serializable {

    private static final long serialVersionUID = 7181560261964174909L;

    /**
     * 错误码
     */
    private String code;

    /**
     * 提示信息
     */
    private String msg;

    /**
     * 数据
     */
    private T data;
}
