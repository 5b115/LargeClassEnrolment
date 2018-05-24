package edu.zut.cs.javaee.dream.module.service;

import org.springframework.beans.factory.annotation.Autowired;

import edu.zut.cs.javaee.dream.base.service.GenericManagerTestCase;
import edu.zut.cs.javaee.dream.customer.domain.Customer;
import edu.zut.cs.javaee.dream.customer.service.CustomerManager;

public class ModuleManagerTest extends GenericManagerTestCase<Long, Customer, CustomerManager> {

    @Autowired
    ModuleManager moduleManager;

    public ModuleManagerTest() {
        super(Customer.class);
    }

}
