package com.xhu.agriculture.service.impl;

import com.xhu.agriculture.dao.TestDao;
import com.xhu.agriculture.dao.UserDao;
import com.xhu.agriculture.service.BaseService;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * @Description 基本的service抽象类
 * @Author fengwen
 * @Date 2019/7/3 14:16
 * @Version V1.0
 */
public abstract class BaseServiceImpl<T> implements BaseService<T> {

    /**
     * 统一管理dao
     */
    @Autowired
    UserDao userDao;

    @Autowired
    TestDao testDao;
}
