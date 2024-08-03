package com.student.StudentManagement.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


import com.student.StudentManagement.entity.Subject;

@Repository
public interface SubjectRepository extends JpaRepository<Subject, Long>{

	
}
