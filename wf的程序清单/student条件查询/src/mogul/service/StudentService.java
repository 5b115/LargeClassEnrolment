package mogul.service;

import mogul.pojo.PageInfo;

public interface StudentService {
	PageInfo showPage(String sname,String tname,String pageSize,String pageNumber);
}
