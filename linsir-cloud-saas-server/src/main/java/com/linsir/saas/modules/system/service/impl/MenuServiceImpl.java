package com.linsir.saas.modules.system.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.linsir.base.core.vo.jsonResults.JsonResult;
import com.linsir.base.core.vo.results.R;
import com.linsir.saas.modules.system.entity.SysResource;
import com.linsir.saas.modules.system.service.MenuService;
import com.linsir.saas.modules.system.service.SysResourceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author linsir
 * @version 1.0.0
 * @title MenuServiceImpl
 * @description
 * @create 2024/8/24 8:56
 */

@Service
public class MenuServiceImpl implements MenuService {

    @Autowired
    private SysResourceService sysResourceService;

    @Override
    public R getMenusByAppId(String appId) {
        QueryWrapper<SysResource> queryWrapper = new QueryWrapper<SysResource>();
        queryWrapper.eq("app_id", appId);
        queryWrapper.eq("type", "menu");
        return JsonResult.OK(sysResourceService.getSysResourceVOTreeList(queryWrapper));
    }
}
