package com.student.StudentManagement.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


import com.student.StudentManagement.entity.Subject;
import com.student.StudentManagement.service.SubjectService;

@RestController
@RequestMapping("/subjects")
public class SubjectController {

	 @Autowired
	    private SubjectService subjectService;

	 @PostMapping
	    public ResponseEntity<Subject> createSubject(@RequestBody Subject subject) {
	        Subject createdSubject = subjectService.saveSubject(subject);
	        return ResponseEntity.ok(createdSubject);
	    }

	    @GetMapping
	    public ResponseEntity<List<Subject>> getAllSubjects() {
	        List<Subject> subjects = subjectService.getAllSubjects();
	        return ResponseEntity.ok(subjects);
	    }
}