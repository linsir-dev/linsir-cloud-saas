package com.linsir.saas.modules.system.controller;

/*import com.linsir.cloud.saas.api.dto.system.SysBaseAreaDto;
import com.linsir.core.controller.BaseCrudRestController;
import com.linsir.core.util.BeanUtils;
import com.linsir.core.vo.R;
import com.linsir.core.vo.Pagination;
import com.linsir.core.vo.Result;
import com.linsir.core.vo.jsonResults.*;*/
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * description:
 *
 * @author [linsir]
 * @version 0.0.1
 * @date 2022/08/31 10:20:20
 */

@RestController
@RequestMapping("/v1/sysBaseArea/")
public class SysBaseAreaController /*extends BaseCrudRestController<SysBaseArea>*/ {

    /*@Autowired
    private SysBaseAreaServiceImpl sysBaseAreaService;

    @GetMapping("list")
    public ResResult list(SysBaseAreaDto sysBaseAreaDto, int page, int pageSize) throws Exception {

        R result=null;

        QueryWrapper queryWrapper = buildQueryWrapperByDTO(sysBaseAreaDto);
        Pagination pagination = new Pagination(SysBaseArea.class);
        pagination.setPageIndex(page);
        pagination.setPageSize(pageSize);
        Summary summary = new Summary("11","xx");
        result = exec("基础区域",()->{
         List<SysBaseAreaVO> sysBaseAreaVOList = sysBaseAreaService.getViewObjectList(queryWrapper,pagination, SysBaseAreaVO.class);
         PageVO<SysBaseAreaVO,Summary> pageVO = new PageVO<>(pagination,sysBaseAreaVOList);
            return Result.SUCCESS(pageVO);

        });
        return new ResResult<>(result);
    }


    *//**
     * 根据国家获取 区域的级联 顶级分类
     * @param
     * @return
     *//*
    @GetMapping("labelList")
    public ResResult labelList(Long countryId,Long parentId) throws Exception {
       R result = null;
       QueryWrapper queryWrapper = new QueryWrapper();
       queryWrapper.eq("country_id",countryId);
       queryWrapper.eq("parent_id",parentId);
       result = exec("根据国家获取 区域的级联",()->{
           List<SysBaseArea> sysBaseAreaList =  sysBaseAreaService.getEntityList(queryWrapper);
           List<SysBaseAreaVO> sysBaseAreaVOList = BeanUtils.convertList(sysBaseAreaList,SysBaseAreaVO.class);
           //sysBaseAreaVOList=BeanUtils.buildTreeChildren(parentId,sysBaseAreaVOList, "parentId","children");
           return  Result.SUCCESS(sysBaseAreaVOList);
       });
       return new ResResult(result);
    }*/
}
