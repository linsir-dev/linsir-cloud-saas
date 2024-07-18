package com.linsir.saas.modules.system.controller;

import com.linsir.base.core.controller.BaseCrudRestController;
import com.linsir.base.core.vo.R;
import com.linsir.saas.modules.system.entity.SysApplication;
import com.linsir.saas.modules.system.service.impl.SysApplicationServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * description:
 * *******************************************************
 * <p>
 * v2  *
 * ******************************************************
 *
 * @author: linsir
 * @version: 0.0.1  *
 * @date: 2023/4/24 2:58
 */
@RestController
@RequestMapping("/v2/sysApplication/")
public class SysApplicationV2Controller extends BaseCrudRestController<SysApplication> {

    @Autowired
    private SysApplicationServiceImpl sysApplicationService;

//    @Resource
//    private IFillMetaImpl iFillMeta;

    /**
     * 应用比较少，因此获取全部的数据应用
     * @return
     * @throws Exception
     */
   /* @GetMapping("list")
    public R list() throws Exception {
        R result = null;
        result = exec("应用信息列表查询",()->{
            List<SysApplication> sysApplicationList = sysApplicationService.list();
            return Result.SUCCESS(sysApplicationList);
        });
        return result;
    }*/


    /**
     *   根据appId 获取应用
     * @param appId
     * @return
     */
    public R getByAppId(@PathVariable("appId") Long appId)
    {
        return  null;
    }
}
