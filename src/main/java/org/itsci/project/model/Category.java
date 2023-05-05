package org.itsci.project.model;

import javax.persistence.*;

@Entity
@Table(name = "categorys")
public class Category {
    @Id
    private String category_id;

    @Column(name = "categoryname")
    private String categoryname;

    public String getCategory_id() {
        return category_id;
    }

    public void setCategory_id(String category_id) {
        this.category_id = category_id;
    }

    public String getCategoryname() {
        return categoryname;
    }

    public void setCategoryname(String categoryname) {
        this.categoryname = categoryname;
    }
}
