package com.zy.zhuang.config;

import com.alibaba.druid.pool.DruidDataSource;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

import javax.sql.DataSource;

/**
 * @author: YuanJiZhuang
 * @Date: 2018/12/13 10:38
 * @Description:
 */

@Configuration
@PropertySource(value = "classpath:application.properties")
@ConfigurationProperties(prefix = "zhuang.datasource")
public class DataSourceConfig {

    private String url;

    private String userName;

    private String driverClassName;

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getDriverClassName() {
        return driverClassName;
    }

    public void setDriverClassName(String driverClassName) {
        this.driverClassName = driverClassName;
    }

    @Bean("dataSource")
    public DataSource druidDataSource() {
        DruidDataSource druidDataSource = new DruidDataSource();
        druidDataSource.setUrl(getUrl());
        druidDataSource.setUsername(getUserName());
        druidDataSource.setDriverClassName(getDriverClassName());
        return druidDataSource;
    }
}
