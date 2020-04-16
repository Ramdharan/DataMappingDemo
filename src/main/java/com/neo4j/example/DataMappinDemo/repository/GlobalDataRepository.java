package com.neo4j.example.DataMappinDemo.repository;

import org.springframework.data.neo4j.repository.Neo4jRepository;

import com.neo4j.example.DataMappinDemo.nodeentity.GlobalData;

public interface GlobalDataRepository extends Neo4jRepository<GlobalData, Long>{

}
