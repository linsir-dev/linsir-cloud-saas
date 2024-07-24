package com.linsir.saas.modules.rabc.vo;

import com.linsir.saas.modules.rabc.entity.Role;
import com.linsir.saas.modules.rabc.entity.User;
import com.linsir.saas.modules.rabc.entity.UserExt;
import com.linsir.saas.modules.rabc.entity.UserExtMeta;
import com.linsir.base.core.binding.annotation.BindEntity;
import com.linsir.base.core.binding.annotation.BindEntityList;
import com.linsir.base.core.binding.annotation.BindFieldList;
import lombok.Data;

import java.util.List;

/**
 * description:
 *
 * @author [linsir]
 * @version 0.0.1
 * @date 2022/09/01 18:33:16
 *
 *
 *   加入 user 的网站上的扩展信息 UseExtMeta
 *   by linsir 2023/4/11
 *
 */

@Data
public class UserVO extends User {

    @BindEntityList(entity = Role.class,condition = "this.id = user_role.user_id AND user_role.role_id=id")
    private List<Role> roleList;

    @BindEntity(entity = UserExtMeta.class,condition = "this.id = user_ext.user_id AND user_ext.ext_id = id AND user_ext.type = 'meta'")
    private UserExtMeta userExtMeta;

    @BindFieldList(entity = UserExt.class,field = "type",condition = "this.id = user_ext.user_id")
    private List<String> types;
}
