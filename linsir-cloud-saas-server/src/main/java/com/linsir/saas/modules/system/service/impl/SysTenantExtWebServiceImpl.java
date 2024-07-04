package com.linsir.saas.modules.system.service.impl;

import com.linsir.base.core.code.BaseCode;
import com.linsir.base.core.exception.BusinessException;
import com.linsir.base.core.service.impl.BaseServiceImpl;
import com.linsir.saas.modules.system.entity.SysTenantExt;
import com.linsir.saas.modules.system.entity.SysTenantExtWeb;
import com.linsir.saas.modules.system.mapper.SysTenantExtWebMapper;
import com.linsir.saas.modules.system.service.SysTenantExtService;
import com.linsir.saas.modules.system.service.SysTenantExtWebService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 * @author ：linsir
 * @date ：Created in 2022/10/1 10:39
 * @description：
 * @modified By：
 * @version:
 */
@Service
public class SysTenantExtWebServiceImpl extends BaseServiceImpl<SysTenantExtWebMapper,SysTenantExtWeb> implements SysTenantExtWebService{

    @Autowired
    private SysTenantExtService sysTenantExtService;

    /***
    * @Description: 增加web扩展信息
    * @Param: [sysTenantId, sysTenantExtWeb]
    * @return: boolean
    * @Author: linsir
    * @Date: 2022/10/2 10:40
    */
    @Transactional
    @Override
    public boolean editExtWeb(Long sysTenantId, SysTenantExtWeb sysTenantExtWeb) {
        boolean result = false;
        try {
            createOrUpdateEntity(sysTenantExtWeb);
            Long extId = sysTenantExtWeb.getId();
            SysTenantExt sysTenantExt = new SysTenantExt();
            sysTenantExt.setTenantId(sysTenantId);
            sysTenantExt.setExtId(extId);
            sysTenantExtService.createEntity(sysTenantExt);
            result = true;
        }catch (Exception exception)
        {
            throw new  BusinessException(BaseCode.WARN_PARTIAL_SUCCESS);
        }
        return result;
    }
}
