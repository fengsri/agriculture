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
     * 01XX 参数相关
     */
    PARAM_IS_NULL("0100", "参数为空"),
    TELEPHONE_ILLEGAL("0101", "电话号码不合法"),
    PARAM_ILLEGAL("0102", "参数错误"),
    DATA_IS_NULL("0103","参数为空"),
    TELEPHONE_HAS_REGISTER("0104", "电话号码已经注册"),


    /**
     * 02XX 用户信息相关
     */
    NO_USER("0200", "用户不存在"),
    NOT_ALIVE_USER("0201", "用户未登录"),
    PASSWORD_ERROR("0202", "密码错误"),
    USER_NOT_LOGIN("0203", "用户未登陆"),

    /**
     * 03XX 数据错误
     */
    DATA_ERROR("0300", "数据存在错误"),
    DATA_NULL_ERROR("0301", "数据为空"),
    DATA_UPDATE_ERROR("0302","数据修改错误"),
    DATA_DELETE_ERROR("0303","数据删除错误"),
    DATA_COMPLETE_ERROR("0304","数据不完整"),

    /**
     * 04XX 其它错误
     */
    UNKOWN_ERROR("0400", "未知错误"),

    /**
     * 05XX 验证码错误
     */
    CRATE_IMAGE_ERROR("0500", "创建图形验证码失败"),
    IMAGE_CODE_ERROR("0501", "图形验证码时效超时或失败"),

    /**
     * 06XX 文件
     */
    FILE_HANDLE_ERROR("0600", "文件处理异常"),
    FILE_IS_NULL("0601", "文件为空"),
    FILE_STREAM_CREATE_ERROR("0602", "文件创建错误"),
    FILE_DOWNLOAD_ERROR("0603", "文件下载错误"),

    /**
     * 07数据读入错误
     */
    SAVE_DATA_ERROR("0700","数据保存出错"),
    CACHE_DATA_ERROR("0701","数据缓存出错"),


    /**
     * 08事故编号错误
     */
    ACCIDENT_NOT_EXISTS("0800","不存在该事故"),
    DATA_HAS_SAVE("0801","该事故编号对于的资源数据已经保存"),
    CASE_NUMBER_PARTICIPANT_DATA("0802","案例编号对应参与方数据错误"),


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
