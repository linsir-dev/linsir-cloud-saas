package com.linsir.saas.modules.rabc.service;


import com.linsir.saas.modules.rabc.entity.User;
import com.linsir.saas.modules.rabc.vo.UserVO;
import com.linsir.base.core.service.BaseService;

/**
 * description:
 *
 * @author [linsir]
 * @version 0.0.1
 * @date 2022/09/01 18:29:42
 */

public interface UserService extends BaseService<User> {
    UserVO getByAccount(String account);
}
