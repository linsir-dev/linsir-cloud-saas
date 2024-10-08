package com.linsir.saas.modules.system.service.impl;

import cn.hutool.core.lang.Snowflake;
import cn.hutool.core.util.IdUtil;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.linsir.base.core.service.impl.BaseServiceImpl;
import com.linsir.base.core.util.BeanUtils;
import com.linsir.base.core.util.D;
import com.linsir.saas.modules.system.dto.RegisterSystenantDTO;
import com.linsir.saas.modules.system.entity.SysTenant;
import com.linsir.saas.modules.system.entity.SysTenantExt;
import com.linsir.saas.modules.system.entity.SysTenantExtBusiness;
import com.linsir.saas.modules.system.entity.SysTenantExtWeb;
import com.linsir.saas.modules.system.mapper.SysTenantMapper;
import com.linsir.saas.modules.system.service.SysTenantExtBusinessService;
import com.linsir.saas.modules.system.service.SysTenantExtService;
import com.linsir.saas.modules.system.service.SysTenantExtWebService;
import com.linsir.saas.modules.system.service.SysTenantService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.Date;

/**
 * @author admin
 * @version 1.0.0
 * @ClassName SysTenantServiceImpl.java
 * @Description 增删 改查
 * @createTime 2022年07月18日 17:32:00
 */
@Service
@Transactional
public class SysTenantServiceImpl extends BaseServiceImpl<SysTenantMapper, SysTenant> implements SysTenantService {


    @Autowired
    private SysTenantExtService sysTenantExtService;

    @Autowired
    private SysTenantExtWebService sysTenantExtWebService;

    @Autowired
    private SysTenantExtBusinessService sysTenantExtBusinessService;

    /**
     * @description 自动生成 租户编码，租户编码成为系统租户唯一 标识，具有逻辑意义
     * @author Linsir
     * @param
     * @return java.lang.String
     * @time 2024/7/5 9:06
     */
    @Override
    public String generateCode() {
        Snowflake snowflake = IdUtil.createSnowflake(1, 1);
        return "ZHBM-"+snowflake.nextIdStr();
    }

    /**
     * @description 注册租户
     * @author Linsir
     * @param  registerSystenantDTO
     * @return boolean
     * @time 2024/7/5 12:20
     */
    @Override
    public boolean register(RegisterSystenantDTO registerSystenantDTO) {
        Date now = new Date();
        String addDay = D.convert2DateTimeString(D.addDays(now,14));
        SysTenant sysTenant =BeanUtils.convert(registerSystenantDTO,SysTenant.class);
        sysTenant.setTimeExpiration(addDay);
        return createEntity(sysTenant);
    }




    /**
     * @description 增加租户网站信息
     * @author Linsir
     * @param  sysTenantId, sysTenantExtWeb]
     * @return boolean
     * @time 2024/7/5 12:21
     */

    @Transactional
    @Override
    public boolean addExtWeb(Long sysTenantId, SysTenantExtWeb sysTenantExtWeb) {
        boolean result = false;
        if (sysTenantExtWebService.createEntity(sysTenantExtWeb)) {
            SysTenantExt sysTenantExt = new SysTenantExt();
            sysTenantExt.setTenantId(sysTenantId);
            sysTenantExt.setType("web");
            sysTenantExt.setExtId(sysTenantExtWeb.getId());
            sysTenantExtService.createEntity(sysTenantExt);
            result = true;
        }
        return result;
    }

    /**
     * @description 完善 商务相关信息
     * @author Linsir
     * @param  sysTenantId, sysTenantExtBusiness]
     * @return boolean
     * @time 2024/7/5 14:47
     */
    @Override
    public boolean addExtBusiness(Long sysTenantId, SysTenantExtBusiness sysTenantExtBusiness) {
        boolean result = false;
        if (sysTenantExtBusinessService.createEntity(sysTenantExtBusiness)) {
            SysTenantExt sysTenantExt = new SysTenantExt();
            sysTenantExt.setTenantId(sysTenantId);
            sysTenantExt.setType("business");
            sysTenantExt.setExtId(sysTenantExtBusiness.getId());
            sysTenantExtService.createEntity(sysTenantExt);
            result = true;
        }
        return result;
    }


    @Transactional
    @Override
    public boolean delTenantAndRelated(Long sysTenantId) {
        QueryWrapper<SysTenantExt> queryWrapper = new QueryWrapper<>();
        queryWrapper.eq("tenant_id", sysTenantId);
        sysTenantExtService.getEntityList(queryWrapper).forEach(ext->{
            switch (ext.getType()){
                    case "web":
                        sysTenantExtWebService.deleteEntity(ext.getExtId());
                        break;
                    case "business":
                        sysTenantExtBusinessService.deleteEntity(ext.getExtId());
                        break;
            }
        });
        return deleteEntityAndRelatedEntities(sysTenantId,SysTenantExt.class,SysTenantExt::setTenantId);
    }
}

