package edu.zut.cs.javaee.dream.admin.dao;

import edu.zut.cs.javaee.dream.admin.domain.Role;
import edu.zut.cs.javaee.dream.base.dao.GenericDaoTestCase;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

import static org.junit.Assert.assertEquals;

public class RoleDaoTest extends GenericDaoTestCase<Long, Role, RoleDao> {
    /**
     * Logger for this class
     */


    @Autowired
    RoleDao roleDao;

    @Test
    public void test() {
        Role r = new Role();
        r.setName("test_role");
        Role test_role = this.roleDao.save(r);
        Long role_id = test_role.getId();
        Role result = this.roleDao.getOne(role_id);
        assertEquals(test_role, result);
        List<Role> all = this.roleDao.findAll();
        if (logger.isInfoEnabled()) {
            logger.info("test() - List<Role> all size ={}", all.size()); //$NON-NLS-1$
        }
    }

}
