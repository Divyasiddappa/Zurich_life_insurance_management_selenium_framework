package dragdrop;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Dropdown2
{

	public static void main(String[] args) throws InterruptedException 
	{
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://www.ebay.com/");
		WebElement  ele=driver.findElement(By.id("gh-cat"));
		Select S = new Select(ele);
		Thread.sleep(3000);
		S.selectByValue("2984");
		S.selectByIndex(5);
		S.selectByVisibleText(" Cameras & Photo");
		driver.close();
		

	}

}
