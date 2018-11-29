package mogul.service;

import java.util.List;

import mogul.pojo.User;

public interface UserService {
	List<User> checkUserLogin(String mname,String mpassword);
	int insUser(User user);
}	
