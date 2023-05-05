package org.itsci.project.model;

import javax.persistence.*;
import java.util.Date;
@Entity
@Table(name = "abstracts")
public class Abstract {
    @Id
    private String abstract_id;

    @Column(name = "filename")
    private String filename;

    @Column(name = "uploaddate")
    private Date uploaddate;

    @OneToOne
    @JoinColumn(name = "project_id")
    private Project project_id;

    public String getAbstract_id() {
        return abstract_id;
    }

    public void setAbstract_id(String abstract_id) {
        this.abstract_id = abstract_id;
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

    public Project getProject_id() {
        return project_id;
    }

    public void setProject_id(Project project_id) {
        this.project_id = project_id;
    }
}
