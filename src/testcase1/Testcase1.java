package testcase1;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Testcase1
{

	public static void main(String[] args)
	{
	WebDriver driver= new ChromeDriver();
	driver.manage().window().maximize();
	String url="http://rmgtestingserver/domain/Life_Insurance_Management_System/";
	driver.get(url);
	String strurl=driver.getCurrentUrl();
	if(url.equals(strurl))
	{
		System.out.println("the login page is being displayed");
	}
	else
	{
		System.out.println("the login page is  not being displayed");
	}
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	WebElement ele=driver.findElement(By.name("username"));
	if(ele.isDisplayed())
	{
	System.out.println("element is being displayed");
	ele.sendKeys("555");
	}
	WebElement ele1=driver.findElement(By.name("password"));
	if(ele1.isDisplayed())
	{
	System.out.println("element is being displayed");
	ele1.sendKeys("666");
	}
	driver.findElement(By.xpath("//button[text()=\"login\"]")).click();
	String url1="http://rmgtestingserver/domain/Life_Insurance_Management_System/home.php";
	String strurl1=driver.getCurrentUrl();
	if(url1.equals(strurl1))
	{
		System.out.println("the home page is being displayed");
	}
	else
	{
		System.out.println("the home page is  not being displayed");
	}
	System.out.println(driver.getCurrentUrl());
	driver.findElement(By.xpath("(//a[text()='CLIENTS'])")).click();
	driver.findElement(By.xpath("(//a[text()='Add Client'])")).click();
	List<WebElement> user1=driver.findElements(By.name("client_id"));
	if(user1.size()>0)
	{
		System.out.println("Text:"+"is present");
	}
	else
	{
		System.out.println("Text is not present");
		driver.close();
	}
	driver.findElement(By.name("client_password")).sendKeys("1234");
	driver.findElement(By.name("name")).sendKeys("abdcd");
	driver.findElement(By.xpath("//input[@name='fileToUpload']")).sendKeys("C:\\Users\\user\\Desktop\\IMG_20220508_190710.jpg");
	 driver.findElement(By.name("sex")).sendKeys("male");
	 driver.findElement(By.name("birth_date")).sendKeys("02/05/1997");
	 driver.findElement(By.name("maritial_status")).sendKeys("single");
	 driver.findElement(By.name("nid")).sendKeys("indian");
	 driver.findElement(By.name("phone")).sendKeys("23456");
	 driver.findElement(By.name("address")).sendKeys("ashndkjbsdjsbd");
	 driver.findElement(By.name("policy_id")).sendKeys("2");
	 List<WebElement> user2=driver.findElements(By.name("agent_id"));
		if(user2.size()>0)
		{
			System.out.println("Text:"+"is present");
		}
		else
		{
			System.out.println("agent id  is not present");
			driver.close();
		}
		List<WebElement> user3=driver.findElements(By.name("nominee_id"));
		if(user3.size()>0)
		{
			System.out.println("Text:"+"is present");
		}
		else
		{
			System.out.println("nominee id   is not present");
			driver.close();
		}
		driver.findElement(By.name("nominee_name")).sendKeys("divya");
		driver.findElement(By.name("nominee_sex")).sendKeys("female");
		driver.findElement(By.name("nominee_birth_date")).sendKeys("02/06/1999");
		driver.findElement(By.name("nominee_nid")).sendKeys("indian");
		driver.findElement(By.name("nominee_relationship")).sendKeys("sister");
		driver.findElement(By.name("priority")).sendKeys("1");
		driver.findElement(By.name("nominee_phone")).sendKeys("123456");
		driver.findElement(By.xpath("//input[@type='submit']")).click();
		driver.findElement(By.xpath("(//a[text()='CLIENTS'])")).click();
		String url2="http://rmgtestingserver/domain/Life_Insurance_Management_System/client.php";
		String strurl2=driver.getCurrentUrl();
		if(url1.equals(strurl1))
		{
			System.out.println("the client information page is being displayed");
		}
		else
		{
			System.out.println("the client information  page is  not being displayed");
		}
		List <WebElement> row=driver.findElements(By.xpath("//*[@id=\"page-wrapper\"]/table/tbody/tr[50]"));
		System.out.println(row.size());
		for(WebElement b:row)
		{
			System.out.println(b.getText());
		}
		/*driver.findElement(By.name("key")).sendKeys("abdcd");
		driver.findElement(By.xpath("//input[@class='searchBtn']")).click();
		driver.findElement(By.xpath("//a[text()='Client Status']")).click();
		driver.findElement(By.xpath("//a[text()='Edit Client']")).click();
		driver.findElement(By.name("name")).sendKeys("abcdde");
		driver.findElement(By.xpath("//input[@value='UPDATE']")).click();
		driver.findElement(By.xpath("//tr[last()]")).getText();*/
	
	
	

	}

}
