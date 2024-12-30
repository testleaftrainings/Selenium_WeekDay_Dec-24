package week3.day1;

public abstract class RemoteDriver implements WebDriver {

	@Override
	public void findElement() {
		System.out.println("FindElement - Abstract class");
		
	}

	@Override
	public void findElements() {
		System.out.println("FindElements - Abstract Class");
		
	}
	
	public void frame() {
		System.out.println("Own method is frame");
	}

	
	//atleast one abstract method
	abstract void window();
	
	
	
	//abstract class- 0 to 100 % Abstract method
	//both - implement and unimplement methods
	
	
	public static void main(String[] args) {
		
		//for interface can able to create object ? No
		//WebDriver w=new WebDriver();
		
		//for Abstract class we can able to create object? NO
		//RemoteDriver rd=new RemoteDriver();
		
		
		
		
	}
	
}
