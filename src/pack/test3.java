package pack;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;


public class test3 
{
	
	public void tes()
	{
	System.setProperty("webdriver.chrome.driver","chromedriver");
	WebDriver d = new ChromeDriver();
	d.get("https://www.gmail.com");
//	d.findElement(By.id("Email")).sendKeys("ankurgirdhar45");
//	d.findElement(By.id("next")).click();
//	WebElement chkbox = d.findElement(By.id("PersistentCookie"));
//	if(chkbox.isSelected())
//	{
//		System.out.println("checkbox selected hai bhai");
//	}
//	else
//		System.out.println("kona selected");
//	
//	if(chkbox.isDisplayed())
//	{
//		System.out.println("checkbox displayed hai bhai");
//	}
//	else
//		System.out.println("kona displayed");
//	chkbox.click();
//	System.out.println("click  kar diya to be invisible");
//	if(chkbox.isSelected())
//	{
//		System.out.println("checkbox selected hai bhai");
//	}
//	else
//		System.out.println("kona selected");
//
	
	//select dropdown 
	}		
	@Test
	public void testa(){
		System.setProperty("webdriver.chrome.driver","chromedriver");
		WebDriver d = new ChromeDriver();
		d.get("https://beta.proptiger.com");
	}
	
}		
	
	

	
