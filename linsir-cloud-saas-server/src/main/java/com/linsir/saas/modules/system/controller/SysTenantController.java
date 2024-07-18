package com.linsir.saas.modules.system.controller;


import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.linsir.base.core.controller.BaseCrudRestController;
import com.linsir.base.core.vo.jsonResults.JsonResult;
import com.linsir.base.core.vo.results.R;
import com.linsir.logRecord.annotation.OperationLog;
import com.linsir.saas.modules.system.dto.AddExtBusinessDTO;
import com.linsir.saas.modules.system.dto.AddExtWebDTO;
import com.linsir.saas.modules.system.dto.RegisterSystenantDTO;
import com.linsir.saas.modules.system.entity.SysTenant;
import com.linsir.saas.modules.system.service.SysTenantService;
import com.linsir.saas.modules.system.vo.SysTenantVO;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;


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
        /*
        * 这里可以做添加对象的逻辑判断
        * */
        return super.beforeCreate(entityOrDto);
    }


    /***
     * @Description:  基础创建 添加租户
     * @Param: [sysTenant]
     * @return: com.linsir.core.vo.jsonResults.ResResult
     * @Author: linsir
     * @Date: 2022/9/23 0:55
     */
    @OperationLog(bizId = "#sysTenant.tenantCode",bizType = "'create'",msg = "'租户'+ #sysTenant.name + '创建'")
    @PostMapping("create")
    public R create(@Valid @RequestBody SysTenant sysTenant) throws Exception {
        return exec("创建租户",()->{
            sysTenant.setTenantCode(sysTenantService.generateCode());
            return createEntity(sysTenant);
        });
    }

    /**
     * 删除租户，逻辑删除，不包含关联的
     * @param id
     * @return
     * @throws Exception
     */
    @OperationLog(bizId = "#id",bizType = "'delete'",msg = "'租户删除'")
    @DeleteMapping("del/{id}")
    public R delete(@PathVariable("id") Long id) throws Exception {
        return exec("删除租户",()->{
            return deleteEntity(id);
        });
    }

    /**
     * @description 更新租户
     * @author Linsir
     * @param  sysTenant
     * @return com.linsir.base.core.vo.results.R
     * @time 2024/7/7 13:25
     */
    @OperationLog(bizId = "#sysTenant.tenantCode",bizType = "'update'",msg = "'租户'+ #sysTenant.name + '更新'")
    @PutMapping("update")
    public R update(@Valid @RequestBody SysTenant sysTenant) throws Exception {
        return exec("更新租户",()->{
           return updateEntity(sysTenant.getId(),sysTenant);
        });
    }

    /**
     * @description 获取租户
     * @author Linsir
     * @param  id
     * @return com.linsir.base.core.vo.results.R
     * @time 2024/7/7 13:26
     */
    @OperationLog(bizId = "#id",bizType = "'get'",msg = "'租户获取'")
    @GetMapping("get/{id}")
    public R get(Long id) throws Exception {
        return exec("获取租户",()->{
            return JsonResult.OK(getEntity(id)) ;
        });
    }

    /**
     * 默认的查询，写在Entity里面
     * @param sysTenant
     * @return
     * @throws Exception
     */
    @OperationLog(bizId = "#sysTenant",bizType = "'list'",msg = "'租户默认列表'")
    @PostMapping("list")
    public R list(@Valid @RequestBody SysTenant sysTenant) throws Exception {
        QueryWrapper<SysTenant> queryWrapper = buildQueryWrapperByDTO(sysTenant);
        return getEntityList(queryWrapper);
    }


/*************************************以上是默认增删改查*******************************************************************************/

    /**
     * @description  添加网络信息
     * @author Linsir
     * @param
     * @return com.linsir.base.core.vo.results.R
     * @time 2024/7/5 12:39
     */
    @OperationLog(bizId = "#addExtWebDTO.sysTenantId",bizType = "'addExtWeb'",msg = "'租户网站'+ #addExtWebDTO.sysTenantExtWeb.title + '添加'")
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
    @OperationLog(bizId = "#addExtBusinessDTO.sysTenantId",bizType = "'addExtBusiness'",msg = "'租户商务'+ #addExtBusinessDTO.SysTenantExtBusiness.firmName + '添加'")
    @PostMapping("addExtBusiness")
    public R addExtBusiness(@RequestBody AddExtBusinessDTO addExtBusinessDTO) throws Exception {
        return exec("添加商务信息",()->{
            return new JsonResult(sysTenantService.addExtBusiness(addExtBusinessDTO.getSysTenantId(),addExtBusinessDTO.getSysTenantExtBusiness())) ;
        });
    }

    /**
     * @description 删除以及器关联  逻辑删除
     * @author Linsir
     * @param
     * @return com.linsir.base.core.vo.results.R
     * @time 2024/7/8 7:58
     */
    @OperationLog(bizId = "#sysTenant",bizType = "'delAndRelated'",msg = "'租户默认列表'")
    @DeleteMapping("delAndRelated/{id}")
    public R delAndRelated(Long id) throws Exception {
           return exec("关联删除",()->{
                return JsonResult.OK(sysTenantService.delTenantAndRelated(id));
            });
    }


    /**
     * @description 获取带关联的
     * @author Linsir
     * @param  id
     * @return com.linsir.base.core.vo.results.R
     * @time 2024/7/8 9:22
     */
    @OperationLog(bizId = "#id",bizType = "'getView'",msg = "'租户获取view'")
    @GetMapping("getView/{id}")
    public R getView(@PathVariable("id") Long id) throws Exception {
        return  exec("",()->{
            return getViewObject(id, SysTenantVO.class);
        });
    }



    /**
     * @description 注册用户，默认当前注册14天
     * @author Linsir
     * @param  registerSystenantDTO [sysTenant]
     * @return com.linsir.base.core.vo.results.R
     * @time 2024/7/5 11:26
     */
    @OperationLog(bizId = "#registerSystenantDTO.name",bizType = "#registerSystenantDTO.bizType",msg = "'租户'+ #registerSystenantDTO.name + '注册'")
    @PostMapping("register")
    public R register(@Valid @RequestBody RegisterSystenantDTO registerSystenantDTO) throws Exception {
        registerSystenantDTO.setBizType("register");
        return exec("注册住户",()->{
            return new JsonResult<SysTenant>(sysTenantService.register(registerSystenantDTO));
        });
    }























}
