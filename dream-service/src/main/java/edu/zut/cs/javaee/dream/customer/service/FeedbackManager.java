package edu.zut.cs.javaee.dream.customer.service;

import java.util.List;

import edu.zut.cs.javaee.dream.base.service.GenericManager;
import edu.zut.cs.javaee.dream.customer.domain.FeedBack;

public interface FeedbackManager extends GenericManager<FeedBack, Long> {


    List<FeedBack> findByCustomer(String customerId);
}
