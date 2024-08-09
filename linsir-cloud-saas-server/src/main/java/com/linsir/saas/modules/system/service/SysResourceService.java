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

    /**
     *  菜单列表
     * @param queryWrapper
     * @param pagination
     * @return
     */
    List<SysResourceVO> treeList(QueryWrapper queryWrapper, Pagination pagination);

    /**
     * @description 根据登录用户id，获取对应菜单
     * @author Linsir
     * @param  userId
     * @return com.linsir.saas.modules.system.vo.MenuVO
     * @time 2024/7/29 20:09
     */
    MenuVO getByUser(Long userId);

    /**
     * @description 获取树型菜单
     * @author Linsir
     * @param  queryWrapper
     * @return java.util.List<com.linsir.saas.modules.system.vo.SysResourceVO>
     * @time 2024/7/29 20:06
     */
    List<SysResourceVO> getSysResourceVOTreeList(QueryWrapper queryWrapper);

}
