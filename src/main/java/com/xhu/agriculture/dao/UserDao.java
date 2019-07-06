package com.xhu.agriculture.dao;

import com.xhu.agriculture.repository.User;
import org.apache.ibatis.annotations.Param;

/**
 * 用户dao接口
 */
public interface UserDao extends BaseDao<User> {

    /**
     * 用户名，密码，登录
     * @param user
     * @return
     */
    User login(User user);

    /**
     * 通过手机号码进行查询
     * @param userPhone
     * @return
     */
    User getByPhone(@Param("userPhone") Long userPhone);

}
