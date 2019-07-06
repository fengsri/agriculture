package com.xhu.agriculture.service;

import com.xhu.agriculture.comment.PageDto;
import com.xhu.agriculture.repository.TestDomain;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.List;

/**
 * @Description
 * @Author fengwen
 * @Date 2019/7/7 1:15
 * @Version V1.0
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations="classpath:spring/spring-*.xml")
public class TestDomainServiceImplTest {
    @Autowired
    TestService testService;


    @Test
    public void getById(){
        TestDomain testDomain = testService.findById(1000);
        System.out.print(testDomain);
    }

    @Test
    public void insert(){
        TestDomain testDomain = new TestDomain("test3");
        boolean result = testService.insert(testDomain);
        System.out.print(result);
    }


    @Test
    public void update(){
        TestDomain testDomain = new TestDomain();
        testDomain.setId(1000);
        testDomain.setName("test222");
        boolean result = testService.update(testDomain);
        System.out.print(result);
    }


    @Test
    public void delete(){
        boolean result = testService.deleteById(1000);
        System.out.print(result);
    }


    @Test
    public void count(){
        Long result = testService.count();
        System.out.print(result);
    }

    @Test
    public void listAll(){
        PageDto<TestDomain> testDomainPageDto = testService.listAll(1, 3);
        System.out.print(testDomainPageDto);
    }


}
