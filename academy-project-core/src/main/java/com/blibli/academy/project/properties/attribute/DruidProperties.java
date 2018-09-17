package com.blibli.academy.project.properties.attribute;

import lombok.Data;
import lombok.EqualsAndHashCode;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.annotation.Order;

import java.util.List;

/**
 * @author lixiaobai
 * @program: project
 * @create: 2018-08-19 20:34
 */
@Configuration
@ConfigurationProperties(prefix = "project.druid")
@Data
@EqualsAndHashCode(callSuper = false)
@Order(-1)
public class DruidProperties {
    private String username;
    private String password;
    // 该值不可改变
    private String servletPath = "/druid/*";
    private Boolean resetEnable = false;
    private List<String> allowIps;
    private List<String> denyIps;
}
