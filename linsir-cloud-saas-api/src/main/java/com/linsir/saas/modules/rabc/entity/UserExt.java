package com.linsir.saas.modules.rabc.entity;

import com.baomidou.mybatisplus.annotation.TableName;
import com.linsir.base.core.entity.AbstractEntity;
import lombok.Data;

/**
 * description:
 * *******************************************************
 * <p>
 * 用戶擴展關聯表  *
 * ******************************************************
 *
 * @author: linsir
 * @version: 0.0.1  *
 * @date: 2023/4/8 1:19
 */
@Data
@TableName("user_ext")
public class UserExt extends AbstractEntity<Long> {

    private Long userId;

    private String type;

    private Long extId;
}
