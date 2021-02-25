package Test;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class ParamEx {
	
	@Test
	@Parameters({"parname"})
	public void parn(String name) {
		
		System.out.println("hi :"+ name);
	}

}
