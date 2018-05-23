package edu.zut.cs.javaee.dream.admin.service;

import edu.zut.cs.javaee.dream.admin.domain.Group;
import edu.zut.cs.javaee.dream.base.service.GenericTreeManagerTestCase;
import org.springframework.beans.factory.annotation.Autowired;

public class GroupManagerTest extends GenericTreeManagerTestCase<Long, Group, GroupManager> {

    GroupManager groupManager;

    public GroupManagerTest() {
        super(Group.class);
    }

    @Autowired
    public void setGroupManager(GroupManager groupManager) {
        this.groupManager = groupManager;
        this.manager = this.groupManager;
    }

}
