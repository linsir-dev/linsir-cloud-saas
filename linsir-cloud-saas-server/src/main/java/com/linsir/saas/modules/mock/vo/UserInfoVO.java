package com.linsir.saas.modules.mock.vo;

import lombok.Data;

import java.util.List;

/**
 * @author linsir
 * @version 1.0.0
 * @title UserInfo
 * @description
 * @create 2024/7/15 17:32
 */

@Data
public class UserInfoVO {

    private String userId;

    private String username;

    private String realName;

    private String avatar;

    private String  desc;

    private List<RoleVO> roles;
}
