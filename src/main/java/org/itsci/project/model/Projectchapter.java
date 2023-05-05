package org.itsci.project.model;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "projectchapters")
public class Projectchapter {
    @Id
    private String projectchapter_id;
    @Column(name = "projectchapter_name")
    private String projectchapter_name;


    @Column(name = "filename")
    private String filename;

    @Column(name = "uploaddate")
    private Date uploaddate;

    @Column(name = "status")
    private String status;
    @ManyToOne
    @JoinColumn(name = "project_id")
    private Project project_id;

    public String getProjectchapter_id() {
        return projectchapter_id;
    }

    public void setProjectchapter_id(String projectchapter_id) {
        this.projectchapter_id = projectchapter_id;
    }

    public String getProjectchapter_name() {
        return projectchapter_name;
    }

    public void setProjectchapter_name(String projectchapter_name) {
        this.projectchapter_name = projectchapter_name;
    }

    public String getFilename() {
        return filename;
    }

    public void setFilename(String filename) {
        this.filename = filename;
    }

    public Date getUploaddate() {
        return uploaddate;
    }

    public void setUploaddate(Date uploaddate) {
        this.uploaddate = uploaddate;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public Project getProject_id() {
        return project_id;
    }

    public void setProject_id(Project project_id) {
        this.project_id = project_id;
    }
}
