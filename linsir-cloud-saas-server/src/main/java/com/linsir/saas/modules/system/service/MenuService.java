package com.linsir.saas.modules.system.service;

import com.linsir.base.core.vo.results.R;

/**
 * @author linsir
 * @version 1.0.0
 * @title MenuService
 * @description
 * @create 2024/8/24 8:49
 */


public interface MenuService {

    /**
     * @description 根据appId 获取菜单
     * @author Linsir
     * @param  appId
     * @return com.linsir.base.core.vo.results.R
     * @time 2024/8/24 8:51
     */
    R getMenusByAppId(String appId);

}
