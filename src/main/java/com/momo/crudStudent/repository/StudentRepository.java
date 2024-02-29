package com.momo.crudStudent.repository;

import com.momo.crudStudent.entities.Student;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StudentRepository extends JpaRepository<Student, Long> {
}
