package mogul.dao;

import mogul.pojo.User;


public interface LoginDao {
	//�����û����������ȡ�û���Ϣ
	User checkLoginDao(String uname,String pwd);
	//����uid��ȡ�û���Ϣ
	User checkUidDao(String uid);
}
