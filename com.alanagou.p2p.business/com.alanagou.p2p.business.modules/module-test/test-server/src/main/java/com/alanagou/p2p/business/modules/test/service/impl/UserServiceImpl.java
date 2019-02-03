package com.alanagou.p2p.business.modules.test.service.impl;

import com.alanagou.p2p.business.core.common.response.ServerResponse;
import com.alanagou.p2p.business.modules.test.mapper.UserMapper;
import com.alanagou.p2p.business.modules.test.model.User;
import com.alanagou.p2p.business.modules.test.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author alanagou@aliyun.com
 * @Title: UserServiceImpl
 * @ProjectName com.alanagou.p2p.business
 * @Description:
 * @date 2019/2/2  14:00
 */
@Service
public class UserServiceImpl implements UserService {
    @Autowired
    private UserMapper userMapper;
    @Override
    public ServerResponse<User> getUsers() {
        User user = userMapper.selectByPrimaryKey(1);


        return ServerResponse.createBySuccess(user);
    }
}
