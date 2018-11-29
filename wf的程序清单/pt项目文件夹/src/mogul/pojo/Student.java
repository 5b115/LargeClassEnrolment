package mogul.pojo;

public class Student {
	private String snumber;
	private String sname;
	private String ssex;
	private String sacademe;
	private String syear;
	private String sid;
	private String sbirthday;
	private String snation;
	public String getSnumber() {
		return snumber;
	}
	public void setSnumber(String snumber) {
		this.snumber = snumber;
	}
	public String getSname() {
		return sname;
	}
	public void setSname(String sname) {
		this.sname = sname;
	}
	public String getSsex() {
		return ssex;
	}
	public void setSsex(String ssex) {
		this.ssex = ssex;
	}
	public String getSacademe() {
		return sacademe;
	}
	public void setSacademe(String sacademe) {
		this.sacademe = sacademe;
	}
	public String getSyear() {
		return syear;
	}
	public void setSyear(String syear) {
		this.syear = syear;
	}
	public String getSid() {
		return sid;
	}
	public void setSid(String sid) {
		this.sid = sid;
	}
	public String getSbirthday() {
		return sbirthday;
	}
	public void setSbirthday(String sbirthday) {
		this.sbirthday = sbirthday;
	}
	public String getSnation() {
		return snation;
	}
	public void setSnation(String snation) {
		this.snation = snation;
	}
	@Override
	public String toString() {
		return "Student [snumber=" + snumber + ", sname=" + sname + ", ssex="
				+ ssex + ", sacademe=" + sacademe + ", syear=" + syear
				+ ", sid=" + sid + ", sbirthday=" + sbirthday + ", snation="
				+ snation + "]";
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result
				+ ((sacademe == null) ? 0 : sacademe.hashCode());
		result = prime * result
				+ ((sbirthday == null) ? 0 : sbirthday.hashCode());
		result = prime * result + ((sid == null) ? 0 : sid.hashCode());
		result = prime * result + ((sname == null) ? 0 : sname.hashCode());
		result = prime * result + ((snation == null) ? 0 : snation.hashCode());
		result = prime * result + ((snumber == null) ? 0 : snumber.hashCode());
		result = prime * result + ((ssex == null) ? 0 : ssex.hashCode());
		result = prime * result + ((syear == null) ? 0 : syear.hashCode());
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
		Student other = (Student) obj;
		if (sacademe == null) {
			if (other.sacademe != null)
				return false;
		} else if (!sacademe.equals(other.sacademe))
			return false;
		if (sbirthday == null) {
			if (other.sbirthday != null)
				return false;
		} else if (!sbirthday.equals(other.sbirthday))
			return false;
		if (sid == null) {
			if (other.sid != null)
				return false;
		} else if (!sid.equals(other.sid))
			return false;
		if (sname == null) {
			if (other.sname != null)
				return false;
		} else if (!sname.equals(other.sname))
			return false;
		if (snation == null) {
			if (other.snation != null)
				return false;
		} else if (!snation.equals(other.snation))
			return false;
		if (snumber == null) {
			if (other.snumber != null)
				return false;
		} else if (!snumber.equals(other.snumber))
			return false;
		if (ssex == null) {
			if (other.ssex != null)
				return false;
		} else if (!ssex.equals(other.ssex))
			return false;
		if (syear == null) {
			if (other.syear != null)
				return false;
		} else if (!syear.equals(other.syear))
			return false;
		return true;
	}
	public Student(String snumber, String sname, String ssex, String sacademe,
			String syear, String sid, String sbirthday, String snation) {
		super();
		this.snumber = snumber;
		this.sname = sname;
		this.ssex = ssex;
		this.sacademe = sacademe;
		this.syear = syear;
		this.sid = sid;
		this.sbirthday = sbirthday;
		this.snation = snation;
	}
	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}
	
}
