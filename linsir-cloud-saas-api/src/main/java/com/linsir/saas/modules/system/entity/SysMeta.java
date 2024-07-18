package com.linsir.saas.modules.system.entity;

import com.baomidou.mybatisplus.annotation.TableName;
import com.linsir.base.core.entity.AbstractEntity;
import lombok.Data;

/**
 * @author ：linsir
 * @date ：Created in 2022/8/28 12:05
 * @description：菜单meta信息
 * @modified By：
 * @version: 0.0.1
 */
@Data
@TableName("sys_meta")
public class SysMeta extends AbstractEntity<Long> {

    private String title;

    private String icon;

    private boolean affix;

    private String type;

}
