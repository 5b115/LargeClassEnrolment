package mogul.service.impl;

import mogul.dao.LoginDao;
import mogul.dao.impl.LoginDaoImpl;
import mogul.pojo.User;
import mogul.service.LoginService;

public class LoginServiceImpl implements LoginService{
	//创建Dao层过对象
	LoginDao ld=new LoginDaoImpl();
	//校验用户登录信息
	@Override
	public User checkLoginService(String uname, String pwd) {
		
		return ld.checkLoginDao(uname, pwd);
	}
	//校验Cookie信息
	@Override
	public User checkUidService(String uid) {
		return ld.checkUidDao(uid);
	}
	
}