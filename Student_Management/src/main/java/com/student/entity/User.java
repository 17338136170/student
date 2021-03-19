package com.student.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import java.util.Date;
import com.baomidou.mybatisplus.annotation.TableId;
import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * <p>
 *
 * </p>
 *
 * @author zhaohao
 * @since 2021-03-20
 */
@Data
@EqualsAndHashCode()
public class User  {

private static final long serialVersionUID = 1L;

@TableId(value = "userid", type = IdType.AUTO)
private Integer userid;

private String username;

private String password;

private Date updatetime;


        }
