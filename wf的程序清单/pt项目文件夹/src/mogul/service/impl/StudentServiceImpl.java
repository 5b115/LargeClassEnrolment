package mogul.service.impl;

import java.util.List;

import org.apache.ibatis.session.SqlSession;

import mogul.mapper.StudentMapper;
import mogul.pojo.Student;
import mogul.service.StudentService;
import mogul.util.MyBatisUtil;

public class StudentServiceImpl implements StudentService{

	public List<Student> selAllStudent() {
		SqlSession session=MyBatisUtil.getSession();
		StudentMapper mapper=session.getMapper(StudentMapper.class);
		return mapper.selAllStudent();
	}
	

}
