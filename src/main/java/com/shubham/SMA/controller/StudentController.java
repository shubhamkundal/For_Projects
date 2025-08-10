package com.shubham.SMA.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.shubham.SMA.model.StudentDTO;
import com.shubham.SMA.service.IStudentService;

import jakarta.validation.Valid;

@RestController
@RequestMapping("/api")
public class StudentController {

	@Autowired
	private IStudentService service;
	
	@GetMapping("/")
	public ResponseEntity<String> test() {
		System.out.println("API working...");
		return new ResponseEntity<String>("This is Test API",HttpStatus.OK);
	}

	@GetMapping("/getStudent/{id}")
	public ResponseEntity<StudentDTO> getStudent(@PathVariable Long id) {
		return new ResponseEntity<StudentDTO>(service.getStudentById(id).get(),HttpStatus.OK);
	}

	@GetMapping("/getAllStudents")
	public ResponseEntity<List<StudentDTO>> getAllStudents() {
		return new ResponseEntity<List<StudentDTO>>(service.getAllStudents(),HttpStatus.OK);
	}

	@PostMapping("/addStudent")
	public ResponseEntity<String> addStudent(@Valid @RequestBody StudentDTO studentDTO) {
		return new ResponseEntity<String>(service.addStudent(studentDTO),HttpStatus.OK);
	}

	@DeleteMapping("/deleteStudent/{id}")
	public ResponseEntity<String> deleteStudent(@PathVariable Long id) {
		return new ResponseEntity<String>(service.deleteStudent(id),HttpStatus.OK);
	}

	@PutMapping("/updateStudent")
	public ResponseEntity<String> updateStudent(@Valid @RequestBody StudentDTO studentDTO) {
		return new ResponseEntity<String>(service.updateStudent(studentDTO),HttpStatus.OK);
	}
}
