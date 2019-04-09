package festticketpages;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FSBasket {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "/Users/madhavid/Desktop/Test/chromedriver");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.festicket.com/");
		driver.manage().window().maximize();
		
				
		
		
driver.findElement(By.xpath("//*[@id=\"root\"]/main/nav/div/div")).click();
		
		WebElement ddd= driver.findElement(By.xpath("//*[@id=\"search-input\"]"));
				ddd.sendKeys("Barclaycard presents British Summer Time Hyde Park 2019 ");
				ddd.sendKeys(Keys.ENTER);	
		driver.findElement(By.xpath("//*[@id=\"root\"]/div/div/div[2]/ul/li[1]")).click();
		driver.findElement(By.xpath("//*[@id=\"root\"]/main/div[1]/div[1]/div/div[2]/div/div/div[2]/div")).click();
		
		

driver.findElement(By.xpath("//*[@id=\"product-list-container\"]/div[1]/section/div/a[2]/div/div[2]/div[2]/div/button[2]")).click();

driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);		

driver.findElement(By.xpath("//*[@id=\"root\"]/main/main/div[1]/div/div[2]/div/div[2]/div[2]/div/div[1]/div[2]")).click();

driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);	

driver.findElement(By.xpath("//*[@id=\"product-list-container\"]/div[1]/section/div/a[1]/div/div[2]/div[2]/div/button[2]")).click();

driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);	

driver.findElement(By.xpath("//*[@id=\"root\"]/main/main/div[1]/div/div[2]/div/div[2]/div[1]/div[2]/div[1]/div/div[1]/span/button[2]")).click();

		
				

		
		
		
		
		
		

	}

}
