package com.xhu.agriculture.constant;

/**
 * @Description Redis常量
 * @Author chenlinghong
 * @Date 2019/4/3 16:28
 **/
public final class RedisConstant {

    /**
     * 分隔符
     */
    public static final String SEPARATOR = ":";

    /**
     * 电话号码
     */
    public static final String TELEPHONE = "telephone";

    /**
     * 用户基本信息视图对象
     */
    public static final String USER_INFO = "user_info";

    /**
     * 用户基本信息
     */
    public static final String USER = "user";

    /**
     * 短信验证码ttl 单位：ms
     */
    public static final long SMS_TTL = 10 * 60 * 1000L;

    /**
     * 数据ttl
     */
    public static final long DATA_TTL = 2 * 60 * 60 * 1000L;

}
