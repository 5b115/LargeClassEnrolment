package edu.zut.cs.javaee.dream.admin.service.impl;

import edu.zut.cs.javaee.dream.admin.domain.Role;
import edu.zut.cs.javaee.dream.admin.service.RoleManager;
import edu.zut.cs.javaee.dream.base.service.impl.GenericManagerImpl;
import org.springframework.stereotype.Component;

@Component
public class RoleManagerImpl extends GenericManagerImpl<Role, Long> implements RoleManager {

}
