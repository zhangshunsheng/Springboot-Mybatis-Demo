package com.springboot.app.config;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@MapperScan("com.springboot.app.mapper")
public class MyConfigation {
}
