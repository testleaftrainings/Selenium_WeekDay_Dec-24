package week3.day1;

public interface WebDriver {
//till java 1.7 its 100% abstract method
	
	//after 1.7 -> static method, default method
	
	public void findElement();

	public void findElements();
	
	public void close();
	
	//public void frame();
	
	static void quit() {
		System.out.println("Quit method");
	}
	
	default void get() {
		System.out.println("Get url");
	}
}
