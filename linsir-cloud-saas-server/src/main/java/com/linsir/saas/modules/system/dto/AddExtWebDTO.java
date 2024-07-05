package com.linsir.saas.modules.system.dto;

import com.linsir.saas.modules.system.entity.SysTenantExtWeb;
import lombok.Data;

/**
 * @author linsir
 * @version 1.0.0
 * @title AddExtWebDTO
 * @description
 * @create 2024/7/5 14:13
 */


@Data
public class AddExtWebDTO {

    private Long sysTenantId;

    private SysTenantExtWeb sysTenantExtWeb;
}
