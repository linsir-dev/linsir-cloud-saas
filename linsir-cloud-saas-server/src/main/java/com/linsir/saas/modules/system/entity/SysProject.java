package com.linsir.saas.modules.system.entity;

import com.baomidou.mybatisplus.annotation.TableName;
import com.linsir.base.core.entity.AbstractEntity;
import lombok.Data;

/**
 * @author admin
 * @version 1.0.0
 * @ClassName SysProject.java
 * @Description 项目
 * @createTime 2022年08月05日 11:13:00
 */
@Data
@TableName("sys_project")
public class SysProject extends AbstractEntity<Long> {
    private String name;

    private String link;

    private String intro;

}
