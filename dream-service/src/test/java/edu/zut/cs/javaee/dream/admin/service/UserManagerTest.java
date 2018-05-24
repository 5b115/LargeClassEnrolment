package edu.zut.cs.javaee.dream.admin.service;

import org.springframework.beans.factory.annotation.Autowired;

import edu.zut.cs.javaee.dream.admin.domain.User;
import edu.zut.cs.javaee.dream.base.service.GenericManagerTestCase;

public class UserManagerTest extends GenericManagerTestCase<Long, User, UserManager> {

	UserManager userManager;

	@Autowired
	public void setUserManager(UserManager userManager) {
		this.userManager = userManager;
		this.manager = this.userManager;
	}

	public UserManagerTest() {
		super(User.class);
	}
}
