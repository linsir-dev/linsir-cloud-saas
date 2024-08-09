package com.linsir.saas.modules.system.entity;

import com.baomidou.mybatisplus.annotation.TableName;
import com.linsir.base.core.entity.AbstractEntity;
import lombok.Data;

/**
 * description: 系统资源，一切开发的功能点，作为资源
 *
 * @author [linsir]
 * @version 0.0.1
 * @date 2022/08/26 17:37:17
 */

@Data
@TableName("sys_resource")
public class SysResource extends AbstractEntity<Long> {

    private String name;

    private String path;

    private String redirect;

    private Long appId;

    private Long metaId;

    private String type;

    private Long parentId;

    private String component;

    private int sort;

}
