package com.linsir.saas.feign;

import org.springframework.cloud.openfeign.FallbackFactory;
import org.springframework.stereotype.Component;

/**
 * @author linsir
 * @version 1.0.0
 * @title IUerClientFactory
 * @description
 * @create 2024/7/24 1:22
 */

@Component
public class IUerClientFallbackFactory implements FallbackFactory<IUerClient> {
    @Override
    public IUerClient create(Throwable cause) {
        return null;
    }
}
