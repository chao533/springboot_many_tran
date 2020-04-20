package com.kang.config;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.context.properties.ConfigurationProperties;

/**
 * @Description TODO
 * @Author bingfeng
 * @Date 2019/11/20 17:06
 */
@ConfigurationProperties(prefix = "spring.datasource.slave")
public class SlaveDBConfig {

    @Value("${spring.datasource.slave.jdbc-url}")
    private String url_jdbc;

    @Value("${spring.datasource.slave.username}")
    private String username;

    @Value("${spring.datasource.slave.password}")
    private String password;

	public String getUrl_jdbc() {
		return url_jdbc;
	}

	public void setUrl_jdbc(String url_jdbc) {
		this.url_jdbc = url_jdbc;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}
    
    
}
