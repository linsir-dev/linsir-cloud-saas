package com.linsir.saas.modules.system.vo;


import com.linsir.base.core.binding.annotation.BindField;
import com.linsir.saas.modules.system.entity.SysBaseArea;
import com.linsir.saas.modules.system.entity.SysBaseCountry;
import lombok.Data;

import java.util.List;

/**
 * description:
 *
 * @author [linsir]
 * @version 0.0.1
 * @date 2022/08/31 10:23:14
 */
@Data
public class SysBaseAreaVO extends SysBaseArea {
    @BindField(entity = SysBaseCountry.class,field = "name",condition = "this.country_id = id")
    private String country;

    private List<SysBaseAreaVO> children;
}
