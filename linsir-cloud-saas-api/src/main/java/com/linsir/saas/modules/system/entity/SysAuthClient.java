package com.linsir.saas.modules.system.entity;

import lombok.Data;

/**
 * @author Administrator
 * @title: AuthClient
 * @projectName lins
 * @description:
 * @date 2022/1/17 14:36
 */
@Data
public class SysAuthClient /*extends BaseSaaSEntity*/ {
    /*客户端ID*/
    private String clientId;

    /*客户端密钥*/
    private String clientSecret;

    /*客户端资源列表*/
    private String resourceIds;

    /*域*/
    private String scope;

    /*授权方式*/
    private String authorizedGrantTypes;

    /*回调地址*/
    private String webServerRedirectUri;

    /*权限列表*/
    private String authorities;

    /*认证令牌时效*/
    private Integer accessTokenValidity;

    /*刷新令牌时效*/
    private Integer refreshTokenValidity;

    /*扩展信息*/
    private String additionalInformation;

    /*是否自动放行*/
    private String autoApprove;
}
