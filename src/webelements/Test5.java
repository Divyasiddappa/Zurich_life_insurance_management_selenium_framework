package webelements;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test5 
{

	public static void main(String[] args)
	{

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.amazon.in/gp/cart/view.html?ref_=nav_cart");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		 WebElement user = driver.findElement(By.id("twotabsearchtextbox"));
		 if (user.isDisplayed())
		 {
			 System.out.println("pass:element is displayed");
			 user.sendKeys("admin");
		 }
		 else
		 {
			 System.out.println("fail:element is  not displayed");
	
		 }
		 driver.close();
	}

}
