package com.jobiak.mvclogin.mail;
import org.springframework.data.jpa.repository.JpaRepository;
import com.jobiak.mvclogin.entity.Student;
public interface StudentRepository extends JpaRepository<Student,String> {

}
