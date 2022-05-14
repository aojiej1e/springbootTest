package com.aojie.springboottest;

import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

import javax.sql.DataSource;

/**
 * @author 17671
 */
@SpringBootApplication(exclude = DataSourceAutoConfiguration.class)
@Slf4j
public class SpringbootTestApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringbootTestApplication.class, args);
        log.info("服务启动成功！！！");
    }

}
