package mogul.mapper;

import java.util.List;

import mogul.pojo.PageInfo;
import mogul.pojo.Student;

public interface StudentMapper {
	List<Student> selByPage(PageInfo pi);
	long selCountByPageInfo(PageInfo pi);
}
