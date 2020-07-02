package com.lsk.spring.boot.autoconfigure;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.context.properties.EnableConfigurationProperties;

/**
 * @Author: 李世宽
 * @Email: 18135757181@163.com
 * @Date: 2020/5/16 22:23
 */
@ConfigurationProperties(prefix = "com.lsk")
public class HelloProperties {

    private String prefix;

    private String suffix;

    public String getPrefix() {
        return prefix;
    }

    public void setPrefix(String prefix) {
        this.prefix = prefix;
    }

    public String getSuffix() {
        return suffix;
    }

    public void setSuffix(String suffix) {
        this.suffix = suffix;
    }
}
