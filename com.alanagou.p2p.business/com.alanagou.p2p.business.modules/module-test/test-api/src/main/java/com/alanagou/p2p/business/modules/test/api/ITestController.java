package com.alanagou.p2p.business.modules.test.api;

import org.springframework.web.bind.annotation.RequestMapping;

import java.util.Map;

/**
 * @author alanagou
 * @Title: ITestController
 * @ProjectName com.alanagou.p2p.business
 * @Description: TODO
 * @date 2019/1/3116:21
 */
@RequestMapping("test")
public interface ITestController {

    @RequestMapping("index")
    public Map<String,Object> index();

}
