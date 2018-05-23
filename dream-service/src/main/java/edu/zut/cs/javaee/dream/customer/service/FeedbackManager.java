package edu.zut.cs.javaee.dream.customer.service;

import edu.zut.cs.javaee.dream.base.service.GenericManager;
import edu.zut.cs.javaee.dream.customer.domain.FeedBack;

import java.util.List;

public interface FeedbackManager extends GenericManager<FeedBack, Long> {


    List<FeedBack> findByCustomer(String customerId);
}
