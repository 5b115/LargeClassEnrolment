package edu.zut.cs.javaee.dream.customer.service.impl;

import edu.zut.cs.javaee.dream.base.service.impl.GenericManagerImpl;
import edu.zut.cs.javaee.dream.customer.dao.FeedBackDao;
import edu.zut.cs.javaee.dream.customer.domain.FeedBack;
import edu.zut.cs.javaee.dream.customer.service.FeedbackManager;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class FeedBackManagerImpl extends GenericManagerImpl<FeedBack, Long> implements FeedbackManager {

    FeedBackDao feedBackDao;

    @Autowired
    public void setFeedBackDao(FeedBackDao feedBackDao) {
        this.feedBackDao = feedBackDao;
        this.dao = this.feedBackDao;
    }

    @Override
    public List<FeedBack> findByCustomer(String customerId) {
        List<FeedBack> all = new ArrayList<FeedBack>();
        for (int i = 0; i < 10; i++) {
            FeedBack feedback = new FeedBack();
            all.add(feedback);
        }
        return all;
    }

}
