package mogul.service;

import mogul.pojo.User;

public interface LoginService {
	//У���û���¼��Ϣ
	User checkLoginService(String uname,String pwd);
	//У���û�cookie��Ϣ
	User checkUidService(String uid);
}
