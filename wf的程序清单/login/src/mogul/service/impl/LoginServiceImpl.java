package mogul.service.impl;

import mogul.dao.LoginDao;
import mogul.dao.impl.LoginDaoImpl;
import mogul.pojo.User;
import mogul.service.LoginService;

public class LoginServiceImpl implements LoginService{
	//����Dao�������
	LoginDao ld=new LoginDaoImpl();
	//У���û���¼��Ϣ
	@Override
	public User checkLoginService(String uname, String pwd) {
		
		return ld.checkLoginDao(uname, pwd);
	}
	//У��Cookie��Ϣ
	@Override
	public User checkUidService(String uid) {
		return ld.checkUidDao(uid);
	}
	
}