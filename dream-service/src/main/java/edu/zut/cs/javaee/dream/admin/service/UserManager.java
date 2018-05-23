package edu.zut.cs.javaee.dream.admin.service;

import edu.zut.cs.javaee.dream.admin.domain.User;
import edu.zut.cs.javaee.dream.base.service.GenericManager;

import java.util.List;

public interface UserManager extends GenericManager<User, Long> {

    List<User> findAll();

    User findbyUsername(String username);
}
