package com.burt;

import org.springframework.boot.SpringApplication;
import org.springframework.cloud.client.SpringCloudApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;

/**
 * Created with Burt
 * Date: 2018/11/13
 * Time: 7:42 PM
 */
@SpringCloudApplication
@EnableZuulProxy
@EnableEurekaClient
public class GrayscaleZuulApplication {

    public static void main(String[] args) {
        SpringApplication.run(GrayscaleZuulApplication.class, args);
    }
}
