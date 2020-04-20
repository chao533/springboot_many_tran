package com.kang.config;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.context.properties.ConfigurationProperties;


/**
 * @Description TODO
 * @Author bingfeng
 * @Date 2019/11/20 17:08
 */
@ConfigurationProperties(prefix = "spring.datasource.master")
public class MasterDBConfig {

    @Value("${spring.datasource.master.jdbc-url}")
    private String url_jdbc;

    @Value("${spring.datasource.master.username}")
    private String username;

    @Value("${spring.datasource.master.password}")
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
