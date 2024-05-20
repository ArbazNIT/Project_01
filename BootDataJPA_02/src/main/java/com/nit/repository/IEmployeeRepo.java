package com.nit.repository;

import org.springframework.data.jpa.repository.JpaRepository;


import com.nit.entity.Employee;

public interface IEmployeeRepo extends JpaRepository<Employee, Integer> {

}
