package dragdrop;

import java.time.Duration;
import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
public class Amazondrpdown {

	public static void main(String[] args) throws InterruptedException 
	{
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://www.amazon.in/");
	WebElement	ele= driver.findElement(By.id("searchDropdownBox"));
	Select s = new Select(ele);
	s.selectByIndex(4);
	Thread.sleep(3000);
	s.selectByValue("search-alias=watches");
	Thread.sleep(3000);
	s.selectByVisibleText("Toys & Games");
	List<WebElement	> b=s.getOptions();
	System.out.println(b.size());
	for(WebElement c : b)
	{
		System.out.println(c.getText());
	}
	Thread.sleep(3000);
	driver.close();
	}

}
