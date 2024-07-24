package com.linsir.saas.modules.rabc.entity;

import com.baomidou.mybatisplus.annotation.TableName;
import com.linsir.base.core.entity.AbstractEntity;
import lombok.Data;

/**
 * description:
 * *******************************************************
 * <p>
 * 用户网站西信息扩展  *
 * ******************************************************
 *
 * @author: linsir
 * @version: 0.0.1  *
 * @date: 2023/4/10 20:07
 */
@Data
@TableName("user_ext_meta")
public class UserExtMeta  extends AbstractEntity<Long> {


    /*昵称*/
    private String nickname;

    private int sex;

    private String avatar;
}
