package com.student.entity;

import com.baomidou.mybatisplus.annotation.IdType;

import java.util.Date;

import com.baomidou.mybatisplus.annotation.TableId;
import lombok.*;

/**
 * <p>
 *
 * </p>
 *
 * @author zhaohao
 * @since 2021-03-20
 */
@Data
@Builder
@NoArgsConstructor // 无参构造函数
@AllArgsConstructor // 有参构造函数

@EqualsAndHashCode()
public class User {

    private static final long serialVersionUID = 1L;
    public static Object UserBuilder;

    @TableId(value = "userid", type = IdType.AUTO)
    private Integer userid;

    private String username;

    private String password;

    private Date updatetime;


}
