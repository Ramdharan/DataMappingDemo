package com.neo4j.example.DataMappinDemo.mutations;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.coxautodev.graphql.tools.GraphQLMutationResolver;
import com.neo4j.example.DataMappinDemo.nodeentity.USA;
import com.neo4j.example.DataMappinDemo.service.USAService;

@Component
public class USAMutation implements GraphQLMutationResolver{

@Autowired
private USAService usaService;	

	public  USA createUSA(String fieldName,String fieldFormat,String fieldType) {
		return usaService.createUSA(fieldName, fieldFormat, fieldType);
	}
}
