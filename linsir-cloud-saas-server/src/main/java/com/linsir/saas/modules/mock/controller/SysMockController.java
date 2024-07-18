package com.linsir.saas.modules.mock.controller;

import com.linsir.base.core.vo.jsonResults.JsonResult;
import com.linsir.base.core.vo.results.R;
import com.linsir.saas.modules.mock.dto.UserDTO;
import com.linsir.saas.modules.mock.vo.RoleVO;
import com.linsir.saas.modules.mock.vo.UserInfoVO;
import com.linsir.saas.modules.mock.vo.UserVO;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

/**
 * @author linsir
 * @version 1.0.0
 * @title SysMockController
 * @description
 * @create 2024/7/15 13:44
 */


@RestController
@RequestMapping("/mock/")
public class SysMockController {

    @PostMapping("login")
    public R login(@RequestBody UserDTO userDTO) {
        UserVO userVO = new UserVO();
        userVO.setUserId("linsir001");
        userVO.setToken("token");
        List<RoleVO> roleVOList = new ArrayList<>();
        RoleVO roleVO1 = new RoleVO();
        roleVO1.setRoleName("r1");
        roleVO1.setValue("1");
        RoleVO roleVO2 = new RoleVO();
        roleVO2.setRoleName("r2");
        roleVO2.setValue("2");
        roleVOList.add(roleVO1);
        roleVOList.add(roleVO2);
        userVO.setRoles(roleVOList);
        return new JsonResult(userVO);
    }


    @GetMapping("getUserInfo")
    public R getUserInfo()
    {
        List<RoleVO> roleVOList = new ArrayList<>();
        RoleVO roleVO1 = new RoleVO();
        roleVO1.setRoleName("r1");
        roleVO1.setValue("1");
        RoleVO roleVO2 = new RoleVO();
        roleVO2.setRoleName("r2");
        roleVO2.setValue("2");
        roleVOList.add(roleVO1);
        roleVOList.add(roleVO2);
        UserInfoVO userInfoVO = new UserInfoVO();
        userInfoVO.setUsername("linsir");
        userInfoVO.setRealName("喻");
        userInfoVO.setAvatar("http://ygde.oss-cn-zhangjiakou.aliyuncs.com/l/linsir.png");
        userInfoVO.setRoles(roleVOList);
        return new JsonResult(userInfoVO);
    }

}
