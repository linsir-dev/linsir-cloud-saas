package com.linsir.saas.modules.rabc.service;


//import com.linsir.common.mp.dto.ParameterDto;

import com.linsir.saas.modules.rabc.entity.Role;
import com.linsir.base.core.service.BaseService;

/**
 * @author Administrator
 * @title: RoleService
 * @projectName lins
 * @description:
 * @date 2022/1/18 12:39
 */
public interface RoleService extends BaseService<Role> {

    /**
     * 根据账号id 获取角色
     * @param accountId
     * @return
     */
/*
    List<RoleDto> getRoleDtosByAccountId(Long accountId);
*/

    /**
     * 根据账号id 获取角色名称的字符串列表
     * @param accountId
     * @return
     */
//    List<String> roleStrs(Long accountId);

    /**
     * 根据角色id组 获取角色列表
     * @param roleIds
     * @return
     */
/*
    List<RoleDto> getRoleDtos(List<Long> roleIds);
*/


    /**
     * 设置角色权限
     * @param parameterDto
     * @return
     */
   /* IResult setAuthoriths(ParameterDto parameterDto);*/
}
