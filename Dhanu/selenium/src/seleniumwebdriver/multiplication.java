package seleniumwebdriver;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class multiplication 
{

	public static void main(String[] args)
{
		System.setProperty("webdriver.chrome.driver","C:\\\\Users\\\\Pratik\\\\Desktop\\\\Dhanu\\\\chromedriver.exe");
		ChromeDriver ch= new ChromeDriver();
		ch.get("https://www.calculator.net/");
		ch.manage().window().maximize();
		
		ch.findElement(By.xpath("//span[contains(text(),'4')]")).click();
		ch.findElement(By.xpath("//span[contains(text(),'2')]")).click();
		ch.findElement(By.xpath("//span[contains(text(),'3')]")).click();
		ch.findElement(By.xpath("//span[contains(text(),'×')]")).click();
		ch.findElement(By.xpath("//span[contains(text(),'5')]")).click();
		ch.findElement(By.xpath("//span[contains(text(),'2')]")).click();
		ch.findElement(By.xpath("//span[contains(text(),'5')]")).click();
		ch.findElement(By.xpath("//span[contains(text(),'=')]")).click();
		
	}

}



