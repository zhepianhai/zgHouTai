package com.zph.zg.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.context.request.RequestContextListener;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;
import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.builders.ParameterBuilder;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.schema.ModelRef;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.service.Contact;
import springfox.documentation.service.Parameter;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;


@Configuration

@EnableSwagger2

public class SwaggerConfig extends WebMvcConfigurerAdapter {

    @Bean
    public RequestContextListener requestContextListener() {
        return new RequestContextListener();
    }


    @Override
    public void addResourceHandlers(ResourceHandlerRegistry registry) {
        // 设置swagger静态资源访问
        registry.addResourceHandler("swagger-ui.html").addResourceLocations("classpath:/META-INF/resources/");
        registry.addResourceHandler("doc.html").addResourceLocations("classpath:/META-INF/resources/");
        registry.addResourceHandler("/webjars/**").addResourceLocations("classpath:/META-INF/resources/webjars/");
    }

    @Bean
    public Docket createRestApi() {
        List<Parameter> pars = new ArrayList<Parameter>();

        ApiInfo apiInfo = new ApiInfoBuilder()
                .title("zg文档")
                .description("zg_api")
                .contact(new Contact("zg", "", ""))
                .termsOfServiceUrl("http://localhost:8080/")
                .version("1.0")
                .build() ;

        return new Docket(DocumentationType.SWAGGER_2)
                .host("localhost:8080/")
                .groupName("后台接口")
                .apiInfo(apiInfo)
                .select()
                .apis(RequestHandlerSelectors.basePackage("com.zph.zg"))
                .paths(PathSelectors.any())
                .build().globalOperationParameters(pars);
    }

}

