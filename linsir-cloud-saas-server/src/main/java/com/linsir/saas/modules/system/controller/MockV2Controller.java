package com.linsir.saas.modules.system.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * description:
 * *******************************************************
 * <p>
 * v2 版本的mock  *
 * ******************************************************
 *
 * @author: linsir
 * @version: 0.0.1  *
 * @date: 2023/4/1 12:14
 */
@RestController
@RequestMapping("oauth/v2/mock/")
public class MockV2Controller {
    
    /** 
    * @Description: 模拟登录数据 
    * @Param: java.lang.String 
    * @return: [] 
    * @Author: linsir
    * @Date: 13:24 2023/4/1
    */
    @RequestMapping("login")
    public String login(){
        System.out.println("login++++++");
        return "xxxxxxx";
    }
}
