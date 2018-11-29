package mogul.servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;



import javax.servlet.http.HttpSession;

import mogul.pojo.User;
import mogul.service.UserService;
import mogul.service.impl.UserServiceImpl;

public class InsertUserServlet extends HttpServlet {
	private UserService userService=new UserServiceImpl();
	@Override
	protected void service(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
		req.setCharacterEncoding("utf-8");
		String mnumber=req.getParameter("mnumber");
		String mname=req.getParameter("mname");
		String mrole=req.getParameter("mrole");
		String mpassword=req.getParameter("mpassword");
		User user=new User();
		user.setMnumber(mnumber);
		user.setMname(mname);
		user.setMrole(mrole);
		user.setMpassword(mpassword);
		int ins=userService.insUser(user);
		if(ins>0){
			HttpSession hs=req.getSession();
			hs.setAttribute("ins", "true");
			resp.sendRedirect("/pt/success/insert_success.jsp");
			return;
		}else{
			resp.sendRedirect("/pt/error/insert_error.jsp");
			return;
		}
	}
	

}
