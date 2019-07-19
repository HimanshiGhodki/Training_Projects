
public class Employee
{
	private String cname;
	private String cadd;
	private String ename;
	private int id;
	private int sal;


	

	public Employee(String cname, String cadd, String ename, int id, int sal) {
		super();
		this.cname = cname;
		this.cadd = cadd;
		this.ename = ename;
		this.id = id;
		this.sal = sal;
	}

	public Employee() {
		super();
		// TODO Auto-generated constructor stub
	}

	public String getCname() {
		return cname;
	}

	public void setCname(String cname) {
		this.cname = cname;
	}

	public String getCadd() {
		return cadd;
	}

	public void setCadd(String cadd) {
		this.cadd = cadd;
	}

	public String getEname() {
		return ename;
	}

	public void setEname(String ename) {
		this.ename = ename;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getSal() {
		return sal;
	}

	public void setSal(int sal) {
		this.sal = sal;
	}

}
