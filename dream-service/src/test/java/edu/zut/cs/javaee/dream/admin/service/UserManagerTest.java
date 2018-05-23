package edu.zut.cs.javaee.dream.admin.service;

import edu.zut.cs.javaee.dream.admin.domain.User;
import edu.zut.cs.javaee.dream.base.service.GenericManagerTestCase;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

import static org.junit.Assert.assertEquals;

public class UserManagerTest extends GenericManagerTestCase<Long, User, UserManager> {

    @Autowired
    UserManager userManager;

    public UserManagerTest() {
        super(User.class);
    }

    @Test
    public void testFindAll() {
        List<User> all = this.userManager.findAll();
        assertEquals(all.size(), 100);
    }

    @Test
    public void testFindbyUsername() {
        String username = "world";
        User expected_user = new User();
        // expected_user.setUsername(username);
        User user = this.userManager.findbyUsername(username);
        this.logger.info(user);
        // assertEquals(user.getUsername(), expected_user.getUsername());
        assertEquals(user, expected_user);
    }

}
