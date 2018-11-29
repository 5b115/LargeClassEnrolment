package mogul.service.impl;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import mogul.mapper.UserMapper;
import mogul.pojo.User;
import mogul.service.UserService;
import mogul.util.MyBatisUtil;

public class UserServiceImpl implements UserService	{
	
	@Override
	public List<User> checkUserLogin(String mname, String mpassword) {
		SqlSession session=MyBatisUtil.getSession();
		UserMapper mapper=session.getMapper(UserMapper.class);
		List<User> list=mapper.checkUserLogin(mname, mpassword);
		
		return list;
	}

	@Override
	public int insUser(User user) {
		SqlSession session = MyBatisUtil.getSession();
		UserMapper mapper = session.getMapper(UserMapper.class);
		int ins = mapper.insUser(user);
		return ins;
	}
		

}
