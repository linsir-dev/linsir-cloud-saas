package com.linsir.saas.modules.system.controller;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.linsir.base.core.controller.BaseController;
import com.linsir.base.core.vo.jsonResults.JsonResult;
import com.linsir.base.core.vo.results.R;
import com.linsir.saas.modules.system.entity.SysResource;
import com.linsir.saas.modules.system.service.MenuService;
import com.linsir.saas.modules.system.service.SysResourceService;
import com.linsir.saas.modules.system.service.impl.SysResourceServiceImpl;
import com.linsir.saas.modules.system.vo.MenuVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

/**
 * description: 菜单
 *
 * @author [linsir]
 * @version 0.0.1
 * @date 2022/09/01 11:53:27
 */
@RestController
@RequestMapping("/menu/")
public class MenuController extends BaseController {

    @Autowired
    private SysResourceService sysResourceService;

    @Autowired
    private MenuService menuService;

    /**
     * 获取菜单
     * @param userId
     * @return
     * @throws Exception
     */
    @GetMapping("get/{userId}")
    public R getByUserId(@PathVariable("userId") Long userId) throws Exception {
        return exec("根据用户id获取菜单",()->{
            MenuVO menuVO = sysResourceService.getByUser(userId);
            return JsonResult.OK(menuVO);
        });
    }

    @GetMapping("getMenuList")
    public R getMenuList() throws Exception {
        return exec("获取菜单",()->{
            QueryWrapper<SysResource> queryWrapper = new QueryWrapper<>();
            queryWrapper.eq("app_id",1);
            queryWrapper.eq("type","menu");
            queryWrapper.orderByAsc("sort");
           return JsonResult.OK(sysResourceService.getSysResourceVOTreeList(queryWrapper));
        });
    }


    /**********************************************************************************************************/

    /**
     * @description 根据id 获取 菜单
     * @author Linsir
     * @param  appId
     * @return com.linsir.base.core.vo.results.R
     * @time 2024/8/24 9:56
     */
    @GetMapping("getMenusByAppId/{appId}")
    public R getMenusByAppId(@PathVariable("appId") String appId) throws Exception {
        return exec("按照AppId获取菜单",()->{
           return menuService.getMenusByAppId(appId);
        });
    }


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
