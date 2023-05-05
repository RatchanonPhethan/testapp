package org.itsci.project.dao;

import org.itsci.project.model.Student;

import java.util.List;

public interface StudentDao {
    List<Student> getStudents();
    void saveStudents(Student student);
    Student getStudents(String student_id);
    void deleteStudent(String student_id);
    Student getStudentByCode(String code);
}
