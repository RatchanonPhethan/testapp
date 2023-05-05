package org.itsci.project.dao;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;
import org.itsci.project.model.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;
@Repository
public class StudentDaoImpl implements StudentDao{
    @Autowired
    private SessionFactory sessionFactory;


    @Override
    public List<Student> getStudents() {
        Session session = sessionFactory.getCurrentSession();
        Query<Student> query = session.createQuery("from Student ",
                Student.class);
        List<Student> students = query.getResultList();
        return students;
    }

    @Override
    public void saveStudents(Student student) {
        Session session = sessionFactory.getCurrentSession();
        session.saveOrUpdate(student);
    }

    @Override
    public Student getStudents(String student_id) {
        Session session = sessionFactory.getCurrentSession();
        Student student = session.get(Student.class, student_id);
        return student;
    }

    @Override
    public void deleteStudent(String student_id) {
        Session session = sessionFactory.getCurrentSession();
        Query query = session.createQuery("delete from Student where id=:student_id");
        query.setParameter("student_id", student_id);
        query.executeUpdate();
    }

    @Override
    public Student getStudentByCode(String code) {

        Session session = sessionFactory.getCurrentSession();
        Query<Student> query = session.createQuery("from Student where id=:code", Student.class);
        query.setParameter("code", code);
        Student student = query.getSingleResult();
        return student;
    }
}
