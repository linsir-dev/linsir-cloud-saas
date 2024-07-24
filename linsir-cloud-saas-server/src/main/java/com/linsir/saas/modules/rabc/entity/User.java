package com.linsir.saas.modules.rabc.entity;

/**
 * @author Administrator
 * @title: Account
 * @projectName lins
 * @description: 账号
 * @date 2021/12/17 12:45
 *
 */

import com.baomidou.mybatisplus.annotation.TableName;
import com.linsir.base.core.entity.BaseEntity;
import lombok.Data;
import lombok.EqualsAndHashCode;

@EqualsAndHashCode(callSuper = true)
@Data
@TableName("user")
public class User extends BaseEntity {

    private String account;

   /* private String password;*/

    private int type;

    /*过期时间*/
   /* private String timeExpiration;

    private boolean isAccountNonExpired;

    private boolean isAccountNonLocked;

    private boolean isCredentialsNonExpired;

    private boolean isEnabled;*/

}
