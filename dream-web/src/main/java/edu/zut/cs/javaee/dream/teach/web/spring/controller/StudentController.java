package edu.zut.cs.javaee.dream.teach.web.spring.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import edu.zut.cs.javaee.dream.base.web.spring.controller.GenericController;
import edu.zut.cs.javaee.dream.teach.domain.Student;
import edu.zut.cs.javaee.dream.teach.service.StudentManager;
/**
 *  教学管理->学生基本信息管理
 * @author liuxiaoming
 *
 */
@Controller
@RequestMapping("/teach/student")
public class StudentController extends GenericController<Student, Long, StudentManager> {

	StudentManager studentManager;

	@RequestMapping(method = RequestMethod.GET, value = "/index.html")
	public String index() {
		String result = "/student/index";
		return result;
	}

	@Autowired
	public void setStudentManager(StudentManager studentManager) {
		this.studentManager = studentManager;
		this.manager = this.studentManager;
	}

}
