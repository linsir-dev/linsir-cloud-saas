package com.linsir.saas.modules.system.service.impl;

import cn.hutool.core.lang.Snowflake;
import cn.hutool.core.util.IdUtil;
import com.linsir.base.core.service.impl.BaseServiceImpl;
import com.linsir.saas.modules.system.entity.SysTenant;
import com.linsir.saas.modules.system.mapper.SysTenantMapper;
import com.linsir.saas.modules.system.service.SysTenantService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 * @author admin
 * @version 1.0.0
 * @ClassName SysTenantServiceImpl.java
 * @Description TODO
 * @createTime 2022年07月18日 17:32:00
 */
@Service
@Transactional
public class SysTenantServiceImpl extends BaseServiceImpl<SysTenantMapper, SysTenant> implements SysTenantService {
    @Override
    public String generateCode() {
        Snowflake snowflake = IdUtil.createSnowflake(1, 1);
        return "ZHBM-"+snowflake.nextIdStr();
    }
}
