package com.neo4j.example.DataMappinDemo.query;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.StreamSupport;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.coxautodev.graphql.tools.GraphQLQueryResolver;
import com.neo4j.example.DataMappinDemo.nodeentity.GlobalData;
import com.neo4j.example.DataMappinDemo.repository.GlobalDataRepository;

@Component
public class GlobalDataQueryResolver implements GraphQLQueryResolver{

	@Autowired
	private GlobalDataRepository globalRepo;
	
	public GlobalData getGlobalData(long id) {
		GlobalData data=new GlobalData();
		data.setId(id);
		data.setFieldName("Test Global Data");
		return data;
	}
	
	public List<GlobalData> getAllGlobalData() {
		List<GlobalData> result=StreamSupport.stream
        		(globalRepo.findAll().spliterator(), false).
        		collect(Collectors.toList());
		
		return result;
	}
}
