package com.neo4j.example.DataMappinDemo.repository;

import org.springframework.data.neo4j.repository.Neo4jRepository;

import com.neo4j.example.DataMappinDemo.nodeentity.USA;

public interface USARepository extends Neo4jRepository<USA, Long>{
	
}
