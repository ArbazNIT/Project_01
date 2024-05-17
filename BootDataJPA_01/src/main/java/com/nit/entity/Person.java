package com.nit.entity;

import java.util.List;
import java.util.Set;

import org.hibernate.annotations.LazyCollection;
import org.springframework.context.annotation.Lazy;
import org.springframework.data.repository.cdi.Eager;

import jakarta.persistence.ElementCollection;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "person1")

public class Person {
	@Id
	private int id;
	private String name;
	
	@ElementCollection()
	private List<String>  frnd;
	@ElementCollection()
	
	private Set<Long> phon;
	
	public Person(int id, String name, List<String> frnd, Set<Long> phon) {
		super();
		this.id = id;
		this.name = name;
		this.frnd = frnd;
		this.phon = phon;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public List<String> getFrnd() {
		return frnd;
	}
	public void setFrnd(List<String> frnd) {
		this.frnd = frnd;
	}
	public Set<Long> getPhon() {
		return phon;
	}
	public void setPhon(Set<Long> phon) {
		this.phon = phon;
	}
	@Override
	public String toString() {
		return "Person [id=" + id + ", name=" + name + ", frnd=" + frnd + ", phon=" + phon + "]";
	}
	public Person() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	

}
