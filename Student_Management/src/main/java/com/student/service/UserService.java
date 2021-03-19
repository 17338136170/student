package com.student.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.student.entity.User;
import org.apache.ibatis.annotations.Param;

/**
 * <p>
 *  服务类
 * </p>
 *
 * @author zhaohao
 * @since 2021-03-20
 */
public interface UserService {
    /**
     * 注册用户
     * @param userNmae
     * @param password
     */
    Integer insertUser(@Param(value = "userNmae") String userNmae, @Param(value = "password") String password);
}
