package edu.zut.cs.javaee.dream.admin.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;

import edu.zut.cs.javaee.dream.base.domain.BaseTreeEntity;

@Table(name = "T_ADMIN_GROUP")
@Entity
@NamedQueries({ @NamedQuery(name = "Group.getRoot", query = "select g  from Group g where g.parent is null") })
public class Group extends BaseTreeEntity<Group> {

	/**
	 * 
	 */
	private static final long serialVersionUID = -1751952224371998469L;

	@Column(name = "NAME")
	String name;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
}
