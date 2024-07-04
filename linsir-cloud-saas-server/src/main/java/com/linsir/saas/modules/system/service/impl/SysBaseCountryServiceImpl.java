package com.linsir.saas.modules.system.service.impl;

import com.linsir.base.core.service.impl.BaseServiceImpl;
import com.linsir.base.core.vo.FilterDataVO;
import com.linsir.base.core.vo.Option;
import com.linsir.saas.enums.Continent;
import com.linsir.saas.modules.system.entity.SysBaseCountry;
import com.linsir.saas.modules.system.mapper.SysBaseCountryMapper;
import com.linsir.saas.modules.system.service.SysBaseCountryService;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

/**
 * description:
 *
 * @author [linsir]
 * @version 0.0.1
 * @date 2022/08/29 18:45:17
 */
@Service
public class SysBaseCountryServiceImpl extends  BaseServiceImpl<SysBaseCountryMapper, SysBaseCountry> implements SysBaseCountryService {

    /**
     * 洲分类
     * @param sysBaseCountryList
     * @return
     */
    @Override
    public FilterDataVO continentList(List<SysBaseCountry> sysBaseCountryList) {
        FilterDataVO filterDataVO = new FilterDataVO();
        filterDataVO.setMultiple(true);
        filterDataVO.setKey("type");
        filterDataVO.setTitle("洲分类");
        List<Option> optionList = new ArrayList<>();

        sysBaseCountryList.stream().forEach(sysBaseCountry -> {
            Option option = new Option();

            switch (sysBaseCountry.getContinent()){
                case 1 :
                    option.setLabel(Continent.Asia.getLabel());
                    option.setValue(String.valueOf(Continent.Asia.getValue()));
                    break;
                case 2 :
                    option.setLabel(Continent.Europe.getLabel());
                    option.setValue(String.valueOf(Continent.Europe.getValue()));
                    break;
                case 3 :
                    option.setLabel(Continent.Africa.getLabel());
                    option.setValue(String.valueOf(Continent.Africa.getValue()));
                    break;
                case 4 :
                    option.setLabel(Continent.NorthAmerica.getLabel());
                    option.setValue(String.valueOf(Continent.NorthAmerica.getValue()));
                    break;
                case 5 :
                    option.setLabel(Continent.SouthAmerica.getLabel());
                    option.setValue(String.valueOf(Continent.SouthAmerica.getValue()));
                    break;
                case 6 :
                    option.setLabel(Continent.Oceania.getLabel());
                    option.setValue(String.valueOf(Continent.Oceania.getValue()));
                    break;
                case 156 :
                    option.setLabel(Continent.Antarctica.getLabel());
                    option.setValue(String.valueOf(Continent.Antarctica.getValue()));
                    break;
            }
            optionList.add(option);

        });
        filterDataVO.setOptions(optionList);
        return filterDataVO;
    }
}
