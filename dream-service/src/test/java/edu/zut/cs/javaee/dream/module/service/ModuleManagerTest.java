package edu.zut.cs.javaee.dream.module.service;

import edu.zut.cs.javaee.dream.base.service.GenericManagerTestCase;
import edu.zut.cs.javaee.dream.customer.domain.Customer;
import edu.zut.cs.javaee.dream.customer.service.CustomerManager;
import edu.zut.cs.javaee.dream.module.domain.Module;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

import static org.junit.Assert.assertEquals;

public class ModuleManagerTest extends GenericManagerTestCase<Long, Customer, CustomerManager> {

    @Autowired
    ModuleManager moduleManager;

    public ModuleManagerTest() {
        super(Customer.class);
    }

    @Test
    public void testGeneration() {
        List<Module> roots = this.moduleManager.getRoot();
        assertEquals(10, roots.size());
    }

}
