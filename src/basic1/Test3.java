package basic1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public abstract class Test3 {

	public static void main(String[] args)
	{
				WebDriver Driver = new ChromeDriver();
				Driver.get("https://www.amazon.in/");
	}

}
