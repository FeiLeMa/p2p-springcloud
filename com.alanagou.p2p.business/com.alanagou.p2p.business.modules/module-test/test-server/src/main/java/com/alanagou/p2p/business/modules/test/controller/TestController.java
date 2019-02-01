package com.alanagou.p2p.business.modules.test.controller;

import com.alanagou.p2p.business.modules.test.api.ITestController;
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

    @RequestMapping("index")
    @Override
    public Map<String, Object> index() {
        Map map = new HashMap();
        map.put("code", 200);
        map.put("Msg", "niubi");
        return map;
    }
}
