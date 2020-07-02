package com.lsk.spring.boot.autoconfigure;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.condition.ConditionalOnWebApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @Author: 李世宽
 * @Email: 18135757181@163.com
 * @Date: 2020/5/16 22:27
 */
@ConditionalOnWebApplication
@Configuration
@EnableConfigurationProperties(HelloProperties.class)
public class HelloAutoConfigration {

    @Autowired
    private HelloProperties helloProperties;

    @Bean
    public HelloService getHelloService() {
        HelloService helloService = new HelloService();
        helloService.setHelloProperties(helloProperties);
        return helloService;
    }
}
