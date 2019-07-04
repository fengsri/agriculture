package com.xhu.agriculture.service.impl;

import com.xhu.agriculture.repository.User;
import com.xhu.agriculture.service.UserService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

/**
 * @Description 用户service
 * @Author fengwen
 * @Date 2019/7/4 10:25
 * @Version V1.0
 */
@Service
@Slf4j
public class UserServieImpl extends BaseServiceImpl<User> implements UserService {

    @Override
    public User findById(Integer id) {
        return null;
    }

    @Override
    public boolean deleteById(Integer id) {
        return false;
    }

    @Override
    public boolean update(User user) {
        return false;
    }

    @Override
    public boolean insert(User user) {
        return false;
    }


}
