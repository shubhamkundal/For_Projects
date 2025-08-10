package com.shubham.SMA.service;

import java.util.List;
import java.util.Optional;

import com.shubham.SMA.model.StudentDTO;


public interface IStudentService {
	
	public Optional<StudentDTO> getStudentById(Long id);
	
	public List<StudentDTO> getAllStudents();
	
	public String addStudent(StudentDTO studentDTO);
	
	public String deleteStudent(Long id);
	
	public String updateStudent(StudentDTO studentDTO);
	
}
