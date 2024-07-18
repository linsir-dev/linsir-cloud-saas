package com.linsir.saas.modules.system.entity;

import com.baomidou.mybatisplus.annotation.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import com.linsir.base.core.entity.AbstractEntity;
import com.linsir.base.core.entity.BaseModel;
import lombok.Data;

/**
 * @author linsir
 * @title: Tenant
 * @projectName lins
 * @description: 租户基本信息
 *
 * @date 2021/12/11 17:10
 */
@Data
@TableName("sys_tenant")
public class SysTenant extends BaseModel {

    /*租户编码*/
    private String tenantCode;

    /*租户名称*/
    private String name;

    /*联系方式*/
    private String tel;

    /*电话*/
    private String phone;

    /*传真*/
    private String fax;


    /*简要地址*/
    private String address;

    /*是否可用,1：可用 0：不可用*/
    private boolean enable;

    /*到期时间，可以为永久*/
    @JsonFormat(shape =JsonFormat.Shape.STRING,pattern ="yyyy-MM-dd HH:mm:ss",timezone ="GMT+8")
    private String timeExpiration;

    /*描述*/
    private String description;
}
