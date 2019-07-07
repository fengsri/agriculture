package com.xhu.agriculture.enums;

import lombok.Getter;

/**
 * @Description 错误码枚举类
 * @Author chenlinghong
 * @Date 2019/3/29 18:17
 **/
@Getter
public enum ErrorCodeEnum {

    SUCCESS("0000", "请求成功"),

    /**
     * 01XX 参数相关错误
     */
    PARAM_IS_NULL("0100", "参数为空"),
    TELEPHONE_ILLEGAL("0101", "电话号码不合法"),
    PARAM_ILLEGAL("0102", "参数错误"),
    TELEPHONE_HAS_REGISTER("0103", "电话号码已经注册"),


    /**
     * 02XX 登录相关错误
     */
    LOGIN_ERROR("0200", "登陆失败"),
    NOT_ALIVE_USER("0201", "用户未登录"),
    PASSWORD_ERROR("0202", "密码错误"),
    NOT_HAVE_PHONE("0203", "没有该手机号"),


    /**
     * 03XX 数据操作 相关错误
     */
    DATA_ERROR("0300", "数据不存在"),
    DATA_NULL_ERROR("0301", "查询数据为空"),
    DATA_SAVE_ERROR("0302","数据保存错误"),
    DATA_UPDATE_ERROR("0302","数据修改错误"),
    DATA_DELETE_ERROR("0303","数据删除错误"),

    /**
     * 04XX 未知错误
     */
    UNKOWN_ERROR("0400", "未知错误"),

    /**
     * 05XX 验证码错误
     */
    CRATE_IMAGE_ERROR("0500", "创建图形验证码失败"),
    IMAGE_CODE_ERROR("0501", "图形验证码时效超时或失败"),

    /**
     * 06XX 文件问题
     */
    FILE_HANDLE_ERROR("0600", "文件处理异常"),
    FILE_IS_NULL("0601", "文件为空"),
    FILE_STREAM_CREATE_ERROR("0602", "文件创建错误"),
    FILE_DOWNLOAD_ERROR("0603", "文件下载错误"),


    /**
     * 09权限问题
     */
    NOT_HAVE_PERMISSION("0901","没有权限")
    ;



    /**
     * 错误码
     */
    private String code;

    /**
     * 错误信息
     */
    private String msg;

    ErrorCodeEnum(String code, String msg) {
        this.code = code;
        this.msg = msg;
    }

}
