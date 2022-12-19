package googlesearch;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class googlesearchtest {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "C:\\Windows\\chromedriver.exe");
		
		
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.service.nsw.gov.au/service-centre");
		
		driver.manage().window().maximize();
		
		WebElement searchbutton = driver.findElement(By.id("locatorTextSearch"));
		searchbutton.sendKeys("Sydney Domestic Airport 2020");
	
		
		WebElement findbutton = driver.findElement(By.className("button--xxlarge"));
				findbutton.click();
		
		Thread.sleep(10000);
}
	}
