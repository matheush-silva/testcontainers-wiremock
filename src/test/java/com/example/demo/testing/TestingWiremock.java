package com.example.demo.testing;

import com.example.demo.configuration.WiremockContainerConfiguration;
import com.example.demo.properties.SymplaPayProperties;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.testcontainers.junit.jupiter.Container;
import org.testcontainers.junit.jupiter.Testcontainers;

@SpringBootTest
@Testcontainers
public class TestingWiremock {

    @Container
    private static final WiremockContainerConfiguration WIREMOCK_CONTAINER_CONFIGURATION = WiremockContainerConfiguration.getInstance();

    @Autowired
    private SymplaPayProperties properties;

    @Test
    public void test() {
        System.out.println(properties.getSymplaPayUrl());
    }
}
