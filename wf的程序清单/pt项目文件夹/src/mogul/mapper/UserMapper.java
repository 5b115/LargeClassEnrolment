package mogul.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

import mogul.pojo.User;

public interface UserMapper {

	List<User> checkUserLogin(@Param("mname")String mname,@Param("mpassword")String mpassword);
	int insUser(@Param("user")User user);
}
