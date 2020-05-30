package com.lyj.system;

import com.lyj.common.security.annotation.EnableCustomConfig;
import com.lyj.common.security.annotation.EnableLyjFeignClients;
import com.lyj.common.swagger.annotation.EnableCustomSwagger2;
import org.springframework.boot.SpringApplication;
import org.springframework.cloud.client.SpringCloudApplication;

/**
 * @author ：lyj
 * @email: : iclyj@iclyj.cn
 * @date ：2020/5/28
 */
@EnableCustomConfig
@EnableLyjFeignClients
@EnableCustomSwagger2
@SpringCloudApplication
public class LyjSystemApplication {

    public static void main(String[] args) {
        SpringApplication.run(LyjSystemApplication.class, args);
        System.out.println("(♥◠‿◠)ﾉﾞ  系统模块启动成功   ლ(´ڡ`ლ)ﾞ  \n" );
    }

}
