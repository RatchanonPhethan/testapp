package org.itsci.project.model;

import javax.persistence.*;

@Entity
@Table(name = "projects")
public class Project {
    @Id
    private String project_id;

    @Column(name = "projectname")
    private String projectname;

    @Column(name = "semester")
    private String semester;

    @OneToOne
    @JoinColumn(name = "student_id")
    private Student student_id;

    @ManyToOne
    @JoinColumn(name = "adviser_id")
    private Adviser adviser_id;

    @ManyToOne
    @JoinColumn(name = "category_id")
    private Category category_id;

    public String getProject_id() {
        return project_id;
    }

    public void setProject_id(String project_id) {
        this.project_id = project_id;
    }

    public String getProjectname() {
        return projectname;
    }

    public void setProjectname(String projectname) {
        this.projectname = projectname;
    }

    public String getSemester() {
        return semester;
    }

    public void setSemester(String semester) {
        this.semester = semester;
    }

    public Student getStudent_id() {
        return student_id;
    }

    public void setStudent_id(Student student_id) {
        this.student_id = student_id;
    }

    public Adviser getAdviser_id() {
        return adviser_id;
    }

    public void setAdviser_id(Adviser adviser_id) {
        this.adviser_id = adviser_id;
    }

    public Category getCategory_id() {
        return category_id;
    }

    public void setCategory_id(Category category_id) {
        this.category_id = category_id;
    }
}
