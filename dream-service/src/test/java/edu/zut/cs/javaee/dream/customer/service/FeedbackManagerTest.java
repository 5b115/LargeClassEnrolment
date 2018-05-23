package edu.zut.cs.javaee.dream.customer.service;

import edu.zut.cs.javaee.dream.base.service.GenericManagerTestCase;
import edu.zut.cs.javaee.dream.customer.domain.FeedBack;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.assertEquals;

public class FeedbackManagerTest extends GenericManagerTestCase<Long, FeedBack, FeedbackManager> {

    FeedbackManager feedbackManager;

    public FeedbackManagerTest() {
        super(FeedBack.class);
    }

    @Autowired
    public void setFeedbackManager(FeedbackManager feedbackManager) {
        this.feedbackManager = feedbackManager;
        this.manager = this.feedbackManager;
    }

    @Test
    public void testFindByCustomer() {
        String customerId = "customerId_1";
        List<FeedBack> result = this.feedbackManager.findByCustomer(customerId);
        List<FeedBack> expected = new ArrayList<FeedBack>();
        for (int i = 0; i < 10; i++) {
            FeedBack feedback = new FeedBack();
            expected.add(feedback);
        }
        assertEquals(expected.size(), result.size());
    }

}
