package com.linsir.saas.modules.system.controller;

import com.linsir.base.core.controller.BaseController;
import com.linsir.base.core.vo.R;
import com.linsir.base.core.vo.Result;
import com.linsir.base.core.vo.jsonResults.ResResult;
import com.linsir.saas.modules.system.service.impl.SysResourceServiceImpl;
import com.linsir.saas.modules.system.vo.MenuVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * description: 菜单
 *
 * @author [linsir]
 * @version 0.0.1
 * @date 2022/09/01 11:53:27
 */
@RestController
@RequestMapping("/v1/menu/")
public class MenuController extends BaseController {

    @Autowired
    private SysResourceServiceImpl sysResourceService;

    /**
     * 超级管理员 菜单
     * @return
     *//*
    @GetMapping("/getByUser")
    public ResResult getByUser() throws Exception {
        R result = null;
        result = exec("获取菜单,",()->{
            MenuVO menuVO = sysResourceService.getByUser(1L);
            return Result.SUCCESS(menuVO);
        });

        return new ResResult<>(result);
    }*/

}
