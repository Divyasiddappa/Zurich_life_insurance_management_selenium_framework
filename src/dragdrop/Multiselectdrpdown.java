package dragdrop;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Multiselectdrpdown {

	public static void main(String[] args) throws InterruptedException 
	{
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://demoapp.skillrary.com/index.php");
		WebElement ele=driver.findElement(By.id("cars"));
		Select s = new Select(ele);
		s.selectByIndex(2);
		s.selectByValue("99");
		s.selectByVisibleText("INR 100 - INR 199 ( 16 ) ");
		Thread.sleep(3000);
		List<WebElement> b=s.getOptions();
		System.out.println(b.size());
		for(WebElement c: b)
		{
			System.out.println(c.getText());
		
		}
		Thread.sleep(10);
		System.out.println(s.isMultiple());
		if(s.isMultiple())
		{
			s.deselectAll();
		}
		driver.close();
		
	}

}
