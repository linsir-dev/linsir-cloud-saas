package com.linsir.saas.modules.system.vo;

import com.linsir.base.core.binding.annotation.BindEntity;
import com.linsir.base.core.binding.annotation.BindField;
import com.linsir.saas.modules.system.entity.SysApplication;
import com.linsir.saas.modules.system.entity.SysMeta;
import com.linsir.saas.modules.system.entity.SysResource;
import lombok.Data;

import java.util.List;

/**
 * description:
 *
 * @author [linsir]
 * @version 0.0.1
 * @date 2022/08/31 18:46:41
 */

@Data
public class SysResourceVO extends SysResource {

    @BindEntity(entity = SysMeta.class,condition = "this.meta_id = id")
    private SysMeta meta;

    @BindField(entity = SysApplication.class,field ="name",condition = "this.app_id = id")
    private String applicationName;

    private List<SysResourceVO> children;
}
