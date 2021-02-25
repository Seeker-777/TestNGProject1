package Test;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Annotations {
	
	@BeforeTest
	public void Beforetest() {
		
		System.out.println("Beforetest Execution");
	}
	
	@BeforeMethod
	public void Beforemethodt() {
		
		System.out.println("Beforemethod Execution");
	}
	
	@Test
	public void method3() {
		
		System.out.println("method3 Execution");
	}
	
	@AfterMethod
	public void Aftermethod() {
		
		System.out.println("Aftermethod Execution");
	}
	
	@AfterTest
	public void Aftertest() {
		
		System.out.println("Aftertest Execution");
	}
	
	

}
