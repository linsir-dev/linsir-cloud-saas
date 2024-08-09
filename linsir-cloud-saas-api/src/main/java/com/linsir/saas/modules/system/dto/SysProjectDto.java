package com.linsir.saas.modules.system.dto;

import com.linsir.base.core.binding.query.BindQuery;
import com.linsir.base.core.binding.query.Comparison;
import lombok.Data;

/**
 * description:
 *
 * @author [linsir]
 * @version 0.0.1
 * @date 2022/08/08 16:00:52
 */

@Data
public class SysProjectDto {
    // 无@BindQuery注解默认会映射为=条件；主表的相等条件无需加注解
    @BindQuery(comparison = Comparison.EQ)
    private String type;
}
