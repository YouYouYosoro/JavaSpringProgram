package com.itchen.reggie;


import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.ServletComponentScan;
import org.springframework.transaction.annotation.EnableTransactionManagement;

@Slf4j //lombok提供的注解，用于输出日志，方便调试
@SpringBootApplication
@ServletComponentScan //扫描WebFilter注解（拦截器）
@EnableTransactionManagement//开启事务支持
public class ReggieApplication {
    public static void main(String[] args) {
        SpringApplication.run(ReggieApplication.class,args);
        log.info("测试_项目启动成功");
    }
}
