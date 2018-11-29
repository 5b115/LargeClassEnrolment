package mogul.pojo;

public class User {
	private String mnumber;
	private String mname;
	private String mrole;
	private String mpassword;
	public String getMnumber() {
		return mnumber;
	}
	public void setMnumber(String mnumber) {
		this.mnumber = mnumber;
	}
	public String getMname() {
		return mname;
	}
	public void setMname(String mname) {
		this.mname = mname;
	}
	public String getMrole() {
		return mrole;
	}
	public void setMrole(String mrole) {
		this.mrole = mrole;
	}
	public String getMpassword() {
		return mpassword;
	}
	public void setMpassword(String mpassword) {
		this.mpassword = mpassword;
	}
	@Override
	public String toString() {
		return "User [mnumber=" + mnumber + ", mname=" + mname + ", mrole="
				+ mrole + ", mpassword=" + mpassword + "]";
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((mname == null) ? 0 : mname.hashCode());
		result = prime * result + ((mnumber == null) ? 0 : mnumber.hashCode());
		result = prime * result
				+ ((mpassword == null) ? 0 : mpassword.hashCode());
		result = prime * result + ((mrole == null) ? 0 : mrole.hashCode());
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
		User other = (User) obj;
		if (mname == null) {
			if (other.mname != null)
				return false;
		} else if (!mname.equals(other.mname))
			return false;
		if (mnumber == null) {
			if (other.mnumber != null)
				return false;
		} else if (!mnumber.equals(other.mnumber))
			return false;
		if (mpassword == null) {
			if (other.mpassword != null)
				return false;
		} else if (!mpassword.equals(other.mpassword))
			return false;
		if (mrole == null) {
			if (other.mrole != null)
				return false;
		} else if (!mrole.equals(other.mrole))
			return false;
		return true;
	}
	public User(String mnumber, String mname, String mrole, String mpassword) {
		super();
		this.mnumber = mnumber;
		this.mname = mname;
		this.mrole = mrole;
		this.mpassword = mpassword;
	}
	public User() {
		super();
		// TODO Auto-generated constructor stub
	}
	
}
