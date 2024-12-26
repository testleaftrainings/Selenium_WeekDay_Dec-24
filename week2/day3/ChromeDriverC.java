package week2.day3;

public class ChromeDriverC extends ChromiumDriverP{

	public void loadUrl() {
		System.out.println("its C class");
	}
	public static void main(String[] args) {
		ChromeDriverC c=new ChromeDriverC();
		c.findElement();
		c.launchBrowser();
		c.loadUrl();
	}
}
