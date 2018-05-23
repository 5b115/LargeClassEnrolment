package edu.zut.cs.javaee.dream.module.service.impl;

import edu.zut.cs.javaee.dream.base.service.impl.GenericTreeManagerImpl;
import edu.zut.cs.javaee.dream.module.dao.ModuleDao;
import edu.zut.cs.javaee.dream.module.domain.Module;
import edu.zut.cs.javaee.dream.module.service.ModuleManager;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class ModuleManagerImpl extends GenericTreeManagerImpl<Module, Long> implements ModuleManager {

    ModuleDao moduleDao;

    @Autowired
    public void setModuleDao(ModuleDao moduleDao) {
        this.moduleDao = moduleDao;
        this.dao = this.moduleDao;
        this.treeDao = this.moduleDao;
    }

}
