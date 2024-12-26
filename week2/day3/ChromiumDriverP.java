package week2.day3;

public class ChromiumDriverP extends RemoteWebDriverGP{

	public void launchBrowser() {
		System.out.println("its P class");
	}
	
	
	public static void main(String[] args) {
		ChromiumDriverP cd=new ChromiumDriverP();
		cd.findElement();
		cd.launchBrowser();
	}
}
