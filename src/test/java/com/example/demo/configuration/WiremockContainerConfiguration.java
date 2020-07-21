package com.example.demo.configuration;

import org.testcontainers.containers.BindMode;
import org.testcontainers.containers.GenericContainer;

public class WiremockContainerConfiguration extends GenericContainer<WiremockContainerConfiguration> {

    private static WiremockContainerConfiguration container;

    private WiremockContainerConfiguration() {
        super("rodolpheche/wiremock:latest");
    }

    public static WiremockContainerConfiguration getInstance() {
        if (container == null) {
            container = new WiremockContainerConfiguration().withExposedPorts(8080)
                .withClasspathResourceMapping("./mock-data", "/home/wiremock", BindMode.READ_WRITE);
        }
        return container;
    }

    @Override
    public void start() {
        super.start();
        System.setProperty("SYMPLA_PAY_URL", "http://" + container.getHost() + ":" + container.getFirstMappedPort());
    }
}
