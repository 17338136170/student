package com.student.service.impl;


import com.student.entity.User;
import com.student.mapper.UserMapper;
import com.student.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author zhaohao
 * @since 2021-03-20
 */
@Service
public class UserServiceImpl  implements UserService {

    @Autowired
    UserMapper userMapper;
    @Override
    public Integer insertUser(String userName, String password) {
        User  user = User.builder().username(userName).password(password).build();
        Integer num=userMapper.insertUser(user);
        return  num;

    }
}
