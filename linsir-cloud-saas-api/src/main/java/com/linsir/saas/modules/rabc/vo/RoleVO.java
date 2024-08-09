package com.linsir.saas.modules.rabc.vo;


import com.linsir.saas.modules.rabc.entity.Role;
import com.linsir.saas.modules.rabc.entity.RoleResource;
import com.linsir.base.core.binding.annotation.BindCount;
import lombok.Data;



/**
 * @author: Administrator
 * @date: 2022/2/14 11:56
 * @description:
 */
@Data
public class RoleVO extends Role {
    private String roleGroupName;

   /* @BindEntityList(entity = SysResource.class,condition = "this.id=role_resource.role_id AND role_resource.resource_id=id")
    private List<SysResource> sysResourceList;*/

    @BindCount(entity = RoleResource.class,condition = "this.id = role_id")
    private Integer roleResourceCount;
}
