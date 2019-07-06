package com.xhu.agriculture.dao;

import com.xhu.agriculture.repository.TestDomain;
import com.xhu.agriculture.repository.User;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.Date;
import java.util.List;

/**
 * @Description
 * @Author fengwen
 * @Date 2019/7/4 12:46
 * @Version V1.0
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations="classpath:spring/spring-*.xml")
public class TestDomainDaoTest {

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


    @Test
    public void update(){
        TestDomain testDomain = new TestDomain();
        testDomain.setId(1000);
        testDomain.setName("test");
        int result = testDao.update(testDomain);
        System.out.print(result);
    }


    @Test
    public void delete(){
        int result = testDao.deleteById(1000);
        System.out.print(result);
    }


    @Test
    public void count(){
        Long result = testDao.count();
        System.out.print(result);
    }

    @Test
    public void listAll(){
        List<TestDomain> userList = testDao.listAll(0L, 1);
        System.out.print(userList);
    }

}
