package com.linsir.saas.modules.datav.controller;

import com.linsir.base.core.controller.BaseController;
import com.linsir.base.core.vo.jsonResults.JsonResult;
import com.linsir.base.core.vo.results.R;
import com.linsir.saas.modules.datav.service.ScreenService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author linsir
 * @version 1.0.0
 * @title ScreenController
 * @description
 * @create 2024/8/22 14:28
 */

@RestController
@RequestMapping("/screen/")
public class ScreenController extends BaseController {

    @Autowired
    private ScreenService screenService;


    @GetMapping("getCoreAppStatus")
    public R getCoreAppStatus() throws Exception {
        return exec("获取核心app状态",()->{
            return JsonResult.OK(screenService.getCoreAppStatus());
        });
    }

    @GetMapping("getConfigPond")
    public R getConfigPond() throws Exception {
        return exec("获取核心getConfigPond状态",()->{
            return JsonResult.OK(screenService.getConfigPond());
        });
    }

    @GetMapping("getSystenantPonds")
    public R getSystenantPonds() throws Exception {
        return exec("获取getSystenantPonds状态",()->{
            return JsonResult.OK(screenService.getSystenantPonds());
        });
    }

    @GetMapping("getSystenantCount")
    public R getSystenantCount() throws Exception {
        return exec("获取核心getSystenantCount状态",()->{
            return JsonResult.OK(screenService.getSystenantCount());
        });
    }

    @GetMapping("getAppExCount")
    public R getAppExCount() throws Exception {
        return exec("获取getAppExCount状态",()->{
            return JsonResult.OK(screenService.getAppExCount());
        });
    }

    @GetMapping("getExStatus")
    public R getExStatus() throws Exception {
        return exec("获取getExStatus状态",()->{
            return JsonResult.OK(screenService.getExStatus());
        });
    }

    @GetMapping("getSystemStatus")
    public R getSystemStatus() throws Exception {
        return exec("获取getSystemStatus状态",()->{
            return JsonResult.OK(screenService.getSystemStatus());
        });
    }

    @GetMapping("getVisitorTrend")
    public R getVisitorTrend() throws Exception {
        return exec("获取getVisitorTrend状态",()->{
            return JsonResult.OK(screenService.getVisitorTrend());
        });
    }
}
