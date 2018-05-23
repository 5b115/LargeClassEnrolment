package edu.zut.cs.javaee.dream.customer.service;

import edu.zut.cs.javaee.dream.base.service.GenericManagerTestCase;
import edu.zut.cs.javaee.dream.customer.domain.Customer;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.assertEquals;

public class CustomerManagerTest extends GenericManagerTestCase<Long, Customer, CustomerManager> {

    @Autowired
    CustomerManager customerManager;

    public CustomerManagerTest() {
        super(Customer.class);
    }

    @Test
    public void testFindByPostcode() {
        String postcode = "NR74DU";
        List<Customer> result = this.customerManager.findByPostcode(postcode);
        List<Customer> expected = new ArrayList<Customer>();
        for (int i = 0; i < 10; i++) {
            Customer u = new Customer();
            expected.add(u);
        }
        assertEquals(expected.size(), result.size());

    }

}
