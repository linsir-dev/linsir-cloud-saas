package com.linsir.saas.modules.organization.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.linsir.saas.modules.organization.entity.Member;
import org.apache.ibatis.annotations.Mapper;

/**
 * @author Administrator
 * @title: MemberMapper
 * @projectName lins
 * @description:
 * @date 2022/1/4 11:58
 */

@Mapper
public interface MemberMapper extends BaseMapper<Member> {
}
