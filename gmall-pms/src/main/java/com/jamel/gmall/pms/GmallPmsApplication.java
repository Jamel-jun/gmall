package com.jamel.gmall.pms;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.context.ConfigurableApplicationContext;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@SpringBootApplication //看到没 不行先执行的nacos 反而是datasource  刚尿尿去了 我吃饭去了 等一下看看 到底是什么原因造成的 哈哈哈 老哥牛逼 我也蒙蔽了
@EnableDiscoveryClient  // 将该服务注册到注册中心
@MapperScan("com.jamel.gmall.pms.dao")
@EnableSwagger2
public class GmallPmsApplication {

    public static void main(String[] args) {
        SpringApplication.run(GmallPmsApplication.class, args);
    }

}
