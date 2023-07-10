package org.zfx.config;


import lombok.Data;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

@Data
@Component
@ConfigurationProperties(prefix = "swagger")
public class SwaggerProperties {
    // 是否启用Swagger
    private boolean enable;

    // 扫描的基本包
    @Value("${swagger.base.package}")
    private String basePackage;

    // 联系人邮箱
    @Value("${swagger.contact.email}")
    private String contactEmail;

    // 联系人名称
    @Value("${swagger.contact.name}")
    private String contactName;

    // 联系人网址
    @Value("${swagger.contact.url}")
    private String contactUrl;

    // 描述
    private String description;

    // 标题
    private String title;

    // 网址
    private String url;

    // 版本
    private String version;
}