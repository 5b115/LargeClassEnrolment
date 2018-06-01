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

	@Column(name = "EMAIL")
	String email;

	@ManyToOne
	@JoinColumn(name = "GROUP_ID")
	Group group;

	@Column(name = "PASSWORD")
	String password;
	@Column(name = "USERNAME")
	String username;

	public String getEmail() {
		return email;
	}

	public Group getGroup() {
		return group;
	}

	public String getPassword() {
		return password;
	}

	public String getUsername() {
		return username;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public void setGroup(Group group) {
		this.group = group;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public void setUsername(String username) {
		this.username = username;
	}

}
