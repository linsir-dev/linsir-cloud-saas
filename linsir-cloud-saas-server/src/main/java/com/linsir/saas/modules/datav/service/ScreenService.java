package com.linsir.saas.modules.datav.service;

import com.linsir.saas.modules.datav.vo.AppStatus;
import com.linsir.saas.modules.datav.vo.SysTenantPond;

import java.util.List;
import java.util.Map;

/**
 * @author linsir
 * @version 1.0.0
 * @title ScreenService
 * @description
 * @create 2024/8/22 14:31
 */
public interface ScreenService {

    /**
     * @description 获取核心应用
     * @author Linsir
     * @param
     * @return java.util.List<java.util.Map<java.lang.String,java.lang.String>>
     * @time 2024/8/22 14:36
     */
    public List<Map<String, AppStatus>> getCoreAppStatus();


    /**
     * @description configpond
     * @author Linsir
     * @param
     * @return java.util.Map<java.lang.String,int[]>
     * @time 2024/8/22 14:49
     */
    public Map<String ,int[]> getConfigPond();


    /**
     * @description SystenantPonds
     * @author Linsir
     * @param
     * @return java.util.Map<java.lang.String,com.linsir.saas.modules.datav.vo.SysTenantPond>
     * @time 2024/8/22 15:04
     */
    public Map<String, SysTenantPond> getSystenantPonds();


    /**
     * @description 租户数量
     * @author Linsir
     * @param
     * @return java.util.Map<java.lang.String,java.lang.Integer>
     * @time 2024/8/22 15:07
     */
    public Map<String,Integer> getSystenantCount();


    /**
     * @description 实例数量
     * @author Linsir
     * @param
     * @return java.util.Map<java.lang.String,java.lang.Integer>
     * @time 2024/8/22 15:08
     */
    public Map<String,Integer> getAppExCount();


    /**
     * @description 获取实例状态
     * @author Linsir
     * @param
     * @return java.util.Map<java.lang.String,java.lang.Integer[]>
     * @time 2024/8/22 15:09
     */
    public Map<String,Integer[]> getExStatus();


    /**
     * @description 系统状态
     * @author Linsir
     * @param
     * @return java.util.Map<java.lang.String,java.lang.Integer>
     * @time 2024/8/22 15:18
     */
    public Map<String,Integer> getSystemStatus();

    /**
     * @description 访问趋势
     * @author Linsir
     * @param
     * @return java.util.Map<java.lang.String,java.lang.Integer[]>
     * @time 2024/8/22 15:20
     */
    public Map<String,Integer[]> getVisitorTrend();
}
