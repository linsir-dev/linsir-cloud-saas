package com.linsir.saas.modules.system.service;

import com.linsir.base.core.service.BaseService;
import com.linsir.base.core.vo.results.R;
import com.linsir.saas.modules.system.entity.SysTenant;
import com.linsir.saas.modules.system.entity.SysTenantExtBusiness;
import com.linsir.saas.modules.system.entity.SysTenantExtWeb;

/**
 * @author ：linsir
 * @date ：Created in 2022/6/2 17:03
 * @description：租户接口
 * @modified By：
 * @version: 0.0.1
 */
public interface SysTenantService extends BaseService<SysTenant> {

    /**
     * 自动生成租户编码
     * @return
     */
    String generateCode();

    boolean register(SysTenant sysTenant);

    boolean addSysTenant(SysTenant sysTenant);

    boolean addExtWeb(Long sysTenantId, SysTenantExtWeb sysTenantExtWeb);

    boolean addExtBusiness(Long sysTenantId, SysTenantExtBusiness sysTenantExtBusiness);

    R delSysTenant(Long sysTenantId);

}
