package org.itsci.project.model;

import javax.persistence.*;

@Entity
@Table(name = "advisers")
public class Adviser {
    @Id
    private String adviser_id;
    @Column(name = "prefix")
    private String prefix;

    @Column(name = "firstname")
    private String firstname;
    @Column(name = "lastname")
    private String lastname;

    @Column(name = "mobileno")
    private String mobileno;
    @Column(name = "email")
    private String email;

    @Column(name = "password")
    private String password;

    public String getAdviser_id() {
        return adviser_id;
    }

    public void setAdviser_id(String adviser_id) {
        this.adviser_id = adviser_id;
    }

    public String getPrefix() {
        return prefix;
    }

    public void setPrefix(String prefix) {
        this.prefix = prefix;
    }

    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public String getMobileno() {
        return mobileno;
    }

    public void setMobileno(String mobileno) {
        this.mobileno = mobileno;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
