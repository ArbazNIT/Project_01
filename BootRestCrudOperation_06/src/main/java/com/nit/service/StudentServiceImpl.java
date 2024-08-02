package com.nit.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.nit.entity.Student;
import com.nit.repository.IStudentRepository;

@Service
public class StudentServiceImpl implements IStudentService {
	
	@Autowired
	private IStudentRepository studRepo;

	@Override
	public String inserStudent(Student student) {
		studRepo.save(student);
		return "Student Record saved success";
	}

	@Override
	public List<Student> getAllStudent() {
		List<Student> find = studRepo.findAll();
		
		return find;
	}

	@Override
	public Student getById(Integer sid) {
		Optional<Student> findBy = studRepo.findById(sid);
		if(findBy.isPresent()) {
			findBy.get();
		}
		return null;
	}

	@Override
	public String deleteById(Integer sid) {
		if(studRepo.existsById(sid)) {
			studRepo.deleteById(sid);
			return "Delete success";
		}
		return "Record not Found";
	}

	@Override
	public String updateStudent(Student student) {
	studRepo.save(student);
		return "Student updated";
	}

}
