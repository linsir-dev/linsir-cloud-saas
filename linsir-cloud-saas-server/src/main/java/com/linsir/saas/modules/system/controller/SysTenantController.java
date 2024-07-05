package com.linsir.saas.modules.system.controller;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
/*
import com.linsir.cloud.saas.api.dto.system.SysTenantDto;
*/
/*import com.linsir.core.controller.BaseCrudRestController;
import com.linsir.core.vo.R;
import com.linsir.core.vo.Pagination;
import com.linsir.core.vo.Result;
import com.linsir.core.vo.jsonResults.*;*/

import com.linsir.base.core.controller.BaseCrudRestController;
import com.linsir.base.core.vo.jsonResults.JsonResult;
import com.linsir.base.core.vo.results.R;
import com.linsir.logRecord.annotation.OperationLog;
import com.linsir.saas.modules.system.dto.AddExtBusinessDTO;
import com.linsir.saas.modules.system.dto.AddExtWebDTO;
import com.linsir.saas.modules.system.entity.SysTenant;
import com.linsir.saas.modules.system.entity.SysTenantExtWeb;
import com.linsir.saas.modules.system.service.SysTenantExtWebService;
import com.linsir.saas.modules.system.service.SysTenantService;
import com.linsir.saas.modules.system.vo.SysTenantVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * @author admin
 * @version 1.0.0
 * @ClassName SysTenantController.java
 * @Description TODO
 * @createTime 2022年07月18日 17:57:00
 */
@RestController
@RequestMapping("/v1/sysTenant/")
public class SysTenantController extends BaseCrudRestController<SysTenant> {

    @Autowired
    private SysTenantService sysTenantService;

    /**
     * 验证添加前的 逻辑判断
     * @param entityOrDto
     * @return
     * @throws Exception
     */

    @Override
    protected String beforeCreate(SysTenant entityOrDto) throws Exception {
        return super.beforeCreate(entityOrDto);
    }


    /**
     * @description 注册用户，默认当前注册14天
     * @author Linsir
     * @param  sysTenant [sysTenant]
     * @return com.linsir.base.core.vo.results.R
     * @time 2024/7/5 11:26
     */
    @OperationLog(bizId = "#sysTenant.tenantCode",bizType = "'register'",msg = "'租户'+ #sysTenant.name + '注册'")
    @PostMapping("register")
    public R register(SysTenant sysTenant) throws Exception {
        return exec("注册住户",()->{
            return new JsonResult<SysTenant>(sysTenantService.register(sysTenant));
        });
    }


    /***
     * @Description: 添加租户
     * @Param: [sysTenant]
     * @return: com.linsir.core.vo.jsonResults.ResResult
     * @Author: linsir
     * @Date: 2022/9/23 0:55
     */
    @OperationLog(bizId = "#sysTenant.tenantCode",bizType = "'add'",msg = "'租户'+ #sysTenant.name + '添加'")
    @PostMapping("add")
    public R add(SysTenant sysTenant) throws Exception {
        return exec("添加租户",()->{
            return new JsonResult<SysTenant>(sysTenantService.addSysTenant(sysTenant));
        });
    }


    /**
     * @description  添加网络信息
     * @author Linsir
     * @param
     * @return com.linsir.base.core.vo.results.R
     * @time 2024/7/5 12:39
     */
    @OperationLog(bizId = "#addExtWebDTO.sysTenantId",bizType = "'add'",msg = "'租户网站'+ #addExtWebDTO.sysTenantExtWeb.title + '添加'")
    @PostMapping("addExtWeb")
    public R addExtWeb(@RequestBody AddExtWebDTO addExtWebDTO) throws Exception {
        return exec("添加网络信息",()->{
           return new JsonResult(sysTenantService.addExtWeb(addExtWebDTO.getSysTenantId(),addExtWebDTO.getSysTenantExtWeb()));
        });
    }

    /**
     * @description 添加商务信息
     * @author Linsir
     * @param  addExtBusinessDTO
     * @return com.linsir.base.core.vo.results.R
     * @time 2024/7/5 15:18
     */
    @OperationLog(bizId = "#addExtBusinessDTO.sysTenantId",bizType = "'add'",msg = "'租户商务'+ #addExtBusinessDTO.SysTenantExtBusiness.firmName + '添加'")
    @PostMapping("addExtBusiness")
    public R addExtBusiness(@RequestBody AddExtBusinessDTO addExtBusinessDTO) throws Exception {
        return exec("添加商务信息",()->{
           return new JsonResult(sysTenantService.addExtBusiness(addExtBusinessDTO.getSysTenantId(),addExtBusinessDTO.getSysTenantExtBusiness())) ;
        });
    }

