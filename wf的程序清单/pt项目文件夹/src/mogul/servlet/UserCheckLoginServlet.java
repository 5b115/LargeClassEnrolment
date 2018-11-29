package mogul.servlet;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import mogul.pojo.User;
import mogul.service.UserService;
import mogul.service.impl.UserServiceImpl;

public class UserCheckLoginServlet extends HttpServlet {
	UserService userService=new UserServiceImpl();
	@Override
	protected void service(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
		req.setCharacterEncoding("utf-8");
		//获取请求内容
		String mname=req.getParameter("mname");
		String mpassword=req.getParameter("mpassword");
		//校验
		List<User> list = userService.checkUserLogin(mname, mpassword);		
		if(list.size()!=0){
			HttpSession hs=req.getSession();
			hs.setAttribute("list", list);
			resp.sendRedirect("/pt/main/main.jsp");
			return;
		}else{
			req.setAttribute("flag", 0);
			req.getRequestDispatcher("login.jsp").forward(req, resp);
			return;
		}
	}

}
