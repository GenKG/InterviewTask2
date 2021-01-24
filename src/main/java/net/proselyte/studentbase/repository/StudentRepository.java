package net.proselyte.studentbase.repository;

import net.proselyte.studentbase.model.Student;
import org.springframework.data.jpa.repository.JpaRepository;


public interface StudentRepository extends JpaRepository<Student,Long> {
}
