package com.linsir.saas.modules.rabc.service.impl;

/*import com.linsir.common.mp.dto.ParameterDto;
import com.linsir.common.mp.result.RespResult;
import com.linsir.common.mp.service.BaseServiceImpl;*/
import com.linsir.base.core.service.impl.BaseServiceImpl;
import com.linsir.saas.modules.rabc.entity.Role;
import com.linsir.saas.modules.rabc.mapper.RoleMapper;
import com.linsir.saas.modules.rabc.service.RoleService;
import org.springframework.stereotype.Service;

/**
 * @author Administrator
 * @title: RoleServiceImpl
 * @projectName lins
 * @description:
 * @date 2022/1/18 12:40
 */
@Service
public class RoleServiceImpl  extends BaseServiceImpl<RoleMapper, Role> implements RoleService {

    /*extends BaseServiceImpl<RoleMapper,Role,RoleDto, RoleVO> implements IService<Role>,RoleService*/
   /* @Resource
    private ModelMapper modelMapper;

    @Resource
    private AuthorityServiceImpl authorityService;

    @Resource
    private AccountRoleServiceImpl accountRoleService;

    @Resource
    private RoleAuthorityServiceImpl roleAuthorityService;

    @Override
    protected Role toM(RoleDto roleDto) {
        return modelMapper.map(roleDto,Role.class);
    }

    @Override
    protected RoleDto toD(Role role) {
        RoleDto roleDto = modelMapper.map(role,RoleDto.class);
        List<AuthorityDto> authorityDtoList = authorityService.getAuthorityDtosByRoleId(role.getId());
        roleDto.setAuthorityDtoList(authorityDtoList);
        return roleDto;
    }

    @Override
    protected RoleVO toV(Role role) {
        return modelMapper.map(role,RoleVO.class);
    }

    @Override
    protected RoleVO toV(RoleDto roleDto) {
        return modelMapper.map(roleDto,RoleVO.class);
    }


    @Override
    public List<RoleDto> getRoleDtosByAccountId(Long accountId) {
        List<Long> roleIds = accountRoleService.getRoleIdsByAccountId(accountId);
        return getRoleDtos(roleIds);
    }

    @Override
    public List<String> roleStrs(Long accountId) {
        return getRoleDtosByAccountId(accountId).stream().map(RoleDto::getRoleName).collect(Collectors.toList());
    }

    @Override
    public List<RoleDto> getRoleDtos(List<Long> roleIds) {
        QueryWrapper<Role> queryWrapper = new QueryWrapper();
        queryWrapper.in("id",roleIds);
        List<Role> roleList = list(queryWrapper);
        List<RoleDto>  roleDtoList = roleList.stream().map(r->{
           return toD(r);
        }).collect(Collectors.toList());
        return roleDtoList;
    }

    @Override
    public IResult setAuthoriths(ParameterDto parameterDto) {
        IResult result = null;
        Map<String,Object> parameter = parameterDto.getParameters();
        Long roleId = Long.parseLong(parameter.get("roleId").toString());
        String authorithIdStrs = parameter.get("authorithIds").toString();
        String [] authorithId = authorithIdStrs.split(",");
        //已经存在的
        List<RoleAuthority> haveRoleAuthorityList = roleAuthorityService.getRoleAuthoritysByRoleId(roleId);
        List<Long> roleAuthorityIds = haveRoleAuthorityList.stream().map(RoleAuthority::getId).collect(Collectors.toList());
        //准备存入的
        List<RoleAuthority> saveRoleAuthorityList = Arrays.stream(authorithId).map(a->{
            RoleAuthority roleAuthority = new RoleAuthority();
            return  roleAuthority;
        }).collect(Collectors.toList());
        try {
            roleAuthorityService.removeByIds(roleAuthorityIds);
            roleAuthorityService.saveBatch(saveRoleAuthorityList);
        }catch (MybatisPlusException mybatisPlusException)
        {
            result = new RespResult(parameterDto.getExceptionCode(),mybatisPlusException.getMessage());
        }
        return result;
    }*/
}
