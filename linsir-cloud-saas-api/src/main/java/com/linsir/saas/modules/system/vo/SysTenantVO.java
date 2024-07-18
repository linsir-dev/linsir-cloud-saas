package com.linsir.saas.modules.system.vo;

import com.linsir.base.core.binding.annotation.BindEntity;
import com.linsir.base.core.binding.annotation.BindFieldList;
import com.linsir.saas.modules.system.entity.SysTenant;
import com.linsir.saas.modules.system.entity.SysTenantExt;
import com.linsir.saas.modules.system.entity.SysTenantExtBusiness;
import com.linsir.saas.modules.system.entity.SysTenantExtWeb;
import lombok.Data;

import java.util.List;

/**
 * @ProjectName: linsir
 * @Package: com.linsir.saas.modules.system.vo
 * @ClassName: SysTenantVO
 * @Description: 租户对象vo
 * @Author:Linsir
 * @CreateDate: 2022/9/26 15:36
 * @UpdateDate: 2022/9/26 15:36
 * @Version: 0.0.1
 */

@Data
public class SysTenantVO extends SysTenant {

    @BindEntity(entity = SysTenantExtWeb.class,condition = "this.id = sys_tenant_ext.tenant_id AND sys_tenant_ext.ext_id = id AND sys_tenant_ext.type = 'web'")
    private SysTenantExtWeb sysTenantExtWeb;

    @BindEntity(entity = SysTenantExtBusiness.class,condition = "this.id = sys_tenant_ext.tenant_id AND sys_tenant_ext.ext_id = id AND sys_tenant_ext.type = 'business'")
    private SysTenantExtBusiness sysTenantExtBusiness;

    @BindFieldList(entity = SysTenantExt.class,field = "type",condition = "this.id = sys_tenant_ext.tenant_id")
    private List<String> types;
}
