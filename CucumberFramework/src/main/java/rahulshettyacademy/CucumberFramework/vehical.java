package rahulshettyacademy.CucumberFramework;

import org.testng.annotations.Test;

import rahulshettyacademy.CucumberFramework.motor;

public class vehical
{
	motor mo;
	
	public void wheels()
	{
		
		mo = new motor(12, 10,"Pavan","Ingale");
		
		/*mo.setaddition(12);
		mo.setminus(10);
		mo.setdivide("Pavan");
		mo.setmulti("Ingale");	*/
	}
	
	@Test
	public void bonet()
	{
		int added = this.mo.getaddition();
		
		audicar car = new audicar();
		car.getcar(added);
		
		
		
	}
	
	
	
	

}
