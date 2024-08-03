package com.student.StudentManagement.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.student.StudentManagement.entity.User;

public interface UserRepository extends JpaRepository<User, Long> {
    User findByUsername(String username);
}
