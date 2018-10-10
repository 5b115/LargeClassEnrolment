package edu.zut.cs.javaee.dream.admin.service;

import org.apache.logging.log4j.Logger;
import org.apache.logging.log4j.LogManager;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import edu.zut.cs.javaee.dream.admin.domain.Group;
import edu.zut.cs.javaee.dream.base.service.GenericTreeManagerTestCase;

public class GroupManagerTest extends GenericTreeManagerTestCase<Long, Group, GroupManager> {
	/**
	 * Logger for this class
	 */
	private static final Logger logger = LogManager.getLogger(GroupManagerTest.class.getName());

    GroupManager groupManager;

    public GroupManagerTest() {
        super(Group.class);
    }

    @Autowired
    public void setGroupManager(GroupManager groupManager) {
        this.groupManager = groupManager;
        this.manager = this.groupManager;
        List<Group> result = this.groupManager.findAll();
		if (logger.isInfoEnabled()) {
			logger.info("setGroupManager(GroupManager) - List<Group> result={}", result); //$NON-NLS-1$
		}
        
    }

}
