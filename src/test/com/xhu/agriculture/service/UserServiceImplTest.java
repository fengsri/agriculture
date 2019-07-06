package com.xhu.agriculture.service;

import com.xhu.agriculture.comment.PageDto;
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
 * @Date 2019/7/7 1:15
 * @Version V1.0
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations="classpath:spring/spring-*.xml")
public class UserServiceImplTest {
    @Autowired
    UserService userService;

    @Test
    public void insert(){
        User user = new User();
        user.setUserName("fengwen");
        user.setUserPassword("12345");
        user.setUserPhone(1366254404L);
        user.setUserIdcard("510921199601192813");
        user.setUserGrander(1);
        user.setUserBirthday(new Date(2019,7,3));
        user.setUserEmail("1477452395@qq.com");
        user.setUserHeaderPic("dsad");
        user.setUserDescription("test");
        user.setUserAddress("四川");
        user.setUserStatue(1);
        user.setUserTypeId(1);
        boolean result = userService.insert(user);
        System.out.print(result);
    }

    @Test
    public void getById(){
        User user = userService.findById(1000);
        System.out.print(user);
    }

    @Test
    public void update(){
        User user = new User();
        user.setId(1000);
        user.setUserName("gong");
        user.setUserPassword("123456");
        user.setUserPhone(1366254402L);
        user.setUserIdcard("510921199601192813");
        user.setUserGrander(1);
        user.setUserBirthday(new Date(2019,7,3));
        user.setUserEmail("1477452395@qq.com");
        user.setUserHeaderPic("test");
        user.setUserDescription("test");
        user.setUserAddress("四川");
        user.setUserStatue(1);
        user.setUserTypeId(1);
        boolean result = userService.update(user);
        System.out.print(result);
    }


    @Test
    public void delete(){
        boolean result = userService.deleteById(1000);
        System.out.print(result);
    }


    @Test
    public void count(){
        Long result = userService.count();
        System.out.print(result);
    }

    @Test
    public void listAll(){
        PageDto<User> userPageDto = userService.listAll(1L, 1);
        System.out.print(userPageDto);
    }

    @Test
    public void login(){
        User user = new User();
        user.setUserName("feng");
        user.setUserPassword("12345a");
        User u = userService.login(user);
        System.out.print(u);
    }

    @Test
    public void getByPhone(){
        User u = userService.getByPhone(1366254407L);
        System.out.print(u);
    }

}
