package festticketpages;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FSSearch {

	public static void main(String[] args) {
		
		
		System.setProperty("webdriver.chrome.driver", "/Users/madhavid/Desktop/Test/chromedriver");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.festicket.com/");
		driver.manage().window().maximize();
		
		
		driver.findElement(By.xpath("//*[@id=\"root\"]/main/nav/div/div")).click();
		
		WebElement dd= driver.findElement(By.xpath("//*[@id=\"search-input\"]"));
				dd.sendKeys("Wireless Festival 2019  ");
				dd.sendKeys(Keys.ENTER);	
		driver.findElement(By.xpath("//*[@id=\"root\"]/div/div/div[2]/ul/li[1]")).click();
		
		
		

	}

}
