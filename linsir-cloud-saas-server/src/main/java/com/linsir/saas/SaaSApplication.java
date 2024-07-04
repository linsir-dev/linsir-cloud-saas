package com.linsir.saas;

import com.linsir.base.core.launch.LinsirApplication;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;



/**
 * @author yuxiaolin
 * @title: SaaSApplication
 * @projectName linsir
 * @description: saas 服务启动
 * @date 2022/2/10 12:14 上午
 */

@SpringBootApplication
@EnableDiscoveryClient
public class SaaSApplication {

    public static void main( String[] args )
    {
        LinsirApplication.run("linsir-saas-server", SaaSApplication.class,args);
    }
}
