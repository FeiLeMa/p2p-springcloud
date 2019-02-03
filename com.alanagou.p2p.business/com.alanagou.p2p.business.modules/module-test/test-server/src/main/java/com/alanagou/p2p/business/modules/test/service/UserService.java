package com.alanagou.p2p.business.modules.test.service;

import com.alanagou.p2p.business.core.common.response.ServerResponse;
import com.alanagou.p2p.business.modules.test.model.User;

/**
 * @author alanagou@aliyun.com
 * @Title: UserService
 * @ProjectName com.alanagou.p2p.business
 * @Description:
 * @date 2019/2/2  13:59
 */
public interface UserService {
    ServerResponse<User> getUsers();
}
