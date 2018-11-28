package mogul.pojo;

import java.util.List;

public class PageInfo {
	private int pageSize;
	private int pageNumber;
	//��ʼ��
	private int pageStart;
	private long total;
	private List<?> list;
	//ѧ������
	private String sname;
	//��ʦ����
	private String tname;
	public int getPageSize() {
		return pageSize;
	}
	public void setPageSize(int pageSize) {
		this.pageSize = pageSize;
	}
	public int getPageNumber() {
		return pageNumber;
	}
	public void setPageNumber(int pageNumber) {
		this.pageNumber = pageNumber;
	}
	public int getPageStart() {
		return pageStart;
	}
	public void setPageStart(int pageStart) {
		this.pageStart = pageStart;
	}
	public long getTotal() {
		return total;
	}
	public void setTotal(long total) {
		this.total = total;
	}
	public List<?> getList() {
		return list;
	}
	public void setList(List<?> list) {
		this.list = list;
	}
	public String getSname() {
		return sname;
	}
	public void setSname(String sname) {
		this.sname = sname;
	}
	public String getTname() {
		return tname;
	}
	public void setTname(String tname) {
		this.tname = tname;
	}
	@Override
	public String toString() {
		return "PageInfo [pageSize=" + pageSize + ", pageNumber=" + pageNumber
				+ ", pageStart=" + pageStart + ", total=" + total + ", list="
				+ list + ", sname=" + sname + ", tname=" + tname + "]";
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((list == null) ? 0 : list.hashCode());
		result = prime * result + pageNumber;
		result = prime * result + pageSize;
		result = prime * result + pageStart;
		result = prime * result + ((sname == null) ? 0 : sname.hashCode());
		result = prime * result + ((tname == null) ? 0 : tname.hashCode());
		result = prime * result + (int) (total ^ (total >>> 32));
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		PageInfo other = (PageInfo) obj;
		if (list == null) {
			if (other.list != null)
				return false;
		} else if (!list.equals(other.list))
			return false;
		if (pageNumber != other.pageNumber)
			return false;
		if (pageSize != other.pageSize)
			return false;
		if (pageStart != other.pageStart)
			return false;
		if (sname == null) {
			if (other.sname != null)
				return false;
		} else if (!sname.equals(other.sname))
			return false;
		if (tname == null) {
			if (other.tname != null)
				return false;
		} else if (!tname.equals(other.tname))
			return false;
		if (total != other.total)
			return false;
		return true;
	}
	public PageInfo(int pageSize, int pageNumber, int pageStart, long total,
			List<?> list, String sname, String tname) {
		super();
		this.pageSize = pageSize;
		this.pageNumber = pageNumber;
		this.pageStart = pageStart;
		this.total = total;
		this.list = list;
		this.sname = sname;
		this.tname = tname;
	}
	public PageInfo() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
}
