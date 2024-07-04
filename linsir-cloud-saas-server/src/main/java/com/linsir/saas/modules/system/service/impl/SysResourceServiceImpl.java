package com.linsir.saas.modules.system.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.linsir.base.core.binding.Binder;
import com.linsir.base.core.service.impl.BaseServiceImpl;
import com.linsir.base.core.util.BeanUtils;
import com.linsir.base.core.vo.Pagination;
import com.linsir.saas.modules.system.entity.SysResource;
import com.linsir.saas.modules.system.mapper.SysResourceMapper;
import com.linsir.saas.modules.system.service.SysResourceService;
import com.linsir.saas.modules.system.vo.MenuVO;
import com.linsir.saas.modules.system.vo.SysResourceVO;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

/**
 * description:
 *
 * @author [linsir]
 * @version 0.0.1
 * @date 2022/08/29 16:13:15
 */
@Service
public class SysResourceServiceImpl extends BaseServiceImpl<SysResourceMapper, SysResource> implements SysResourceService {

    /**
     * 获取资源列表
     * @param queryWrapper
     * @param pagination
     * @return
     */
    @Override
    public List<SysResourceVO> treeList(QueryWrapper queryWrapper, Pagination pagination) {
        List<SysResourceVO> sysResourceVOList = getViewObjectList(queryWrapper,pagination,SysResourceVO.class);
        sysResourceVOList = BeanUtils.buildTree(sysResourceVOList);
        return sysResourceVOList;
    }

    /**
     * 根据用户获取菜单
     * @param userId
     * @return
     */
    @Override
    public MenuVO getByUser(Long userId) {
        QueryWrapper queryWrapper = new QueryWrapper();
        queryWrapper.orderByAsc("sort");
        List<SysResource> sysResourceList = list(queryWrapper);
        List<SysResourceVO> sysResourceVOList = Binder.convertAndBindRelations(sysResourceList,SysResourceVO.class);
        sysResourceVOList = BeanUtils.buildTree(sysResourceVOList);

        MenuVO menuVO = new MenuVO();
        menuVO.setMenu(sysResourceVOList);

        List<String> stringList = new ArrayList<>();
        stringList.add("list.add");
        stringList.add("list.delete");
        menuVO.setPermissions(stringList);
        return menuVO;
    }

}
