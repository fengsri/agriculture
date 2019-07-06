package com.xhu.agriculture.repository;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.validator.constraints.Length;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;
import java.util.Date;

/**
 * @Description
 * @Author fengwen
 * @Date 2019/7/4 10:19
 * @Version V1.0
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class User extends BaseDomain {

    /**
     * 用户名
     */
    @NotNull(message = "用户名不能为空")
    @Length(min = 6, message = "长度不能少于4位")
    private String userName;

    /**
     * 用户密码
     */
    @NotNull(message = "密码不能为空")
    @Length(min = 6, message = "密码不能少于6位")
    private String userPassword;

    /**
     * 用户电话号码
     */
    @NotNull(message = "手机号码不能为空")
    @Pattern(regexp = "^1(3|4|5|7|8)\\d{9}$", message = "手机号码格式错误")
    private Long userPhone;

    /**
     * 身份证号码
     */
    @NotNull(message = "身份证号码不能为空")
    @Length(min = 6, message = "密码不能少于6位")
    private String userIdcard;

    /**
     * 性别：1男 2女 3未知
     */
    @NotNull
    private Integer userGrander;

    /**
     * 用户生日
     */
    @NotNull
    private Date userBirthday;

    /**
     * 用户邮箱
     */
    private String userEmail;

    /**
     * 用户头像
     */
    private String userHeaderPic;

    /**
     * 用户描述
     */
    private String userDescription;

    /**
     * 用户地址
     */
    private String userAddress;

    /**
     * 用户状态：1；表示可用  2：表示不可用
     */
    @NotNull
    private Integer userStatue;

    /**
     * 用户类型：1：用户 2：农户 3：超级管理员
     */
    @NotNull
    private Integer userTypeId;

}
