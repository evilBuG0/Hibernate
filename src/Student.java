import java.util.Date;

//学生类
public class Student {
	/***
	 * 1：公有类
	 * 2：提供共有的不带参数的默认的构造方法
	 * 3：属性私有
	 * 4：属性使用setter和getter封装
	 */
	private int sid;
	private String sname;
	private String gender;
	private Date birthday;
	private String address;
	public Student() {
		
	}
	public Student(int sid, String sname, String gender, Date birthday, String address) {
		
		this.sid = sid;
		this.sname = sname;
		this.gender = gender;
		this.birthday = birthday;
		this.address = address;
	}
	public int getSid() {
		return sid;
	}
	public String getSname() {
		return sname;
	}
	public String getGender() {
		return gender;
	}
	public Date getBirthday() {
		return birthday;
	}
	public String getAddress() {
		return address;
	}
	public void setSid(int sid) {
		this.sid = sid;
	}
	public void setSname(String sname) {
		this.sname = sname;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public void setBirthday(Date birthday) {
		this.birthday = birthday;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	@Override
	public String toString() {
		return "Student [sid=" + sid + ", sname=" + sname + ", gender=" + gender + ", birthday=" + birthday
				+ ", address=" + address + "]";
	}
	
	
	
}
