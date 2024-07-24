package com.linsir.saas.modules.rabc.controller;

import com.linsir.saas.modules.rabc.entity.Role;
import com.linsir.saas.modules.rabc.service.impl.RoleServiceImpl;
import com.linsir.base.core.controller.BaseCrudRestController;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author ：linsir
 * @date ：Created in 2022/9/1 22:32
 * @description：角色
 * @modified By：
 * @version: 0.0.1
 */
@RestController
@RequestMapping("/v1/role/")
public class RoleController extends BaseCrudRestController<Role> {


    @Autowired
    private RoleServiceImpl roleService;

    /*@GetMapping("list")
    public ResResult list(RoleDto roleDto,int page,int pageSize) throws Exception {
        R result = null;
        QueryWrapper queryWrapper = buildQueryWrapperByDTO(roleDto);
        Pagination pagination = new Pagination();
        pagination.setPageSize(pageSize);
        pagination.setPageIndex(page);
        Summary summary = new Summary("1","11");
        result = exec("获取角色列表",()->{
            List<RoleVO> roleVOList = roleService.getViewObjectList(queryWrapper,pagination,RoleVO.class);
            PageVO<RoleVO,Summary> pageVO = new PageVO<>(pagination,roleVOList);
            pageVO.setSummary(summary);
            return  Result.SUCCESS(pageVO);
        });

        return new ResResult<>(result);
    }*/
}
