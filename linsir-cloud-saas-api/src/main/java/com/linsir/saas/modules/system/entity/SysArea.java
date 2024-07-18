package com.linsir.saas.modules.system.entity;

import com.baomidou.mybatisplus.annotation.TableName;
import com.linsir.base.core.entity.AbstractEntity;
import com.linsir.base.core.entity.BaseEntity;
import lombok.Data;

/**
 * description: 系统区域规划
 *
 * @author [linsir]
 * @version 0.0.1
 * @date 2022/08/25 12:39:27
 */

@TableName("sys_area")
@Data
public class SysArea extends AbstractEntity<Long> {

    private String label;

    private String code;

    private Long parentId;
}
