package edu.zut.cs.javaee.dream.admin.domain;

import edu.zut.cs.javaee.dream.base.domain.BaseEntity;

import javax.persistence.*;

@Table(name = "T_ADMIN_USER")
@Entity
public class User extends BaseEntity {

    /**
     *
     */
    private static final long serialVersionUID = -4376674977047164142L;

    @Column(name = "USERNAME")
    String username;

    @Column(name = "PASSWORD")
    String password;

    @Column(name = "EMAIL")
    String email;
    @ManyToOne
    @JoinColumn(name = "GROUP_ID")
    Group group;

    public Group getGroup() {
        return group;
    }

    public void setGroup(Group group) {
        this.group = group;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

}
