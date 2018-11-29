package mogul.service;

import java.io.IOException;
import java.util.List;

import mogul.pojo.Course;

public interface CourseService {
	List<Course> selAll() throws IOException; 
}
