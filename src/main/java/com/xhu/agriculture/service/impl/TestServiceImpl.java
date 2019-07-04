package com.xhu.agriculture.service.impl;


import com.xhu.agriculture.repository.TestDomain;
import com.xhu.agriculture.service.BaseService;

/**
 * @Description 测试的TestServiceImpl
 * @Author fengwen
 * @Date 2019/7/3 15:53
 * @Version V1.0
 */
public class TestServiceImpl extends BaseServiceImpl<TestDomain> implements BaseService<TestDomain> {

    /**
     * id查询
     * @param id
     * @return
     */
    @Override
    public TestDomain findById(Integer id) {
        return null;
    }

    /**
     * id删除
     * @param id
     */
    @Override
    public void deleteById(Integer id) {

    }

    /**
     * 修改
     * @param testDomain
     */
    @Override
    public void update(TestDomain testDomain) {

    }

    /**
     * 插入
     * @param testDomain
     */
    @Override
    public void insert(TestDomain testDomain) {

    }
}
