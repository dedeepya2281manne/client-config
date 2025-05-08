package com.web.client_config.config;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

@Component
@ConfigurationProperties(prefix = "service")
public class AppProperties {
    private String name;
    private Integer timeout;
    private Integer retryAttempts;

    public String getName() {
        return name;
    }

    public Integer getTimeout() {
        return timeout;
    }

    public Integer getRetryAttempts() {
        return retryAttempts;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setTimeout(Integer timeout) {
        this.timeout = timeout;
    }

    public void setRetryAttempts(Integer retryAttempts) {
        this.retryAttempts = retryAttempts;
    }

    @Override
    public String toString() {
        return "AppProperties{" +
                "name='" + name + '\'' +
                ", timeout=" + timeout +
                ", retryAttempts=" + retryAttempts +
                '}';
    }
}
