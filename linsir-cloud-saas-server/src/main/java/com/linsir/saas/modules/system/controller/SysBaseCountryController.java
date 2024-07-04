package com.linsir.saas.modules.system.controller;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
/*import com.linsir.core.controller.BaseCrudRestController;
import com.linsir.core.vo.*;
import com.linsir.core.vo.jsonResults.*;*/
import com.linsir.saas.modules.system.entity.SysBaseCountry;
import com.linsir.saas.modules.system.service.impl.SysBaseCountryServiceImpl;
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
 * @date 2022/08/30 16:45:59
 */
@RestController
@RequestMapping("/v1/sysBaseCountry/")
public class SysBaseCountryController /*extends BaseCrudRestController<SysBaseCountry> */{

    @Autowired
    private SysBaseCountryServiceImpl sysBaseCountryService;


   /* *//**
     *
     * @return
     * @throws Exception
     *//*
    @GetMapping("continentList")
    public ResResult continentList() throws Exception {
        R result = null;
        QueryWrapper<SysBaseCountry> sysBaseCountryQueryWrapper = new QueryWrapper<>();
        sysBaseCountryQueryWrapper.select("distinct continent");
        result = exec("洲分类",()->{
         List<SysBaseCountry> sysBaseCountryList = sysBaseCountryService.list(sysBaseCountryQueryWrapper);
            FilterDataVO filterDataVO = sysBaseCountryService.continentList(sysBaseCountryList);
            List<FilterDataVO> filterDataVOList = new ArrayList<>();
            filterDataVOList.add(filterDataVO);
            return Result.SUCCESS(filterDataVOList);
        });
        return new ResResult<>(result);
    }


    *//**
     * @Author linsir
     * @Description  洲的下来列表
     * @Date 12:24 2022/9/21
     * @Param []
     * @return com.linsir.core.vo.jsonResults.ResResult
     **//*
    @GetMapping("continentLable")
    public ResResult continentLable() throws Exception {
        R result = null;
        QueryWrapper<SysBaseCountry> sysBaseCountryQueryWrapper = new QueryWrapper<>();
        sysBaseCountryQueryWrapper.select("distinct continent");
        result = exec("洲分类",()->{
            List<SysBaseCountry> sysBaseCountryList = sysBaseCountryService.list(sysBaseCountryQueryWrapper);
            FilterDataVO filterDataVO = sysBaseCountryService.continentList(sysBaseCountryList);
            return Result.SUCCESS(filterDataVO.getOptions());
        });
        return new ResResult<>(result);
    }

    *//**
     * 国家列表
     *//*
    @GetMapping("list")
    public ResResult list(int page, int pageSize) throws Exception {
        R result=null;
        QueryWrapper queryWrapper = new QueryWrapper();
        Pagination pagination = new Pagination(SysBaseCountry.class);
        pagination.setPageIndex(page);
        pagination.setPageSize(pageSize);
        Summary summary = new Summary("11","xx");
        result = exec("国家列表",()->{
            List<SysBaseCountry> sysBaseCountryList  = sysBaseCountryService.getEntityList(queryWrapper,pagination);
            PageVO<SysBaseCountry,Summary> pageVO = new PageVO<>(pagination,sysBaseCountryList);
            return Result.SUCCESS(pageVO);

        });
        return new ResResult<>(result);
    }

    *//**
     * @Author linsir
     * @Description 根据洲的id获取国家
     * @Date 14:13 2022/9/21
     * @Param [continentId]
     * @return com.linsir.core.vo.jsonResults.ResResult
     **//*
    @GetMapping("getListByContinent")
    public ResResult getListByContinent() throws Exception {
        R result = null;
        result=exec("根据洲的id获取国家",()->{
            List<SysBaseCountry> sysBaseCountryList = sysBaseCountryService.list();
            List<Option> optionList = new ArrayList<>();
            sysBaseCountryList.stream().forEach((sysBaseCountry)->{
                Option option  = new Option();
                option.setValue(sysBaseCountry.getId().toString());
                option.setLabel(sysBaseCountry.getName());
                optionList.add(option);
            });
            return Result.SUCCESS(optionList);
        });
        return  new ResResult(result);
    }

    *//**
     * @Author linsir
     * @Description  获取国家下拉 列表
     * @Date 16:47 2022/9/20
     * @Param []
     * @return com.linsir.core.vo.jsonResults.ResResult
     **//*
    @GetMapping("lableList")
    public  ResResult lableList() throws Exception {
        R result = null;
        result = exec("获取国家下来列表",()->{
         List<LabelValue> labelValueList = new ArrayList<>();
            sysBaseCountryService.list().stream().forEach( sysBaseCountry -> {
             LabelValue labelValue = new LabelValue(sysBaseCountry.getName(),sysBaseCountry.getId());
             labelValueList.add(labelValue);
          });
          return Result.SUCCESS(labelValueList);
        });
        return new ResResult(result);
    }*/
}
