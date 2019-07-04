package com.xhu.agriculture.service.impl;

import com.xhu.agriculture.repository.User;
import com.xhu.agriculture.service.UserService;
import org.springframework.stereotype.Service;

/**
 * @Description 用户service
 * @Author fengwen
 * @Date 2019/7/4 10:25
 * @Version V1.0
 */
@Service
public class UserServieImpl extends BaseServiceImpl<User> implements UserService {
    @Override
    public User findById(Long id) {
        return null;
    }

    @Override
    public void deleteById(Long id) {
    }

    @Override
    public void update(User user) {
    }

    @Override
    public void insert(User user) {
    }
}
