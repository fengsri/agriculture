package com.xhu.agriculture.service.impl;


import com.xhu.agriculture.enums.ErrorCodeEnum;
import com.xhu.agriculture.exception.BusinessException;
import com.xhu.agriculture.repository.TestDomain;
import com.xhu.agriculture.service.BaseService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

/**
 * @Description 测试的TestServiceImpl
 * @Author fengwen
 * @Date 2019/7/3 15:53
 * @Version V1.0
 */
@Service
@Slf4j
public class TestServiceImpl extends BaseServiceImpl<TestDomain> implements BaseService<TestDomain> {

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
        TestDomain testDomain = testDao.getById(id);

        //3、对返回的数据检验
        if (testDomain == null) {
            log.error("TestServiceImpl#TestDomain: data is null, id={}.", id);
            throw new BusinessException(ErrorCodeEnum.DATA_NULL_ERROR);
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
        return true;
    }

    /**
     * 插入
     * @param testDomain
     */
    @Override
    public boolean insert(TestDomain testDomain) {
        return true;
    }
}
