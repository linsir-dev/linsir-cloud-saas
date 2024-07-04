package com.linsir.saas.modules.system.service;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.linsir.base.core.service.BaseService;
import com.linsir.base.core.vo.Pagination;
import com.linsir.saas.modules.system.entity.SysResource;
import com.linsir.saas.modules.system.vo.MenuVO;
import com.linsir.saas.modules.system.vo.SysResourceVO;

import java.util.List;

/**
 * description:
 *
 * @author [linsir]
 * @version 0.0.1
 * @date 2022/08/29 16:11:56
 */
public interface SysResourceService extends BaseService<SysResource> {

    List<SysResourceVO> treeList(QueryWrapper queryWrapper, Pagination pagination);

    MenuVO getByUser(Long userId);

}
