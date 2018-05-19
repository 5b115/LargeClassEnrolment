package edu.zut.cs.javaee.dream.module.service;

import static org.junit.Assert.assertEquals;

import java.util.List;

import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import edu.zut.cs.javaee.dream.base.service.GenericManagerTestCase;
import edu.zut.cs.javaee.dream.customer.domain.Customer;
import edu.zut.cs.javaee.dream.customer.service.CustomerManager;
import edu.zut.cs.javaee.dream.module.domain.Module;

public class ModuleManagerTest extends GenericManagerTestCase<Long, Customer, CustomerManager> {

	public ModuleManagerTest() {
		super(Customer.class);
	}

	@Autowired
	ModuleManager moduleManager;

	@Test
	public void testGeneration() {
		List<Module> roots = this.moduleManager.getRoot();
		assertEquals(10, roots.size());
	}

}
