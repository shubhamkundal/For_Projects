package com.shubham.SMA.repository;

import org.springframework.data.repository.CrudRepository;

import com.shubham.SMA.model.StudentDTO;

public interface IStudentRepo extends CrudRepository<StudentDTO, Long>{

}
