package org.itsci.project.service;

import org.itsci.project.dao.StudentDao;
import org.itsci.project.model.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;
@Service
public class StudentServiceImpl implements StudentService{

    @Autowired
    private StudentDao studentDao;
    @Override
    @Transactional
    public List<Student> getStudents() {
        return studentDao.getStudents();
    }

    @Override
    @Transactional
    public void saveStudents(Student student) {
studentDao.saveStudents(student);
    }

    @Override
    @Transactional
    public Student getStudents(String student_id) {
        return studentDao.getStudents(student_id);
    }

    @Override
    @Transactional
    public void deleteStudent(String student_id) {
        studentDao.deleteStudent(student_id);
    }

    @Override
    @Transactional
    public void updateStudents(Student studentEntity, Student student) {
        Student hotelEntity = studentDao.getStudents(student.getStudent_id());
    }
}
