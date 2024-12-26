package week2.day3;

public class BaseClass {

	public void startApp(String browser,String url) {
		System.out.println(browser+" "+url);
	}
	public void startApp(String url) {
		System.out.println("Default browser :"+" "+url);
	}
	
	public void startApp(String browser,String url,boolean headless) {
		
		System.out.println(browser+" "+url+" "+headless);
	}
	
	public int math(int a,int b) {
		return a+b;
		
	}
	public int math(int c,int d,int e) {
		return c-d-e;
		
	}
	
	public static void main(String[] args) {
		
		BaseClass bs=new BaseClass();
		
		bs.startApp("https://www.gmail.com");
		bs.startApp("Chrome Browser", "https://www.testleaf.com");
		bs.startApp("Edge Browser", "https://platform.testleaf.com", false);
		
	
		//example -println()
		System.out.println();
	}
	
	
	
}
