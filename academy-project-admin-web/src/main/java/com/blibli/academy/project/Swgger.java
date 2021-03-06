package com.blibli.academy.project;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.service.Contact;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

/**
 * @author lixiaobai
 * @program: project
 * @create: 2018-08-16 16:56
 */
@Configuration
@EnableSwagger2
public class Swgger {
    @Bean
    public Docket createRestApi() {
        return new Docket(DocumentationType.SWAGGER_2)
                .apiInfo(apiInfo())
                .select()
                .apis(RequestHandlerSelectors.basePackage("com.blibli.academy.project.controller"))
                .paths(PathSelectors.any())
                .build();
    }

    private ApiInfo apiInfo(){
        return new ApiInfoBuilder()
                .title("BLIBLI干杯~~~~~~")
                .description("后台")
                .termsOfServiceUrl("http://academy.blibli.admin.dounixue.net/")
                .contact(new Contact("project","http://academy.blibli.admin.dounixue.net/","controller@email"))
                .build();

    }
}
