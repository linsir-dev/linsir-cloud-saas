package com.linsir.saas.modules.organization.entity;

import com.baomidou.mybatisplus.annotation.TableName;
import com.linsir.base.core.entity.BaseEntity;
import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * @author linsir
 * @version 1.0.0
 * @title ApplicationExample
 * @description 应用实例
 * @create 2024/7/24 16:27
 */

@EqualsAndHashCode(callSuper = true)
@Data
@TableName("application_example")
public class ApplicationExample extends BaseEntity {

    private Long appId;

    private String applicationExampleNo;

    private String alias;

}
