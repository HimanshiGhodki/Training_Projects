
public class Message {
	private String str;

	public String getStr() {
		return str;
	}

	public void setStr(String str) {
		this.str = str;
	}

	public Message() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public Message(String s) {
		super();
		this.str=s;
		// TODO Auto-generated constructor stub
	}
	
	public void displayStr()
	{
		System.out.println(str);
	}

	public void init()
	{
		System.out.println("Initialising the method");
	}
	
	public void destroy()
	{
		System.out.println("Destroying the method");
	}
}
