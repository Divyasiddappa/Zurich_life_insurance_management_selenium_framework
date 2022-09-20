package doubleclick;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Skillrary {

	public static void main(String[] args) throws InterruptedException 
	{
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demoapp.skillrary.com/login.php?type=login");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		 WebElement ele=driver.findElement(By.id("course"));
		 Actions a = new Actions(driver);
		 a.moveToElement(ele).perform();
		 Thread.sleep(2000);
		 driver.findElement(By.xpath("(//a[text()='Selenium Training'])[1]")).click();
		 WebElement ele1=driver.findElement(By.id("add"));
		 Actions b = new Actions(driver);
		 b.doubleClick(ele1).perform();
		 Thread.sleep(2000);
		 driver.close();
		 
	}

}
