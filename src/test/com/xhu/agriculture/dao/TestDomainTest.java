package com.xhu.agriculture.dao;

import com.xhu.agriculture.repository.TestDomain;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 * @Description
 * @Author fengwen
 * @Date 2019/7/4 12:46
 * @Version V1.0
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations="classpath:spring/spring-*.xml")
public class TestDomainTest {

    @Autowired
    TestDao testDao;

    @Test
    public void getById(){
        TestDomain testDomain = testDao.getById(1000);
        System.out.print(testDomain);
    }

    @Test
    public void insert(){
        TestDomain testDomain = new TestDomain("test1");
        int result = testDao.insert(testDomain);
        System.out.print(result);
    }

}
