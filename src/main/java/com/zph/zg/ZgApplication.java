package com.zph.zg;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.Banner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.ComponentScans;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.transaction.annotation.EnableTransactionManagement;

@EnableTransactionManagement
@SpringBootApplication
@EnableScheduling
@MapperScan(value = "com.zph.zg.dao")
@ComponentScans(value = {
        @ComponentScan(value = "com.zph.zg.service.*"),
        @ComponentScan(value = "com.zph.zg.controller")
})
@EnableAutoConfiguration(exclude={DataSourceAutoConfiguration.class})
public class ZgApplication {

    public static void main(String[] args) {
        SpringApplication springApplication = new SpringApplication(ZgApplication.class);
        springApplication.setBannerMode(Banner.Mode.OFF);
        springApplication.run(args);
    }

}
