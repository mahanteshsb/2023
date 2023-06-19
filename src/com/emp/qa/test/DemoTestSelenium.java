package com.emp.qa.test;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class DemoTestSelenium {
	static WebDriver driver;
	
	public static void highLightElement(WebElement element) {

		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].setAttribute('style','background: yellow; border: 2px solid red;');", element);

	}

	public static void main(String[] args) throws InterruptedException {
	
		
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\GLB-BLR-015\\eclipse-workspace-Github\\ZempDemo\\driver\\chromedriver.exe");
		System.setProperty("webdriver.gecko.driver",
				"C:\\Users\\GLB-BLR-015\\eclipse-workspace-Github\\ZempDemo\\driver\\geckodriver.exe");
//		 driver = new ChromeDriver();
	 driver=new FirefoxDriver();
		driver.manage().window().maximize();
		System.out.println("Browser luanched ");

//		driver.get("http://www.google.com/");
//		Thread.sleep(5000);
//		WebElement img = driver.findElement(By.xpath("//img[@alt=\"Google\"]"));
//		highLightElement(img);
//		Thread.sleep(5000);
//		driver.switchTo().alert();
//		driver.close();
		
		driver.get("https://app.poweradspy.com/");
		Thread.sleep(5000);
		driver.findElement(By.xpath("//input[@id=\"amember-login\"]")).sendKeys("palladiumyearly");
		Thread.sleep(5000);

		driver.findElement(By.xpath("//input[@id=\"amember-pass\"]")).sendKeys("palladiumyearly");
		Thread.sleep(5000);

		driver.findElement(By.linkText("//input[@type=\"submit\" and @value=\"Login\"]")).click();
		Thread.sleep(5000);
//driver.switchTo().alert().dismiss();

Thread.sleep(5000);
 driver.close();
		System.out.println("Result Pass = " );

	}

}
