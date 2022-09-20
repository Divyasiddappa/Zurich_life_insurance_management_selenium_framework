package dragdrop;

import java.time.Duration;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Scrollbaramazon {

	public static void main(String[] args) throws InterruptedException
	{
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.amazon.in/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		JavascriptExecutor a=(JavascriptExecutor) driver;
		a.executeScript("window.scrollBy(0,5000)");
		Thread.sleep(3000);
		a.executeScript("window.scrollBy(0,-5000)");
		driver.close();
	}

}
