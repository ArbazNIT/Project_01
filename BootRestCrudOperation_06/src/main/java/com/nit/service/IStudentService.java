package com.nit.service;

import java.util.List;

import com.nit.entity.Student;

public interface IStudentService {
	public String inserStudent(Student student);
	public List<Student> getAllStudent();
	public Student getById(Integer sid);
	public String deleteById(Integer sid);
	public String updateStudent(Student student);
	
	

}
