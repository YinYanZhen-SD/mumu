package com.icloud.mumu.system.service.impl;

import com.icloud.mumu.system.entity.User;
import com.icloud.mumu.system.mapper.UserMapper;
import com.icloud.mumu.system.service.IUserService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author yinyanzhen
 * @since 2019-12-20
 */
@Service
public class UserServiceImpl extends ServiceImpl<UserMapper, User> implements IUserService {

}
