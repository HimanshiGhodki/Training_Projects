public class Company 
{
	private String cname;
	private String cadd;
	
	public Company() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Company(String cname, String cadd) {
		super();
		this.cname = cname;
		this.cadd = cadd;
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
	

}
