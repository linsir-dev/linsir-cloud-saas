package com.linsir.saas.modules.rabc.dto;

/*
import com.linsir.common.mp.dto.CommonBaseDto;
*/
import lombok.Data;

/**
 * @author Administrator
 * @title: AccountRoleDto
 * @projectName lins
 * @description:
 * @date 2022/1/18 14:01
 */
@Data
public class AccountRoleDto /*extends CommonBaseDto*/ {
    private Long accountId;
    private Long roleId;
}
