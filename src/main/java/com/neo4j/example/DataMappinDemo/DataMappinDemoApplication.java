package com.neo4j.example.DataMappinDemo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;
import org.springframework.context.annotation.Bean;

import com.neo4j.example.DataMappinDemo.query.GlobalDataQueryResolver;
import com.neo4j.example.DataMappinDemo.query.USADataDictionary;


@SpringBootApplication
public class DataMappinDemoApplication  extends SpringBootServletInitializer{

	public static void main(String[] args) {
		SpringApplication.run(DataMappinDemoApplication.class, args);
	   // 9849677719
	}
	/*
	@Bean
	public USADataDictionary queryUSA() {
		return new USADataDictionary();
	}
	

	@Bean
	public GlobalDataQueryResolver queryGlobalData() {
		return new GlobalDataQueryResolver();
	}
	*/
}
