package com.xhu.agriculture.dao;

import com.xhu.agriculture.repository.User;

/**
 * 用户dao接口
 */
public interface UserDao extends BaseDao<User> {

    /**
     * 用户登录
     * @param user
     * @return
     */
    User login(User user);



}
