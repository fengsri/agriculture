package com.xhu.agriculture.web.controller;

import com.xhu.agriculture.comment.ResultVo;
import com.xhu.agriculture.repository.User;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @Description
 * @Author fengwen
 * @Date 2019/7/4 10:27
 * @Version V1.0
 */
@Controller
@RequestMapping(value = "user")
public class UserController extends BaseController {

    @RequestMapping(value = "login")
    @ResponseBody
    public ResultVo login(User user){

        return null;
    }

}
