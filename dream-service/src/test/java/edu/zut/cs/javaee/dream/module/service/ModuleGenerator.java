package edu.zut.cs.javaee.dream.module.service;

import edu.zut.cs.javaee.dream.base.service.GenericGenerator;
import edu.zut.cs.javaee.dream.module.domain.Module;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.ArrayList;
import java.util.List;

public class ModuleGenerator extends GenericGenerator {

    @Autowired
    ModuleManager moduleManager;

    @Test
    public void testGeneration() {
        for (int i = 0; i < 10; i++) {
            Module m = new Module();
            m.setName("Module_" + i);
            this.moduleManager.save(m);
            List<Module> list = new ArrayList<Module>();
            for (int j = 0; j < 10; j++) {
                Module module = new Module();
                module.setName("module_" + i + "_" + j);
                module.setParent(m);
                list.add(module);
            }
            this.moduleManager.save(list);
        }
    }
}
