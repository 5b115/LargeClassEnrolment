package mogul.servlet;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import mogul.pojo.Student;
import mogul.service.StudentService;
import mogul.service.impl.StudentServiceImpl;

public class SelAllStudentServlet extends HttpServlet {
	private StudentService studentService=new StudentServiceImpl();
	
	protected void service(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
		List<Student> list=studentService.selAllStudent();
		req.setAttribute("list", list);
		req.getRequestDispatcher("selall_student.jsp").forward(req, resp);
		
	}
}
