package mogul.servlet;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import mogul.pojo.Course;
import mogul.service.CourseService;
import mogul.service.impl.CourseServiceImpl;

public class SelAllServlet extends HttpServlet {
	private CourseService courseService=new CourseServiceImpl();

	protected void service(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
		List<Course> list=courseService.selAll();
		req.setAttribute("list", list);
		req.getRequestDispatcher("selall_course.jsp").forward(req, resp);
	
	}
}
