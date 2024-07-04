package com.linsir.saas.modules.system.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.linsir.saas.modules.system.entity.SysAuthClient;

/**
 * @author Administrator
 * @title: AuthClientService
 * @projectName lins
 * @description:
 * @date 2022/1/17 14:48
 */
public interface AuthClientService extends IService<SysAuthClient> {
    SysAuthClient getOAuth2ClientById(String client);
}
