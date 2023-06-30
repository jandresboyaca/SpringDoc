package com.example.demo;

import io.swagger.v3.oas.models.examples.Example;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.io.Resource;


import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;
@Configuration
public class SwaggerExamplesConfig {
    @Value("classpath:/swagger/login.json")
    Resource loginResource;

    @Bean
    public Map.Entry<String, List<Example>> loginExample() throws IOException, ParseException, IllegalAccessError {

        JSONObject json = (JSONObject) new JSONParser().parse(new InputStreamReader(loginResource.getInputStream(), "UTF-8"));

        List<Example> exampleList = new ArrayList<>();
        Example example = new Example();
        example.setValue(json);
        example.setDescription("login");
        exampleList.add(example);

        AbstractMap.SimpleEntry<String, List<Example>> loginExampleMap = new AbstractMap.SimpleEntry<>("login", exampleList);

        return loginExampleMap;
    }
}
