package com.kang;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;

import com.kang.config.MasterDBConfig;
import com.kang.config.SlaveDBConfig;

@SpringBootApplication
@EnableConfigurationProperties(value = {SlaveDBConfig.class, MasterDBConfig.class})
public class ManyTranApplication {

	
	public static void main(String[] args) {
        SpringApplication.run(ManyTranApplication.class, args);
    }
}
