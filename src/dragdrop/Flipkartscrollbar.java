package dragdrop;

import java.io.File;
import java.io.IOException;
import java.time.Duration;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Flipkartscrollbar {

	public static void main(String[] args) throws InterruptedException, IOException 
	{
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.amazon.in/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		TakesScreenshot a = (TakesScreenshot) driver;
		File ram = a.getScreenshotAs(OutputType.FILE);
		File b = new File("./PHOTO/amazon/.png");
		FileUtils.copyFile(ram,b);
		driver.close();
	}

}
