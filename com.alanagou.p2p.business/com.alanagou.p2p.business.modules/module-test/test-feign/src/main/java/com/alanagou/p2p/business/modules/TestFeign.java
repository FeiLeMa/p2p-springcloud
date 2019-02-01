package com.alanagou.p2p.business.modules;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

/**
 * @author alanagou
 * @Title: TestFeign
 * @ProjectName com.alanagou.p2p.business
 * @Description: TODO
 * @date 2019/1/3117:15
 */
@EnableFeignClients
@SpringBootApplication
public class TestFeign {
    public static void main(String[] args) {
        SpringApplication.run(TestFeign.class, args);
    }
}
