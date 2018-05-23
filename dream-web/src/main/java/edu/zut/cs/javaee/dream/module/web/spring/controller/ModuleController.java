package edu.zut.cs.javaee.dream.module.web.spring.controller;

import edu.zut.cs.javaee.dream.base.web.spring.controller.GenericTreeController;
import edu.zut.cs.javaee.dream.module.domain.Module;
import edu.zut.cs.javaee.dream.module.service.ModuleManager;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/module")
public class ModuleController extends GenericTreeController<Module, Long, ModuleManager> {

    ModuleManager moduleManager;

    @Autowired
    public void setModuleManager(ModuleManager moduleManager) {
        this.moduleManager = moduleManager;
        this.manager = this.moduleManager;
        this.treeManager = this.moduleManager;
    }

}
