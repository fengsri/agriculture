package com.xhu.agriculture.dao;

import com.xhu.agriculture.repository.TestDomain;
import com.xhu.agriculture.repository.User;
import org.hibernate.validator.constraints.Length;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;
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
public class UserDaoTest {

    @Autowired
    UserDao userDao;


    @Test
    public void insert(){
        User user = new User();
        user.setUserName("feng");
        user.setUserPassword("12345");
        user.setUserPhone(1366254402L);
        user.setUserIdcard("510921199601192813");
        user.setUserGrander(1);
        user.setUserBirthday(new Date(2019,7,3));
        user.setUserEmail("1477452395@qq.com");
        user.setUserHeaderPic("dsad");
        user.setUserDescription("test");
        user.setUserAddress("四川");
        user.setUserStatue(1);
        user.setUserTypeId(1);
        int result = userDao.insert(user);
        System.out.print(result);
    }

    @Test
    public void getById(){
        User user = userDao.getById(1000);
        System.out.print(user);
    }

    @Test
    public void update(){
        User user = new User();
        user.setId(1000);
        user.setUserName("wen");
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
        int result = userDao.update(user);
        System.out.print(result);
    }


    @Test
    public void delete(){
        int result = userDao.deleteById(1000);
        System.out.print(result);
    }


    @Test
    public void count(){
        Long result = userDao.count();
        System.out.print(result);
    }

    @Test
    public void listAll(){
        List<User> userList = userDao.listAll(0L, 1);
        System.out.print(userList);
    }

    @Test
    public void login(){
        User user = new User();
        user.setUserName("feng");
        user.setUserPassword("12345");
        User u = userDao.login(user);
        System.out.print(u);
    }

    @Test
    public void getByPhone(){
        User u = userDao.getByPhone(13666254402L);
        System.out.print(u);
    }

}
