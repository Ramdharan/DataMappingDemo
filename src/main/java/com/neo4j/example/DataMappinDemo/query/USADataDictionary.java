package com.neo4j.example.DataMappinDemo.query;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.StreamSupport;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.coxautodev.graphql.tools.GraphQLQueryResolver;
import com.neo4j.example.DataMappinDemo.nodeentity.GlobalData;
import com.neo4j.example.DataMappinDemo.nodeentity.USA;
import com.neo4j.example.DataMappinDemo.repository.GlobalDataRepository;
import com.neo4j.example.DataMappinDemo.repository.USARepository;

@Component
public class USADataDictionary implements GraphQLQueryResolver{
	
	@Autowired  USARepository repo;
	@Autowired GlobalDataRepository globalRepo;
	
	public USADataDictionary() {

	}
	/*
	@Autowired
	public USADataDictionary(USARepository repo) {
		this.usarepo=repo;
		System.out.println(usarepo.toString());
	}*/

	public List<USA> getAllUSAData() {
        List<USA> result=StreamSupport.stream
        		(repo.findAll().spliterator(), false).
        		collect(Collectors.toList());
		return result;
	}
	
	public Optional<USA>  getUSA(long id) {
		Optional<USA> result=repo.findById(id);
		return result;
	}
	public Optional<USA> setUSARelationShip(long usaId,long globalId) {
		Optional<USA> result=repo.findById(usaId);
		Optional<GlobalData> globalData=globalRepo.findById(globalId);
		result.get().setIsEqual(globalData.get());
		repo.save(result.get());
        
		return result;
	}
	
	
}
