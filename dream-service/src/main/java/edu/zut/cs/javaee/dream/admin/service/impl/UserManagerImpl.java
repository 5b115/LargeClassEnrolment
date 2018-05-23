package edu.zut.cs.javaee.dream.admin.service.impl;

import edu.zut.cs.javaee.dream.admin.dao.UserDao;
import edu.zut.cs.javaee.dream.admin.domain.User;
import edu.zut.cs.javaee.dream.admin.service.UserManager;
import edu.zut.cs.javaee.dream.base.service.impl.GenericManagerImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class UserManagerImpl extends GenericManagerImpl<User, Long> implements UserManager {

    UserDao userDao;

    @Autowired
    public void setUserDao(UserDao userDao) {
        this.userDao = userDao;
        this.dao = this.userDao;
    }

    @Override
    public User findbyUsername(String username) {
        // TODO Auto-generated method stub
        return null;
    }

}
