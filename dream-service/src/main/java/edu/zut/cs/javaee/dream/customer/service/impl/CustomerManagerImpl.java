package edu.zut.cs.javaee.dream.customer.service.impl;

import edu.zut.cs.javaee.dream.base.service.impl.GenericManagerImpl;
import edu.zut.cs.javaee.dream.customer.dao.CustomerDao;
import edu.zut.cs.javaee.dream.customer.domain.Customer;
import edu.zut.cs.javaee.dream.customer.service.CustomerManager;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class CustomerManagerImpl extends GenericManagerImpl<Customer, Long> implements CustomerManager {

    CustomerDao customerDao;

    @Autowired
    public void setCustomerDao(CustomerDao customerDao) {
        this.customerDao = customerDao;
        this.dao = this.customerDao;
    }

    @Override
    public List<Customer> findByPostcode(String postcode) {
        List<Customer> result = new ArrayList<Customer>();
        for (int i = 0; i < 10; i++) {
            Customer u = new Customer();
            result.add(u);
        }
        return result;
    }

}
