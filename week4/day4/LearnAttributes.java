package week4.day4;

import org.testng.annotations.Test;

public class LearnAttributes {

	@Test(priority = 1)
	public void editLead() {
		System.out.println("EDIT Lead");
	}
	
	@Test(enabled=false)
	public void createLead() {
		System.out.println("CREATE Lead");
	}
	
	@Test(priority = -2)
	public void deleteLead() {
		System.out.println("DELETE Lead");
	}
	
}
