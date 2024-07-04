package com.linsir.saas.modules.system.service;

import com.linsir.base.core.service.BaseService;
import com.linsir.base.core.vo.FilterDataVO;
import com.linsir.saas.modules.system.entity.SysBaseCountry;

import java.util.List;

/**
 * description:
 *
 * @author [linsir]
 * @version 0.0.1
 * @date 2022/08/29 18:44:47
 */

public interface SysBaseCountryService extends BaseService<SysBaseCountry> {

   FilterDataVO continentList(List<SysBaseCountry> sysBaseCountryList);
}
