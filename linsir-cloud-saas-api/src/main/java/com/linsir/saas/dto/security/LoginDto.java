package com.linsir.saas.dto.security;

/**
 * description:
 * *******************************************************
 * <p>
 * 登录对象  *
 * ******************************************************
 *
 * @author: linsir
 * @version: 0.0.1  *
 * @date: 2023/4/1 11:43
 */
public class LoginDto {

    private String username;

    private String password;

    private String grantType;

    private String clientId;

    private String clientSecret;

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getPassword() {
        return password;
    }


    public String getGrantType() {
        return grantType;
    }

    public void setGrantType(String grantType) {
        this.grantType = grantType;
    }

    public String getClientId() {
        return clientId;
    }

    public void setClientId(String clientId) {
        this.clientId = clientId;
    }

    public String getClientSecret() {
        return clientSecret;
    }

    public void setClientSecret(String clientSecret) {
        this.clientSecret = clientSecret;
    }


}




