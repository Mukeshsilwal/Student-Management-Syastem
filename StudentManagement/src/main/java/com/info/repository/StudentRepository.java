package com.info.repository;



import org.springframework.data.jpa.repository.JpaRepository;

import com.info.entity.Student;

public interface StudentRepository extends JpaRepository<Student, Integer>{
	
	

}
