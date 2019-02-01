package com.alanagou.p2p.business.modules.test.feign;

import com.alanagou.p2p.business.modules.test.api.ITestController;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author alanagou
 * @Title: TestServiceFeign
 * @ProjectName com.alanagou.p2p.business
 * @Description: TODO
 * @date 2019/1/3116:23
 */
@FeignClient("app-test")
@RestController
public interface TestServiceFeign extends ITestController {
}
