package com.linsir.saas.modules.system.dto;

import com.linsir.saas.modules.system.entity.SysTenantExtBusiness;
import lombok.Data;

/**
 * @author linsir
 * @version 1.0.0
 * @title addExtBusinessDTO
 * @description
 * @create 2024/7/5 15:16
 */


@Data
public class AddExtBusinessDTO {

    private Long sysTenantId;

    private SysTenantExtBusiness sysTenantExtBusiness;

}
