package com.alanagou.p2p.business.modules.test.controller;

import com.alanagou.p2p.business.core.common.redis.RedisService;
import com.alanagou.p2p.business.core.common.response.ServerResponse;
import com.alanagou.p2p.business.modules.test.api.ITestController;
import com.alanagou.p2p.business.modules.test.model.User;
import com.alanagou.p2p.business.modules.test.service.UserService;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

/**
 * @author alanagou
 * @Title: TestController
 * @ProjectName com.alanagou.p2p.business
 * @Description: TODO
 * @date 2019/1/3116:33
 */
@RestController
@RequestMapping("test")
public class TestController implements ITestController {
    private Logger logger = LogManager.getLogger(TestController.class);
    @Autowired
    RedisService redisService;

    @Autowired
    private UserService userService;

    @RequestMapping("index")
    @Override
    public Map<String, Object> index() {
        logger.fatal("welcome index fatal");
        logger.error("welcome index error");
        logger.warn("welcome index warn");
        logger.info("welcome index info");
        logger.debug("welcome index debug");
        logger.trace("welcome index trace");
        Map map = new HashMap();
        map.put("code", 200);
        map.put("Msg", "niubi");
        return map;
    }

    @RequestMapping("getUser")
    @Override
    public ServerResponse<User> getUsers() {
        return userService.getUsers();
    }

    @RequestMapping("vredis")
    @Override
    public ServerResponse vRedis() {
        redisService.set("age1", 12);
        Object age = redisService.get("age1");

        return ServerResponse.createBySuccess(age);
    }


}
