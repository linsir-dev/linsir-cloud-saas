package com.linsir.saas.modules.system.controller;

/*import com.linsir.cloud.saas.api.dto.system.SysApplicationDto;
import com.linsir.core.controller.BaseCrudRestController;
import com.linsir.core.vo.FilterDataVO;
import com.linsir.core.vo.R;
import com.linsir.core.vo.Pagination;
import com.linsir.core.vo.Result;
import com.linsir.core.vo.jsonResults.*;*/
import com.linsir.saas.modules.system.service.impl.SysApplicationServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
        import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author ：linsir
 * @date ：Created in 2022/8/27 10:17
 * @description：应用
 * @modified By：
 * @version: 0.0.1
 */
@RestController
@RequestMapping("/v1/sysApplication/")
public class SysApplicationController /*extends BaseCrudRestController<SysApplication> */{

    @Autowired
    private SysApplicationServiceImpl sysApplicationService;

   /* *//**
     * 列表
     * @param sysApplicationDto
     * @param page
     * @param pageSize
     * @return
     *//*
    @GetMapping("list")
    public ResResult list(SysApplicationDto sysApplicationDto, int page , int pageSize) throws Exception {
        R result = null;
        QueryWrapper queryWrapper = buildQueryWrapperByDTO(sysApplicationDto);
        Pagination pagination = new Pagination(SysApplication.class);
        pagination.setPageIndex(page);
        pagination.setPageSize(pageSize);
        result = exec("应用信息列表查询",()->{
            List<SysApplication> sysTenantList = sysApplicationService.getViewObjectList(queryWrapper,pagination,SysApplication.class);
            PageVO<SysApplication, Summary> pageVO = new PageVO<>(pagination,sysTenantList);
            return Result.SUCCESS(pageVO);
        });
        return new ResResult<>(result);
    }

    *//**
     *
     * @return
     *//*
    @GetMapping("sortList")
    public ResResult sortList() throws Exception {
        R result = null;
        QueryWrapper<SysApplication> sysApplicationQueryWrapper = new QueryWrapper<>();
        result = exec("国家分类",()->{
            List<SysApplication> sysApplicationList = sysApplicationService.getEntityList(sysApplicationQueryWrapper);
            FilterDataVO filterDataVO = sysApplicationService.convertFilterData(sysApplicationList);
            List<FilterDataVO> filterDataVOList = new ArrayList<>();
            filterDataVOList.add(filterDataVO);
            return Result.SUCCESS(filterDataVOList);
        });
        return new ResResult<>(result);
    }*/
}
