package com.ms2.datas.repository;

import com.ms2.datas.model.Student;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ResultRepository extends JpaRepository<Student, String> {
}
