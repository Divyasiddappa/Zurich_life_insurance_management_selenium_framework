package dragdrop;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Googledrag {

	public static void main(String[] args) throws InterruptedException 
	{
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://www.dhtmlgoodies.com/submitted-scripts/i-google-like-drag-drop/index.html");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		WebElement Block1=driver.findElement(By.xpath("(//h1[text()='Block 1'])"));
		WebElement Block2=driver.findElement(By.xpath("(//h1[text()='Block 2'])"));
		Thread.sleep(2000);
		Actions a = new Actions(driver);
		a.dragAndDrop(Block1,Block2).perform();
		Thread.sleep(2000);
		driver.close();
		

	}

}
