package com.student.StudentManagement.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.student.StudentManagement.entity.Subject;
import com.student.StudentManagement.repo.SubjectRepository;

import java.util.List;

@Service
public class SubjectService {

	 @Autowired
	    private SubjectRepository subjectRepository;

	    public Subject saveSubject(Subject subject) {
	        return subjectRepository.save(subject);
	    }

	    public List<Subject> getAllSubjects() {
	        return subjectRepository.findAll();
	    }
}
