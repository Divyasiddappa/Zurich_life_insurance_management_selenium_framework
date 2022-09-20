package autosuggestion;

import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Goibibo {

	public static void main(String[] args)
	{
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.goibibo.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.findElement(By.xpath("//a[text()='Hotels']")).click();
		driver.findElement(By.xpath("//div[text()='Check-in']")).click();
		driver.findElement(By.xpath("//span[text()='August 2022']/ancestor::div[@class='dcalendar-newstyles__FlexItem-sc-1i003by-0 dcalendar-newstyles__MonthOuterWrapper-sc-1i003by-3 ljWsys bAVDze']//span[text()='27'][1]")).click();
		

	}

}

