package com.linsir.saas.modules.rabc.mapper;

import com.linsir.saas.modules.rabc.entity.UserRole;
import com.linsir.base.core.mapper.BaseCrudMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * @author Administrator
 * @title: AccountRoleMapper
 * @projectName lins
 * @description:
 * @date 2022/1/18 10:55
 */
@Mapper
public interface UserRoleMapper extends BaseCrudMapper<UserRole> {

//
//    @Select("select * from lins_role " +
//            "left join " +
//            "lins_account_role on lins_role.id = lins_account_role.role_id " +
//            "where lins_account_role.account_id = #{accountId}")
//    List<Role> getRolesByAccountId(Long accountId);

}
