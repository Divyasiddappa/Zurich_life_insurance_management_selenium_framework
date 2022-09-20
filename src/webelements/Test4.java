package webelements;

import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class Test4
{

	public static void main(String[] args)
	{
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://www.amazon.in/gp/cart/view.html?ref_=nav_cart");
		WebElement ele = driver.findElement(By.id("twotabsearchtextbox"));
		Dimension s = ele.getSize();
		 System.out.println(s.getHeight()+"height of the element");
		 System.out.println(s.getWidth()+"width of the element");
		String title = driver.getTitle();
		System.out.println(title);
		String url = driver.getCurrentUrl();
		System.out.println(url);
		driver.close();
		
	}
		}
		

