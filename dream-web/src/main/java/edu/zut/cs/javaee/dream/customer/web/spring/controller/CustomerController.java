package edu.zut.cs.javaee.dream.customer.web.spring.controller;

import edu.zut.cs.javaee.dream.base.web.spring.controller.GenericController;
import edu.zut.cs.javaee.dream.customer.domain.Customer;
import edu.zut.cs.javaee.dream.customer.service.CustomerManager;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/customer")
public class CustomerController extends GenericController<Customer, Long, CustomerManager> {

    CustomerManager customerManager;

    @Autowired
    public void setCustomerManager(CustomerManager customerManager) {
        this.customerManager = customerManager;
        this.manager = this.customerManager;
    }

}
