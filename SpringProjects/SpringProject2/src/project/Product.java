package project;


public class Product
{
	private int pcode;
	private String pname;
	private int price;
	private Supplier sob;
	
	public Product() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Product(int pcode, String pname, int price, Supplier sob) {
		super();
		this.pcode = pcode;
		this.pname = pname;
		this.price = price;
		this.sob = sob;
	}
	public int getPcode() {
		return pcode;
	}
	public void setPcode(int pcode) {
		this.pcode = pcode;
	}
	public String getPname() {
		return pname;
	}
	public void setPname(String pname) {
		this.pname = pname;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public Supplier getSob() {
		return sob;
	}
	public void setSob(Supplier sob) {
		this.sob = sob;
	}

}
