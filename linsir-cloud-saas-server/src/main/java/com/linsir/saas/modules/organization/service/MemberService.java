package com.linsir.saas.modules.organization.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.linsir.saas.modules.organization.entity.Member;
/*
import com.linsir.saas.server.entity.organization.Member;
*/

/**
 * @author Administrator
 * @title: MemberService
 * @projectName lins
 * @description:
 * @date 2022/1/4 12:04
 */
public interface MemberService extends IService<Member> {

    Member getById(Long id);
}
