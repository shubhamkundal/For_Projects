package com.shubham.SMA.service.impl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.shubham.SMA.model.StudentDTO;
import com.shubham.SMA.repository.IStudentRepo;
import com.shubham.SMA.service.IStudentService;

@Service
public class StudentService implements IStudentService {

	@Autowired
	private IStudentRepo repo;

	@Override
	public Optional<StudentDTO> getStudentById(Long id) {
		return repo.findById(id);
	}

	@Override
	public List<StudentDTO> getAllStudents() {
		return (List<StudentDTO>) repo.findAll();
	}

	@Override
	public String addStudent(StudentDTO studentDTO) {
		try {
			studentDTO = repo.save(studentDTO);
			return "student with id : "+studentDTO.getStudentID()+" sved successfully";
		} catch (Exception e) {
			e.printStackTrace();
			return "student does not inserted, please try again";
		}
	}

	@Override
	public String deleteStudent(Long id) {
		
		if (getStudentById(id)!= null) {
			repo.deleteById(id);
			return "student with ID : "+ id +" deleted successfully";
		} else {
			return "student with ID : "+ id +" does not exist";
		}
	}

	@Override
	public String updateStudent(StudentDTO studentDTO) {
		StudentDTO studentDto2 = getStudentById(studentDTO.getStudentID()).get();
		if (studentDto2!= null) {
			repo.save(studentDTO);
			return "student with ID : "+ studentDTO.getStudentID() +" updated successfully";
		} else {
			return "student with ID : "+ studentDTO.getStudentID() +" does not exist";
		}
	}

}
