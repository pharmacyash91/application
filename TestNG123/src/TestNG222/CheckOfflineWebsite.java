package TestNG222;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import org.testng.annotations.Test;

import org.testng.annotations.Test;

import org.testng.asserts.*;
public class CheckOfflineWebsite {
	
	//private static final String By = null;
	@Test
	public void openWebsite() {
		System.setProperty("webdriver.chrome.driver","chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("file:///C:/Users/abc/Downloads/javabykiran-Selenium-Softwares/Offline%20Website/index.html");
		
		String actTitle = driver.fiendElement(By.xpath(("/html/body/div/div[1]/a/b")))
		Assert.assertEquals(actTitle, "Java By Kiran");
	}
	@Test
	public void loginBlank(){
		System.setProperty("webdriver.chrome.driver","chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("file:///C:/Users/abc/Downloads/javabykiran-Selenium-Softwares/Offline%20Website/index.html");
		WebElement element = driver.findElement(By.xpath("//*[@id='email']"));
		element.sendKeys("");
		driver.findElement(By.xpath("//*[@id='form']/div[3]/div/button")).click();
		String email_errmsg = driver.findElement(By.xpath("//*[@id='email_error']")).getText();
		Assert.assertEquals(email_errmsg, "Blank not allowed");
	}
	@Test
	public void loginBlank2(){
		System.setProperty("webdriver.chrome.driver","chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("file:///C:/Users/abc/Downloads/javabykiran-Selenium-Softwares/Offline%20Website/index.html");
		WebElement element2 = driver.findElement(By.xpath("//*[@id='password']"));
		element2.sendKeys();
		driver.findElement(By.xpath("//*[@id='form']/div[3]/div/button")).click();
		String pass_errmsg = driver.findElement(By.xpath("//*[@id='password_error']")).getText();
		Assert.assertEquals(pass_errmsg, "Blank not allowed");
	}
	@Test
	public void loginpecial(){
	System.setProperty("webdriver.chrome.driver","chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	driver.get("file:///C:/Users/abc/Downloads/javabykiran-Selenium-Softwares/Offline%20Website/index.html");
	driver.findElement(By.xpath("//*[@id='email']")).sendKeys("@#jdjfdjkf");
	driver.findElement(By.xpath("//*[@id='password']")).sendKeys("dhhkhj");
	driver.findElement(By.xpath("//*[@id='form']/div[3]/div/button")).click();
	String error = driver.findElement(By.xpath("//*[@id='email_error']")).getText();
	String error2 = driver.findElement(By.xpath("//*[@id='password_error']")).getText();
	Assert.assertEquals(error, "Please enter email as kiran@gmail.com");
	Assert.assertEquals(error2, "Please enter password 123456");

	}


}
