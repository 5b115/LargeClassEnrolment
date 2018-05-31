package edu.zut.cs.javaee.dream.teach.web.spring.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import edu.zut.cs.javaee.dream.base.web.spring.controller.GenericController;
import edu.zut.cs.javaee.dream.teach.domain.Student;
import edu.zut.cs.javaee.dream.teach.service.StudentManager;

@Controller
@RequestMapping("/student")
public class StudentController extends GenericController<Student, Long, StudentManager> {

    StudentManager studentManager;

    @Autowired
    public void setStudentManager(StudentManager studentManager) {
        this.studentManager = studentManager;
        this.manager = this.studentManager;
    }

}
