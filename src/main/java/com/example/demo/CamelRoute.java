package com.example.demo;

import org.apache.camel.builder.RouteBuilder;
import org.springframework.stereotype.Component;

@Component
public class CamelRoute extends RouteBuilder {

    @Override
    public void configure() {
        from("direct:start")
            .routeId("start")
            .log("Hello World")
            .process(exchange -> System.out.println("Hello World"))
            .to("mock:result");
    }
}
