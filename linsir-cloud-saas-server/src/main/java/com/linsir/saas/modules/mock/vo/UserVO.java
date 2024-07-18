package com.linsir.saas.modules.mock.vo;

import lombok.Data;

import java.util.List;

/**
 * @author linsir
 * @version 1.0.0
 * @title UserVO
 * @description
 * @create 2024/7/15 14:33
 */


@Data
public class UserVO {

    private String userId;

    private String token;

    private List<RoleVO> roles;
}
