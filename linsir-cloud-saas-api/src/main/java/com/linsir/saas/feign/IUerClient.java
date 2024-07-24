package com.linsir.saas.feign;

import com.linsir.base.api.constant.AppConstant;
import com.linsir.base.core.vo.jsonResults.JsonResult;
import com.linsir.base.core.vo.results.R;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * @author linsir
 * @version 1.0.0
 * @title in
 * @description
 * @create 2024/7/23 14:23
 */
@FeignClient(value = AppConstant.APPLICATION_SAAS_NAME,fallbackFactory = IUerClientFallbackFactory.class)
public interface IUerClient {

    @GetMapping("/v1/user/get")
    JsonResult<String> getUser();
}
