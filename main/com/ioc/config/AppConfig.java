package com.ioc.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
// Without using beans.xml
@Configuration()
@ComponentScan(basePackages = "com.ioc.classes")
public class AppConfig {
	
}
