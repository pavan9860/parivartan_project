package rahulshettyacademy.CucumberFramework;

public class motor {
	
	
	public static int add;
	public static int minus;
	public static String divide;
	public static String multi;
	
	public motor(int add,int minus,String divide,String multi) 
	{
		
		this.add=add;
		this.minus=minus;
		this.divide=divide;
		this.multi=multi;
		
	}

	public void setaddition(int add)
	{
		this.add = add;
	}
	
	public int getaddition()
	{
		return add;
	}

	public void setminus(int minus)
	{
		this.minus= minus;
	}
	
	public int getminus()
	{
		return minus;
	}
	
	public void setdivide(String divide)
	{
		this.divide = divide;
	}
	
	public String getdivide()
	{
		return divide;
	}
	
	public void setmulti(String multi)
	{
		this.multi= multi;
	}
	
	public String getmulti()
	{
		return multi;
	}
}
