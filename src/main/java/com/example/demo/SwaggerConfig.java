package com.example.demo;

import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import io.swagger.v3.oas.annotations.info.Info;
import io.swagger.v3.oas.models.examples.Example;
import lombok.RequiredArgsConstructor;
import org.springdoc.core.customizers.OpenApiCustomiser;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.Collection;
import java.util.List;
import java.util.Map;

@OpenAPIDefinition(info = @Info(title = "API ", version = "v1"))
@Configuration
@RequiredArgsConstructor
public class SwaggerConfig {

    @Autowired
    SwaggerExamplesConfig swaggerExampleObject;

    @Bean
    public OpenApiCustomiser openApiCustomiser(Collection<Map.Entry<String, List<Example>>> examples) {
        return openAPI -> examples.forEach(example -> {
            for (Example e : example.getValue()) {
                openAPI.getComponents().addExamples(e.getDescription(), e);
            }
        });
    }

}