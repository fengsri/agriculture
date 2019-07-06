package com.xhu.agriculture.web.controller;

import com.xhu.agriculture.service.TestService;
import com.xhu.agriculture.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * @Description 基本的Controller
 * @Author fengwen
 * @Date 2019/7/4 10:27
 * @Version V1.0
 */
public class BaseController {

    /**
     * 统一管理Controller
     */
    @Autowired
    UserService userService;

    @Autowired
    TestService testService;

}
