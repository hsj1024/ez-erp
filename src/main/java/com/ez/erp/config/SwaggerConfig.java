package com.ez.erp.config;

import io.swagger.v3.oas.models.OpenAPI;
import io.swagger.v3.oas.models.info.Info;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class SwaggerConfig {

    @Bean
    public OpenAPI ezErpOpenAPI() {
        return new OpenAPI()
                .info(new Info()
                        .title("EZ-ERP API 문서")
                        .description("사원 및 지출 관리 시스템 API 명세서입니다.")
                        .version("v1.0.0"));
    }
}
