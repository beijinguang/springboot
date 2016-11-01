package com.idea4j.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

/**
 * Created by markee on 2016/11/1.
 */
@Configuration
@EnableSwagger2
public class SwaggerConfig {
    @Bean
    public Docket testApi() {
        return new Docket(DocumentationType.SWAGGER_2)
                .apiInfo(apiInfo())
                .select()
                .apis(RequestHandlerSelectors.basePackage("com.idea4j"))
                .paths(PathSelectors.any()).build();
    }

    private ApiInfo apiInfo() {
        ApiInfo apiInfo = new ApiInfo("SpringBoot",
                "Spring boot + swagger + mybatis + druid",
                "1.0", // 版本
                "NO terms of service", "wangjinguang66@163.com",
                "码客", // 链接显示文字
                "http://code.idea4j.com/"// 网站链接
        );

        return apiInfo;
    }
}
