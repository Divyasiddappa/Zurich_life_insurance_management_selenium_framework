package xpath;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test1 
{

	public static void main(String[] args) throws InterruptedException
	{
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/login/");
		Thread.sleep(3000);
		driver.findElement(By.id("email")).sendKeys("myself");
		Thread.sleep(3000);
		driver.findElement(By.name("pass")).sendKeys("myself");
		Thread.sleep(3000);
		driver.findElement(By.name("login")).click();
		Thread.sleep(3000);
		String title = driver.getTitle();
		Thread.sleep(3000);
		System.out.println(title);
		if(title.equals("Log in to Facebook"))
		{
			System.out.println("pass");
		}
		else
		{
			System.out.println("fail");
		}
		String url = driver.getCurrentUrl();
		System.out.println(url);
	}

}
