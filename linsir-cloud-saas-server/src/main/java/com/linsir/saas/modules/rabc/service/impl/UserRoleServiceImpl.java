package com.linsir.saas.modules.rabc.service.impl;

import org.springframework.stereotype.Service;

/**
 * @author Administrator
 * @title: AccountRoleServiceImpl
 * @projectName lins
 * @description:
 * @date 2022/1/18 14:02
 */
@Service
public class UserRoleServiceImpl  {

        /* extends BaseServiceImpl<AccountRoleMapper, AccountRole, AccountRoleDto, AccountRoleVO> implements AccountRoleService, IService<AccountRole>*/

   /* @Resource
    private ModelMapper modelMapper;

    @Override
    protected AccountRole toM(AccountRoleDto accountRoleDto) {
        return modelMapper.map(accountRoleDto,AccountRole.class);
    }

    @Override
    protected AccountRoleDto toD(AccountRole accountRole) {
        return modelMapper.map(accountRole,AccountRoleDto.class);
    }

    @Override
    protected AccountRoleVO toV(AccountRole accountRole) {
        return null;
    }

    @Override
    protected AccountRoleVO toV(AccountRoleDto accountRoleDto) {
        return null;
    }


    @Override
    public List<AccountRole> getAccountRolesByAccountId(Long accountId) {
        QueryWrapper<AccountRole> queryWrapper = new QueryWrapper<>();
        queryWrapper.eq("account_id",accountId);
        return list(queryWrapper);
    }

    @Override
    public List<Long> getRoleIdsByAccountId(Long accountId) {
        return getAccountRolesByAccountId(accountId).stream().map(AccountRole::getRoleId).collect(Collectors.toList());
    }*/

}
