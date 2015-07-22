package pack;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class test1 
{
	@Test
	public void kcuh()
	{
		System.setProperty("webdriver.chrome.driver","chromedriver");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.proptiger.com");
		try{
		Thread.sleep(3000);}catch(InterruptedException e){System.out.println("Thread exception");}
		String s[] = new String[5];
		s[0]=driver.getTitle();
		s[1] = driver.findElement(By.cssSelector("meta[name='description']")).getAttribute("content");
		s[2] = driver.findElement(By.cssSelector("meta[name='keywords']")).getAttribute("content");
		s[3]=driver.findElement(By.tagName("H1")).getText();
		s[4]=driver.findElement(By.tagName("H2")).getText();
		
		for (String d : s)
		System.out.println(d);
		
		driver.get("https://qa.proptiger-ws.com");
		try{
			Thread.sleep(3000);}catch(InterruptedException e){System.out.println("Thread exception");}
		String tt = driver.getTitle();
		
		if (tt.equals(s[0]))
		System.out.println("kya bat hai ");
		else
		System.err.println("rhen de yar");	
		driver.quit();
	}
}
