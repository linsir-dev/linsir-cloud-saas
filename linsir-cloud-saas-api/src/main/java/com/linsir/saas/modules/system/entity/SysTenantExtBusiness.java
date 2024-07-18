package com.linsir.saas.modules.system.entity;

import com.baomidou.mybatisplus.annotation.TableName;
import com.linsir.base.core.entity.AbstractEntity;
import com.linsir.base.core.entity.BaseModel;
import lombok.Data;

/**
 * @ProjectName: linsir
 * @Package: com.linsir.saas.modules.system.entity
 * @ClassName: SysTenantExtBusiness
 * @Description: 租户信息，贡山商务信息扩展
 * @Author:Linsir
 * @CreateDate: 2022/9/23 16:28
 * @UpdateDate: 2022/9/23 16:28
 * @Version: 0.0.1
 */
@Data
@TableName("sys_tenant_ext_business")
public class SysTenantExtBusiness extends BaseModel {

    /*企业名称，更多是在合同上的甲方*/
    private String firmName;

    /*统一社会信用代码*/
    private String creditCode;

    /*法定代表人*/
    private String legalPerson;

    /*行政区划*/
    private String administrativeDivision;

    /*商务区划*/
    private String businessArea;

    /*商务负责人*/
    private String businessHead;

    /*开户账号*/
    private String openBankAccount;

    /*开户人*/
    private String bankAccountPerson;

    /*开户行*/
    private String openBank;

}
