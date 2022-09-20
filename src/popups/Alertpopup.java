package popups;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Alertpopup {

	public static void main(String[] args)
	{
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demoapp.skillrary.com/product.php?product=selenium-training");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		 WebElement ele=driver.findElement(By.xpath("(//button[text()=' Add to Cart'])"));
		 ele.click();
		Alert a = driver.switchTo().alert();
		System.out.println(a.getText());
		a.accept();
	  Point	ele1=ele.getLocation();
	  int x = ele1.getX();
	  int y = ele1.getY();
	  System.out.println(x+"x corordinates");
	  System.out.println(y+"ycorordinates");
	  driver.close();
	}

}
