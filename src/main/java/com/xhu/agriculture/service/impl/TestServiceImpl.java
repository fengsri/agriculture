package com.xhu.agriculture.service.impl;


import com.xhu.agriculture.comment.PageDto;
import com.xhu.agriculture.dao.TestDao;
import com.xhu.agriculture.enums.ErrorCodeEnum;
import com.xhu.agriculture.exception.BusinessException;
import com.xhu.agriculture.repository.TestDomain;
import com.xhu.agriculture.repository.User;
import com.xhu.agriculture.service.BaseService;
import com.xhu.agriculture.service.TestService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.servlet.http.HttpServletResponse;
import java.util.List;

/**
 * @Description 测试的TestServiceImpl
 * @Author fengwen
 * @Date 2019/7/3 15:53
 * @Version V1.0
 */
@Service
@Slf4j
@Transactional(rollbackFor = Exception.class)
public class TestServiceImpl  extends BaseServiceImpl<TestDomain> implements TestService{


    /**
     * id查询
     * @param id
     * @return
     */
    @Override
    public TestDomain findById(Integer id) {
        //1、检验是否为空
        if (id == null) {
            log.error("TestServiceImpl#TestDomain: id is null id={}.", id);
            throw new BusinessException(ErrorCodeEnum.PARAM_IS_NULL);
        }

        //2、查询数据
        TestDomain testDomain = testDao.getById(id);

        //3、对返回的数据检验
        if (testDomain == null) {
            log.error("TestServiceImpl#TestDomain: data is null, id={}.", id);
            throw new BusinessException(ErrorCodeEnum.DATA_NULL_ERROR);
        }

        //4、返回数据
        return testDomain;
    }

    /**
     * id删除
     * @param id
     */
    @Override
    public boolean deleteById(Integer id) {
        //1、检验是否为空
        if (id == null) {
            log.error("TestServiceImpl#TestDomain: id is null id={}.", id);
            throw new BusinessException(ErrorCodeEnum.PARAM_IS_NULL);
        }

        //2、查询数据
        int result = testDao.deleteById(id);

        //3、对返回的数据检验
        if (result ==0) {
            log.error("TestServiceImpl#deleteById: id is not exist, id={}.", id);
            throw new BusinessException(ErrorCodeEnum.DATA_DELETE_ERROR);
        }

        //4、返回数据
        return true;
    }

    /**
     * 修改
     * @param testDomain
     */
    @Override
    public boolean update(TestDomain testDomain) {
        //1、检验是否为空
        if (testDomain == null) {
            log.error("TestServiceImpl#update: testDomain is null testDomain={}.", testDomain);
            throw new BusinessException(ErrorCodeEnum.PARAM_IS_NULL);
        }

        //2、查询数据
        int result = testDao.update(testDomain);

        //3、对返回的数据检验
        if (result ==0) {
            log.error("TestServiceImpl#deleteById: update testDomain error, testDomain={}.", testDomain);
            throw new BusinessException(ErrorCodeEnum.DATA_UPDATE_ERROR);
        }

        //4、返回数据
        return true;
    }

    /**
     * 插入
     * @param testDomain
     */
    @Override
    public boolean insert(TestDomain testDomain) {
        //1、检验是否为空
        if (testDomain == null) {
            log.error("TestServiceImpl#update: testDomain is null testDomain={}.", testDomain);
            throw new BusinessException(ErrorCodeEnum.PARAM_IS_NULL);
        }

        //2、插入数据
        int result = testDao.insert(testDomain);

        //3、对返回的数据检验
        if (result ==0) {
            log.error("TestServiceImpl#deleteById: insert testDomain error, testDomain={}.", testDomain);
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
        return testDao.count();
    }

    /**
     * 分页查询
     * @param pageNo
     * @param pageSize
     * @return
     */
    @Override
    public PageDto<TestDomain> listAll(long pageNo, long pageSize) {
        long offset = (pageNo - 1) * pageSize;
        long rows = pageSize;
        List<TestDomain> testDomainList = testDao.listAll(offset, rows);
        long totalCount = testDao.count();
        return new PageDto<>(testDomainList, pageNo, pageSize, totalCount);
    }


}
