package com.bank.model;

import com.bank.service.IEntity;

/**
 * Entities bean
 * @author Suraj Rajendran
 *
 */
public class Entity implements IEntity {
	
	private String name;
	
	public Entity(String name) {		
		this.name = name;
	}
	
	public Entity(){
		
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	public String toString(){
		return this.name;
	}

}
