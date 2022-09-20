package basic1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public abstract class Test2 {

	public static void main(String[] args)
	{
		WebDriver Driver = new ChromeDriver();
		Driver.get("https://www.facebook.com/");
		System.out.println(Driver.getTitle());
		System.out.println(Driver.getCurrentUrl());
		System.out.println(Driver.getPageSource());
		Driver.close();

	}

}
