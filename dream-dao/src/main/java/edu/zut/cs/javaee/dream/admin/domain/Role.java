package edu.zut.cs.javaee.dream.admin.domain;

import edu.zut.cs.javaee.dream.base.domain.BaseEntity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Table(name = "T_ADMIN_ROLE")
@Entity
public class Role extends BaseEntity {

	/**
	 *
	 */
	private static final long serialVersionUID = 1L;

	@Column
	String name;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

}
