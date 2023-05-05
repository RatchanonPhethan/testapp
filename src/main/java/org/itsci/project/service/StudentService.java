package org.itsci.project.service;

import org.itsci.project.model.Student;

import java.util.List;

public interface StudentService {

    List<Student> getStudents();
    void saveStudents(Student student);
    Student getStudents(String student_id);
    void deleteStudent(String student_id);
    void updateStudents(Student studentEntity, Student student);

}
