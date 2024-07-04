package com.linsir.saas.modules.system.service;

import com.linsir.base.core.service.BaseService;
import com.linsir.base.core.vo.FilterDataVO;
import com.linsir.saas.modules.system.entity.SysApplication;

import java.util.List;

/**
 * description:
 *
 * @author [linsir]
 * @version 0.0.1
 * @date 2022/08/26 18:26:43
 */
public interface SysApplicationService extends BaseService<SysApplication> {

    FilterDataVO convertFilterData(List<SysApplication> applicationList);
}
