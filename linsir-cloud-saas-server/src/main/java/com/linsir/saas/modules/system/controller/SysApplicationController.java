package com.linsir.saas.modules.system.controller;


import com.linsir.base.core.controller.BaseCrudRestController;
import com.linsir.base.core.vo.results.R;
import com.linsir.saas.modules.system.entity.SysApplication;
import com.linsir.saas.modules.system.service.SysApplicationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author ：linsir
 * @date ：Created in 2022/8/27 10:17
 * @description：应用
 * @modified By：
 * @version: 0.0.1
 */
@RestController
@RequestMapping("/v1/sysApplication/")
public class SysApplicationController extends BaseCrudRestController<SysApplication> {



    @Autowired
    private SysApplicationService sysApplicationService;


    public R get()
    {
        return  null;
    }


}
