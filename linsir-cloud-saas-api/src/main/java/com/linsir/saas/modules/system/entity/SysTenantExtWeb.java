package com.linsir.saas.modules.system.entity;

import com.baomidou.mybatisplus.annotation.TableName;
import com.linsir.base.core.entity.AbstractEntity;
import com.linsir.base.core.entity.BaseModel;
import lombok.Data;

/**
 * @ProjectName: linsir
 * @Package: com.linsir.saas.modules.system.entity
 * @ClassName: SysTenantExtWeb
 * @Description: 租户扩展到web属性上的信息
 * @Author:Linsir
 * @CreateDate: 2022/9/23 14:23
 * @UpdateDate: 2022/9/23 14:23
 * @Version: 0.0.1
 */
@Data
@TableName("sys_tanant_ext_web")
public class SysTenantExtWeb extends BaseModel {

    /*租户标题*/
    private String title;

    /*口号，标语，副标*/
    private String slogan;

    /*logo*/
    private String logo;

    /*登录页面插画*/
    private String inset;

    /*登录页面背景*/
    private String loginBackground;

    /*域名*/
    private String domainName;

    /*引导页是否开启*/
    private boolean enableGuidePage;

    /*引导页背景*/
    private String guidePageBackground;
}