    /**
     * @Author linsir
     * @Description 删除租户
     * @Date 14:04 2022/9/23
     * @Param [tenantId]
     * @return com.linsir.core.vo.jsonResults.ResResult
     **/
    @OperationLog(bizId = "#tenantId",bizType = "'del'",msg = "'删除租户'+#tenantId")
    @DeleteMapping("del")
    public R del(Long tenantId) throws Exception {
        R result = null;
        result = exec("删除租户",()->{
            sysTenantService.deleteEntity(tenantId);
            return JsonResult.OK();
        });
        return result;
    }



   /* *//**
     * 租户列表信息
     *
     * @return
     *//*
    @OperationLog(bizId = "'sys_tenant-001'",bizType = "'list'",msg = "'列表查询'")
    @RequestMapping(value = "list",method = {RequestMethod.GET})
    public ResResult list(SysTenantDto sysTenantDto, int page,int pageSize) throws Exception {
        R result = null;
        QueryWrapper queryWrapper = buildQueryWrapperByDTO(sysTenantDto);
        Pagination pagination = new Pagination(SysTenantVO.class);
        pagination.setPageIndex(page);
        pagination.setPageSize(pageSize);
        Summary summary = new Summary("11","xx");
             result = exec("租户信息列表查询",()->{
           List<SysTenantVO> sysTenantList = sysTenantService.getViewObjectList(queryWrapper,pagination,SysTenantVO.class);
           PageVO<SysTenantVO,Summary> pageVO = new PageVO<>(pagination,sysTenantList);
           return Result.SUCCESS(pageVO);
        });
       return new ResResult<>(result);
    }


    *


    */
    /*
    *//**
     * @Author linsir
     * @Description 更新租户信息
     * @Date 14:37 2022/9/26
     * @Param [sysTenant]
     * @return com.linsir.core.vo.jsonResults.ResResult
     **//*

    @OperationLog(bizId = "#sysTenant.id",bizType = "'edit'",msg = "'租户'+ #sysTenant + '修改'")
    @PostMapping("edit")
    public ResResult edit(SysTenant sysTenant) throws Exception {
        R result = null;
        result = exec("编辑租户信息",()->{
            if(sysTenantService.updateEntity(sysTenant))
            {
                return Result.SUCCESS();}
            else {
                return Result.FAIL_EXCEPTION("更新不成功");
            }
        });
        return new ResResult(result);
    }

    *//**
     * @Author linsir
     * @Description  获取租户
     * @Date 20:00 2022/9/26
     * @Param [sysTenantId]
     * @return com.linsir.core.vo.jsonResults.ResResult
     **//*
    @OperationLog(bizId = "#sysTenantId",bizType = "get",msg = "'获取租户信息'")
    @GetMapping("get")
    public ResResult get(Long sysTenantId) throws Exception {
        R result = null;
        result = exec("获取租户信息",()->{
            SysTenantVO sysTenantVO = sysTenantService.getViewObject(sysTenantId,SysTenantVO.class);
            return Result.SUCCESS(sysTenantVO);
        });
           return new ResResult(result);
    }

    *//***
    * @Description: 编辑web扩展信息
    * @Param: []
    * @return: com.linsir.core.vo.jsonResults.ResResult
    * @Author: linsir
    * @Date: 2022/10/2 9:57
    *//*
    @OperationLog(bizId = "#sysTenantId",bizType = "editExtWeb",msg = "'扩展租户的web信息'")
    @PostMapping("editExtWeb")
    public ResResult editExtWeb(Long sysTenantId,SysTenantExtWeb sysTenantExtWeb) throws Exception {
        R result = null;
        result =exec("添加web扩展信息",()->{
            sysTenantExtWebService.editExtWeb(sysTenantId,sysTenantExtWeb);
            return  Result.SUCCESS();
        });
       return  new ResResult(result);
    }

    */

    /**
     * @Author linsir
     * @Description  自动生成 租户编码
     * @Date 23:27 2022/9/13
     * @Param []
     * @return java.lang.String
     **/
    @GetMapping("generateCode")
    public String generateCode()
    {
       return sysTenantService.generateCode();
    }
}
