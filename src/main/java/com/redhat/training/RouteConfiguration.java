package com.redhat.training;

import java.net.UnknownHostException;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.mongodb.Mongo;
import com.mongodb.MongoClient;

@Configuration
public class RouteConfiguration {

	@Bean(name="myDb")
	public Mongo mongoRepository() throws UnknownHostException{
		return new MongoClient("localhost");
	}
	
}
