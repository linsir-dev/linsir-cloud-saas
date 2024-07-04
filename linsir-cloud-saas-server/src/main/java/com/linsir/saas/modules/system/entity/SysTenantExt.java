package com.linsir.saas.modules.system.entity;

import com.baomidou.mybatisplus.annotation.TableName;
import com.linsir.base.core.entity.AbstractEntity;
import lombok.Data;

/**
 * @ProjectName: linsir
 * @Package: com.linsir.saas.modules.system.entity
 * @ClassName: SysTenantExt
 * @Description: 租户扩展信息关联
 * @Author:Linsir
 * @CreateDate: 2022/9/30 14:22
 * @UpdateDate: 2022/9/30 14:22
 * @Version: 0.0.1
 */
@Data
@TableName("sys_tenant_ext")
public class SysTenantExt extends AbstractEntity<Long> {

    private Long tenantId;

    private String type;

    private Long extId;
}
