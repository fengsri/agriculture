package com.xhu.agriculture.web.controller;


import com.google.code.kaptcha.impl.DefaultKaptcha;
import com.xhu.agriculture.comment.ResultUtil;
import com.xhu.agriculture.comment.ResultVo;
import com.xhu.agriculture.constant.SessionConstant;
import com.xhu.agriculture.enums.ErrorCodeEnum;
import com.xhu.agriculture.exception.BusinessException;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import javax.imageio.ImageIO;
import javax.servlet.ServletOutputStream;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.awt.image.BufferedImage;
import java.io.ByteArrayOutputStream;
import java.io.IOException;

/**
 * @Description 图片Controller
 * @Author chenlinghong
 * @Date 2019/4/21 21:28
 * @Version V1.0
 */
@Slf4j
@RestController
@RequestMapping(value = "/image")
public class ImageController{

    /* 注入Kaptcha */
    @Autowired
    private DefaultKaptcha defaultKaptcha;

    /**
     * 获取图像验证码
     *
     * @param request
     * @param response
     * @return
     */
    @RequestMapping(value = "/code",method = RequestMethod.GET)
    public void defaultKaptcha(HttpServletRequest request, HttpServletResponse response) {
        byte[] captchaChallengeAsJpeg;
        ByteArrayOutputStream jpegOutputStream = new ByteArrayOutputStream();
        /**
         * 生成验证码字符串并保存到session中
         * TODO 后期改为写入redis
         */
        String createText = defaultKaptcha.createText();
        HttpSession session = request.getSession();
        session.setAttribute(SessionConstant.IMAGE_CODE, createText);
        /**
         * 使用生成的验证码字符串返回一个BufferedImage对象并转为byte写入到byte数组中
         */
        BufferedImage challenge = defaultKaptcha.createImage(createText);
        try {
            ImageIO.write(challenge, "jpg", jpegOutputStream);
        } catch (IOException e) {
            log.error("ImageController#defaultKaptcha: 输出验证码失败， e={}. ", e);
            throw new BusinessException(ErrorCodeEnum.CRATE_IMAGE_ERROR);    // 抛出异常，可以不用关心
        }
        /**
         * 定义response输出类型为image/jpeg类型，使用response输出流输出图片的byte数组
         */
        captchaChallengeAsJpeg = jpegOutputStream.toByteArray();
        response.setHeader("Cache-Control", "no-store");
        response.setHeader("Pragma", "no-cache");
        response.setDateHeader("Expires", 0);
        response.setContentType("image/jpeg");
        try {
            ServletOutputStream servletOutputStream = response.getOutputStream();
            servletOutputStream.write(captchaChallengeAsJpeg);
            servletOutputStream.flush();
            servletOutputStream.close();
        } catch (IOException e) {
            log.error("ImageController#defaultKaptcha: 输出验证码失败， e={}. ", e);
            throw new BusinessException(ErrorCodeEnum.CRATE_IMAGE_ERROR);    // 抛出异常，可以不用关心
        }
        return;    // 返回成功提示信息
    }

}
