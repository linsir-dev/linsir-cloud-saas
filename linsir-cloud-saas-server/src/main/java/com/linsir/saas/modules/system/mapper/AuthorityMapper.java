package com.linsir.saas.modules.system.mapper;


import com.linsir.base.core.mapper.BaseCrudMapper;
import com.linsir.saas.modules.system.entity.SysAuthority;
import org.apache.ibatis.annotations.Mapper;

/**
 * @author: Administrator
 * @date: 2022/2/15 14:12
 * @description:
 */
@Mapper
public interface AuthorityMapper extends BaseCrudMapper<SysAuthority> {
}
