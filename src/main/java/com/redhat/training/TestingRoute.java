package com.redhat.training;

import org.apache.camel.builder.RouteBuilder;
import org.springframework.stereotype.Component;

//@Component
public class TestingRoute extends RouteBuilder{

	@Override
	public void configure() throws Exception {
		from("timer:foo")
        .to("log:bar");
	}

}
