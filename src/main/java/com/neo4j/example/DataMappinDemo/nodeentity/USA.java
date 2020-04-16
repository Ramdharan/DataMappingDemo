package com.neo4j.example.DataMappinDemo.nodeentity;

import org.neo4j.ogm.annotation.GeneratedValue;
import org.neo4j.ogm.annotation.Id;
import org.neo4j.ogm.annotation.NodeEntity;
import org.neo4j.ogm.annotation.Relationship;

@NodeEntity(label="USA")
public class USA {

@Id
@GeneratedValue
 private long id;
 
 private String fieldName;
 
 private String fieldType;
 
 private String fieldFormat;
 
 @Relationship(type="IS_EQUAL",direction=Relationship.OUTGOING)
 private GlobalData isEqual;
 

 public long getId() {
	return id;
}

public void setId(long id) {
	this.id = id;
}

public String getFieldName() {
	return fieldName;
}

public void setFieldName(String fieldName) {
	this.fieldName = fieldName;
}

public String getFieldType() {
	return fieldType;
}

public void setFieldType(String fieldType) {
	this.fieldType = fieldType;
}

public String getFieldFormat() {
	return fieldFormat;
}

public void setFieldFormat(String fieldFormat) {
	this.fieldFormat = fieldFormat;
}

public GlobalData getIsEqual() {
	return isEqual;
}

public void setIsEqual(GlobalData isEqual) {
	this.isEqual = isEqual;
}




 
 
}
