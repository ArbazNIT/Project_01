package com.nit.repository;

import org.springframework.data.repository.CrudRepository;

import com.nit.entity.Employee001;
import com.nit.entity.Person;

public interface IRepositoryEmp  extends CrudRepository<Person, Integer>{

}
