package com.student.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.student.entity.User;
import org.apache.ibatis.annotations.Param;

/**
 * <p>
 * Mapper 接口
 * </p>
 *
 * @author zhaohao
 * @since 2021-03-20
 */
public interface UserMapper extends BaseMapper<User> {

    Integer insertUser( User user);

    Integer login(User user);

    Integer isExists(String username);
}
