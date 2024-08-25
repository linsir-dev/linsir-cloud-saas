package com.linsir.saas.modules.system.dto;

import com.linsir.saas.modules.system.entity.SysTenant;
import lombok.Data;

/**
 * @author linsir
 * @version 1.0.0
 * @title TenantPageQuery
 * @description
 * @create 2024/8/25 14:14
 */

@Data
public class TenantPageQuery extends SysTenant {

    private String keywords;

    private long pageNum;

    private long pageSize;
}
