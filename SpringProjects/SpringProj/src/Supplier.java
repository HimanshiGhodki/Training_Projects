
public class Supplier 
{
	private String sname;
	private String sadd;
	private long mobile;
	public String getSname() {
		return sname;
	}
	public void setSname(String sname) {
		this.sname = sname;
	}
	public String getSadd() {
		return sadd;
	}
	public void setSadd(String sadd) {
		this.sadd = sadd;
	}
	public long getMobile() {
		return mobile;
	}
	public void setMobile(long mobile) {
		this.mobile = mobile;
	}
	public Supplier(String sname, String sadd, long mobile) {
		super();
		this.sname = sname;
		this.sadd = sadd;
		this.mobile = mobile;
	}
	public Supplier() {
		super();
		// TODO Auto-generated constructor stub
	}
	

}
