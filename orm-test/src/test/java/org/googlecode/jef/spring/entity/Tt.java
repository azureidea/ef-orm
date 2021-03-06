package org.googlecode.jef.spring.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import jef.codegen.support.NotModified;
import jef.database.DataObject;
/**
 * This class was generated by JEF according to the table in database.
 * You need to modify the type of primary key field, to the strategy your own.
 */
@NotModified
@Entity
@Table(name="tt")
public class Tt extends DataObject{

	@Id
	@Column(name="id",precision=10,columnDefinition="NUMBER")
	private Long id;

	@Column(name="name",columnDefinition="Varchar",length=255)
	private String name;

	public void setId(Long obj){
		this.id = obj;
	}

	public Long getId(){
		return id;
	}

	public void setName(String obj){
		this.name = obj;
	}

	public String getName(){
		return name;
	}

	public Tt(){
	}


public enum Field implements jef.database.Field{id,name}
}