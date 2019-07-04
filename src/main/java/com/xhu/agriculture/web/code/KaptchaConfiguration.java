package com.xhu.agriculture.web.code;

import com.google.code.kaptcha.impl.DefaultKaptcha;
import com.google.code.kaptcha.util.Config;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;

import javax.annotation.Resource;
import java.util.Properties;

/**
 * @Description Kaptcha配置类 用于生成图形验证码
 * @Author chenlinghong
 * @Date 2019/1/25 10:31
 **/
@Component
@PropertySource(value = "classpath:code.properties")
public class KaptchaConfiguration {

    @Value("${kaptcha.border}")
    private String border;


    @Value("${kaptcha.textproducer.font.color}")
    private String textproducerFontColor;

    @Value("${kaptcha.textproducer.font.size}")
    private String textproducerFontSize;

    @Value("${kaptcha.textproducer.font.names}")
    private String textproducerFontNames;

    @Value("${kaptcha.textproducer.char.length}")
    private String textproducerCharLength;

    @Value("${kaptcha.image.width}")
    private String imageWidth;

    @Value("${kaptcha.image.height}")
    private String imageHeight;

    @Value("${kaptcha.session.key}")
    private String sessionKey;

    @Bean
    public DefaultKaptcha getDefaultKapcha() {
        DefaultKaptcha defaultKaptcha = new DefaultKaptcha();
        Properties properties = new Properties();
        properties.setProperty("kaptcha.border", border);
        properties.setProperty("kaptcha.border.color","105,179,90");
        properties.setProperty("kaptcha.textproducer.font.color", textproducerFontColor);
        properties.setProperty("kaptcha.textproducer.font.size", textproducerFontSize);
        properties.setProperty("kaptcha.textproducer.font.names", textproducerFontNames);
        properties.setProperty("kaptcha.textproducer.char.length", textproducerCharLength);
        properties.setProperty("kaptcha.image.width", imageWidth);
        properties.setProperty("kaptcha.image.height", imageHeight);
        properties.setProperty("kaptcha.session.key", sessionKey);

        Config config = new Config(properties);
        defaultKaptcha.setConfig(config);
        return defaultKaptcha;
    }

}
