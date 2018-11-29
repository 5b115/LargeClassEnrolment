package mogul.service.impl;

import java.io.IOException;
import java.io.InputStream;
import java.util.List;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import mogul.mapper.CourseMapper;
import mogul.pojo.Course;
import mogul.service.CourseService;
import mogul.util.MyBatisUtil;

public class CourseServiceImpl implements CourseService{

	public List<Course> selAll() throws IOException {
//		InputStream is=Resources.getResourceAsStream("mybatis.xml");
//		SqlSessionFactory factory=new SqlSessionFactoryBuilder().build(is);
//		SqlSession session=factory.openSession();
		SqlSession session=MyBatisUtil.getSession();
		CourseMapper mapper=session.getMapper(CourseMapper.class);
		
//		session.close();
		return mapper.selAll();
	}



}
