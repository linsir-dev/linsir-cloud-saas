package com.linsir.saas.modules.system.controller;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
/*
import com.linsir.cloud.saas.api.dto.system.SysTenantDto;
*/
/*import com.linsir.core.controller.BaseCrudRestController;
import com.linsir.core.vo.R;
import com.linsir.core.vo.Pagination;
import com.linsir.core.vo.Result;
import com.linsir.core.vo.jsonResults.*;
import com.linsir.logRecord.annotation.OperationLog;*/
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
public class SysTenantController /*extends BaseCrudRestController<SysTenant>*/ {

    @Autowired
    private SysTenantService sysTenantService;

    @Autowired
    private SysTenantExtWebService sysTenantExtWebService;


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


    *//***
    * @Description: 添加租户
    * @Param: [sysTenant]
    * @return: com.linsir.core.vo.jsonResults.ResResult
    * @Author: linsir
    * @Date: 2022/9/23 0:55
    *//*
    @OperationLog(bizId = "#tenant.tenantCode",bizType = "'add'",msg = "'租户'+ #tenant + '添加'")
    @PostMapping("add")
    public ResResult add(SysTenant tenant) throws Exception {
        R result = null;
        result = exec("添加租户",()->{
            sysTenantService.createEntity(tenant);
            System.out.println(tenant.getId());
            return Result.SUCCESS();
        });
        return new ResResult<>(result);
    }

    *//**
     * @Author linsir
     * @Description 删除租户
     * @Date 14:04 2022/9/23
     * @Param [tenantId]
     * @return com.linsir.core.vo.jsonResults.ResResult
     **//*
    @OperationLog(bizId = "#tenantId",bizType = "'del'",msg = "'删除租户'+#tenantId")
    @DeleteMapping("del")
    public ResResult del(Long tenantId) throws Exception {
        R result = null;
        result = exec("删除租户",()->{
            sysTenantService.deleteEntity(tenantId);
            return Result.SUCCESS();
        });
        return  new ResResult<>(result);
    }

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

    *//**
     * @Author linsir
     * @Description  自动生成 租户编码
     * @Date 23:27 2022/9/13
     * @Param []
     * @return java.lang.String
     **//*
    @GetMapping("generateCode")
    public String generateCode()
    {
       return sysTenantService.generateCode();
    }*/
}
