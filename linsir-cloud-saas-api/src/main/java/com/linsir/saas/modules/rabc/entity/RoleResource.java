package com.linsir.saas.modules.rabc.entity;

import com.baomidou.mybatisplus.annotation.TableName;
import com.linsir.base.core.entity.BaseEntity;
import lombok.Data;

/**
 * @author ：linsir
 * @date ：Created in 2022/9/2 23:30
 * @description：角色资源关系
 * @modified By：
 * @version: 0.0.1
 */
@Data
@TableName("role_resource")
public class RoleResource extends BaseEntity {

    private Long roleId;

    private Long resourceId;
}
