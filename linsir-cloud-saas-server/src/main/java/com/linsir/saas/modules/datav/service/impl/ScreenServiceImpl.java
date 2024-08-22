package com.linsir.saas.modules.datav.service.impl;

import com.linsir.saas.modules.datav.service.ScreenService;
import com.linsir.saas.modules.datav.vo.AppStatus;
import com.linsir.saas.modules.datav.vo.SysTenantPond;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

/**
 * @author linsir
 * @version 1.0.0
 * @title ScreenServiceImpl
 * @description
 * @create 2024/8/22 14:34
 */

@Service
public class ScreenServiceImpl implements ScreenService {
    @Override
    public List<Map<String, AppStatus>> getCoreAppStatus() {
        return List.of();
    }

    @Override
    public Map<String, int[]> getConfigPond() {
        return Map.of();
    }

    @Override
    public Map<String, SysTenantPond> getSystenantPonds() {
        return Map.of();
    }

    @Override
    public Map<String, Integer> getSystenantCount() {
        return Map.of();
    }

    @Override
    public Map<String, Integer> getAppExCount() {
        return Map.of();
    }

    @Override
    public Map<String, Integer[]> getExStatus() {
        return Map.of();
    }

    @Override
    public Map<String, Integer> getSystemStatus() {
        return Map.of();
    }

    @Override
    public Map<String, Integer[]> getVisitorTrend() {
        return Map.of();
    }
}
