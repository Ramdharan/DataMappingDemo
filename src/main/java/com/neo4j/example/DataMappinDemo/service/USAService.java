package com.neo4j.example.DataMappinDemo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.neo4j.example.DataMappinDemo.nodeentity.USA;
import com.neo4j.example.DataMappinDemo.repository.USARepository;

@Service
public class USAService {
	@Autowired
	private USARepository usaRepo;	
	
	
		
	
	@Transactional
	public  USA createUSA(String fieldName,String fieldFormat,String fieldType) {
		
		System.out.println("Creating USA");
		USA usa=new USA();
		usa.setFieldName(fieldName);
		if(fieldFormat!=null) {
			usa.setFieldFormat(fieldFormat);
		}
		if(fieldType!=null) {
			usa.setFieldType(fieldType);
		}
		
		USA res=usaRepo.save(usa);
		
		return res;
	}
}
