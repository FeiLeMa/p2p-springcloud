package com.alanagou.p2p.business.modules;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

/**
 * @author alanagou
 * @Title: TestApp
 * @ProjectName com.alanagou.p2p.business
 * @Description: TODO
 * @date 2019/1/3116:31
 */
@SpringBootApplication
@EnableEurekaClient
@EnableFeignClients
public class TestApp {
    public static void main(String[] args) {
        SpringApplication.run(TestApp.class, args);
    }
}
