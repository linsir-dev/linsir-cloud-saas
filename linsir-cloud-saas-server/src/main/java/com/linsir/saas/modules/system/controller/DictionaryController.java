package com.linsir.saas.modules.system.controller;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.linsir.base.core.controller.BaseCrudRestController;
import com.linsir.base.core.entity.Dictionary;
import com.linsir.base.core.service.impl.DictionaryServiceExtImpl;
import com.linsir.base.core.util.BeanUtils;
import com.linsir.base.core.vo.FilterDataVO;
import com.linsir.base.core.vo.R;
import com.linsir.base.core.vo.Pagination;
import com.linsir.base.core.vo.Result;
import com.linsir.base.core.vo.jsonResults.*;
import com.linsir.saas.dto.auth.DictionaryDto;
import com.linsir.saas.modules.system.vo.TypeDictionaryVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

/**
 * description:
 *
 * @author [linsir]
 * @version 0.0.1
 * @date 2022/08/29 19:15:21
 */
@RestController
@RequestMapping("v1/dictionary/")
public class DictionaryController extends BaseCrudRestController<Dictionary> {

    @Autowired
    private DictionaryServiceExtImpl dictionaryService;

    /**
     * 最高级别的字段列表
     * @return
     *//*
    @GetMapping("highestList")
    public ResResult highestList() throws Exception {
        R result=null;
        QueryWrapper<Dictionary> dictionaryQueryWrapper = new QueryWrapper<>();
        dictionaryQueryWrapper.eq("parent_id",0);
       result = exec("获取最高级别字典列表",()->{
          List<Dictionary> dictionaryList = dictionaryService.list(dictionaryQueryWrapper);
          FilterDataVO filterDataVO = new FilterDataVO();
          filterDataVO =dictionaryService.conversionFilterDataVO("字典分裂","type",true,dictionaryList);
          List<FilterDataVO> filterDataVOList = new ArrayList<>();
          filterDataVOList.add(filterDataVO);
           return Result.SUCCESS(filterDataVOList);
        });
        return new ResResult<>(result);
    }

    *//**
     * 类型列表
     * @return
     *//*
    @GetMapping("typeTree")
    public ResResult typeTree() throws Exception {
        R result=null;
        QueryWrapper<Dictionary> dictionaryQueryWrapper = new QueryWrapper<>();
        dictionaryQueryWrapper.isNull("item_value");
        result = exec ("类型列表",()->{
            List<Dictionary> dictionaryList = dictionaryService.list(dictionaryQueryWrapper);
            List<TypeDictionaryVO> typeDictionaryVOList = BeanUtils.convertList(dictionaryList, TypeDictionaryVO.class);

            typeDictionaryVOList.stream().forEach( typeDictionaryVO -> {
                typeDictionaryVO.setLabel(typeDictionaryVO.getItemName());
            });
            typeDictionaryVOList = BeanUtils.buildTree(typeDictionaryVOList);
            return Result.SUCCESS(typeDictionaryVOList);
        });
        return new ResResult<>(result);
    }

    *//**
     * 字段列表
     * @return
     *//*
    @GetMapping("list")
    public ResResult list(DictionaryDto dictionaryDto, int page, int pageSize) throws Exception {
        R result = null;
        QueryWrapper queryWrapper = buildQueryWrapperByDTO(dictionaryDto);
        queryWrapper.isNotNull("item_value");
        Pagination pagination = new Pagination(Dictionary.class);
        pagination.setPageIndex(page);
        pagination.setPageSize(pageSize);
        Summary summary = new Summary("11","xx");
        result = exec("租户信息列表查询",()->{
            List<Dictionary> sysTenantList = dictionaryService.getViewObjectList(queryWrapper,pagination,Dictionary.class);
            PageVO<Dictionary,Summary> pageVO = new PageVO<>(pagination,sysTenantList);

            return Result.SUCCESS(pageVO);
        });
        return new ResResult<>(result);
    }*/

}
