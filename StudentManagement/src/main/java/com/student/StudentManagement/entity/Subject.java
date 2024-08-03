package com.student.StudentManagement.entity;

import java.util.HashSet;
import java.util.Set;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToMany;

@Entity
public class Subject {

	 @Id
	    @GeneratedValue(strategy = GenerationType.IDENTITY)
	    private Long id;

	    private String name;

	    @ManyToMany(mappedBy = "subjects")
	    private Set<Student> students = new HashSet<>();

		public Subject(Long id, String name, Set<Student> students) {
			super();
			this.id = id;
			this.name = name;
			this.students = students;
		}

		public Subject() {
			super();
			// TODO Auto-generated constructor stub
		}

		public Long getId() {
			return id;
		}

		public void setId(Long id) {
			this.id = id;
		}

		public String getName() {
			return name;
		}

		public void setName(String name) {
			this.name = name;
		}

		public Set<Student> getStudents() {
			return students;
		}

		public void setStudents(Set<Student> students) {
			this.students = students;
		}

		@Override
		public String toString() {
			return "Subject [id=" + id + ", name=" + name + ", students=" + students + "]";
		}

		
	    

}
