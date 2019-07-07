package com.xhu.agriculture.service;

import com.xhu.agriculture.repository.User;

/**
 * @Description 用户service
 * @Author fengwen
 * @Date 2019/7/4 10:24
 * @Version V1.0
 */
public interface UserService extends BaseService<User>{

    /**
     * 用户登录
     * @param user
     * @return
     */
    User login(User user);

    /**
     * 通过手机号码进行查询
     * @param userPhone
     * @return
     */
    User getByPhone(Long userPhone);
}
