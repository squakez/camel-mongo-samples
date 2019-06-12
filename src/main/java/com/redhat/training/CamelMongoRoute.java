package com.redhat.training;

import org.apache.camel.builder.RouteBuilder;
import org.springframework.stereotype.Component;

@Component
public class CamelMongoRoute extends RouteBuilder {

	@Override
	public void configure() throws Exception {
		/*from("jetty:http://localhost:8181/mongoSelect")
				.to("mongodb:myDb?database=test&collection=test&operation=findAll")
				.log("Select return: ${body}");
		from("jetty:http://localhost:8181/mongoInsert")
				.to("mongodb:myDb?database=test&collection=test&operation=insert");
				*/
		from("timer:foo?period=5s")
		.from("timer:foo?period=15s")
		.to("mongodb:myDb?database=test&collection=test&operation=findAll")
		.to("mock:${body}")
		.to("log:result is ${body}");
	}
}
