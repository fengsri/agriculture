package com.xhu.agriculture.service.impl;

import com.xhu.agriculture.comment.PageDto;
import com.xhu.agriculture.enums.ErrorCodeEnum;
import com.xhu.agriculture.exception.BusinessException;
import com.xhu.agriculture.repository.TestDomain;
import com.xhu.agriculture.repository.User;
import com.xhu.agriculture.service.UserService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * @Description 用户service
 * @Author fengwen
 * @Date 2019/7/4 10:25
 * @Version V1.0
 */
@Service
@Slf4j
@Transactional(rollbackFor = Exception.class)
public class UserServiceImpl extends BaseServiceImpl<User> implements UserService {

    /**
     * 通过id进行查询用户
     * @param id
     * @return
     */
    @Override
    public User findById(Integer id) {
        //1、检验是否为空
        if (id == null) {
            log.error("UserServiceImpl#findById: id is null, id={}.", id);
            throw new BusinessException(ErrorCodeEnum.PARAM_IS_NULL);
        }

        //2、查询数据
        User user = userDao.getById(id);

        //3、对返回的数据检验
        if (user == null) {
            log.error("UserServiceImpl#findById: data is null, id={}.", id);
            throw new BusinessException(ErrorCodeEnum.DATA_NULL_ERROR);
        }

        //4、返回数据
        return user;
    }

    /**
     * 通过id进行删除
     * @param id
     * @return
     */
    @Override
    public boolean deleteById(Integer id) {
        //1、检验是否为空
        if (id == null) {
            log.error("UserServiceImpl#deleteById: id is null, id={}.", id);
            throw new BusinessException(ErrorCodeEnum.PARAM_IS_NULL);
        }

        //2、查询数据
        int result = userDao.deleteById(id);

        //3、对返回的数据检验
        if (result == 0) {
            log.error("UserServiceImpl#deleteById: delete is error, id={}.", id);
            throw new BusinessException(ErrorCodeEnum.DATA_DELETE_ERROR);
        }

        //4、返回数据
        return true;
    }

    /**
     * 修改用户信息
     * @param user
     * @return
     */
    @Override
    public boolean update(User user) {
        //1、检验是否为空
        if (user == null) {
            log.error("UserServiceImpl#update: id is null, user={}.", user);
            throw new BusinessException(ErrorCodeEnum.PARAM_IS_NULL);
        }

        //2、查询数据
        int result = userDao.update(user);

        //3、对返回的数据检验
        if (result == 0) {
            log.error("UserServiceImpl#update: update is error, id={}.", user);
            throw new BusinessException(ErrorCodeEnum.DATA_UPDATE_ERROR);
        }

        //4、返回数据
        return true;
    }

    /**
     * 添加用户信息
     * @param user
     * @return
     */
    @Override
    public boolean insert(User user) {
        //1、检验是否为空
        if (user == null) {
            log.error("UserServiceImpl#insert: user is null, id={}.", user);
            throw new BusinessException(ErrorCodeEnum.PARAM_IS_NULL);
        }

        //2、查询数据
        int result = userDao.insert(user);

        //3、对返回的数据检验
        if (result == 0) {
            log.error("UserServiceImpl#deleteById: insert error, user={}.", user);
            throw new BusinessException(ErrorCodeEnum.DATA_SAVE_ERROR);
        }

        //4、返回数据
        return true;
    }

    /**
     * 总数
     * @return
     */
    @Override
    public long count() {
        return userDao.count();
    }

    /**
     * 分页查询
     * @param pageNo
     * @param pageSize
     * @return
     */
    @Override
    public PageDto<User> listAll(long pageNo, long pageSize) {
        long offset = (pageNo - 1) * pageSize;
        long rows = pageSize;
        List<User> userList = userDao.listAll(offset, rows);
        long totalCount = userDao.count();
        return new PageDto<>(userList, pageNo, pageSize, totalCount);
    }


    /**
     * 用户登录
     * @param user
     * @return
     */
    @Override
    public User login(User user) {
        //1、检验是否为空
        if (user == null) {
            log.error("UserServiceImpl#login: user is null, id={}.", user);
            throw new BusinessException(ErrorCodeEnum.PARAM_IS_NULL);
        }

        //2、查询数据
        User us = userDao.login(user);

        //3、对返回的数据检验
        if (us == null) {
            log.error("UserServiceImpl#login: login error, user={}.", user);
            throw new BusinessException(ErrorCodeEnum.LOGIN_ERROR);
        }

        //4、返回数据
        return us;
    }

    /**
     * 通过手机号码进行查询
     * @param userPhone
     * @return
     */
    @Override
    public User getByPhone(Long userPhone) {
        //1、检验是否为空
        if (userPhone == null) {
            log.error("UserServiceImpl#getByPhone: userPhone is null, userPhone={}.", userPhone);
            throw new BusinessException(ErrorCodeEnum.PARAM_IS_NULL);
        }

        //2、查询数据
        User us = userDao.getByPhone(userPhone);

        //3、对返回的数据检验
        if (us == null) {
            log.error("UserServiceImpl#getByPhone: not have userPhone, userPhone={}.", userPhone);
            throw new BusinessException(ErrorCodeEnum.NOT_HAVE_PHONE);
        }

        //4、返回数据
        return us;
    }
}
