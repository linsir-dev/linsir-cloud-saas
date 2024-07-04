package com.linsir.saas.modules.system.entity;

import com.baomidou.mybatisplus.annotation.TableName;
import com.linsir.base.core.entity.BaseEntity;
import lombok.Data;


/**
 * @author Administrator
 * @title: Authority
 * @projectName lins
 * @description:
 * @date 2022/1/17 12:00
 */

@Data
@TableName("authority")
public class SysAuthority extends BaseEntity
{
    /*权限因子名称*/
    private String name;

    /*父 id*/
    private Long parentId;

    /*应用id*/
    private String applicationId;

    /*菜单id*/
    private String menuId;

    /*url*/
    private String urlPerm;

    /*按钮*/
    private String btnPerm;
}
