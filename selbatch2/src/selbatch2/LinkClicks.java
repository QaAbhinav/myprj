package selbatch2;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class LinkClicks {
	@Test
	public void clickOptions(){
		System.setProperty("webdriver.chrome.driver","chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("file:///E:/Selinium/javabykiran-Selenium-Softwares/Offline%20Website/index.html");
		driver.findElement(By.id("email")).sendKeys("kiran@gmail.com");
		driver.findElement(By.id("password")).sendKeys("123456");
		driver.findElement(By.xpath("//*[@id=\"form\"]/div[3]/div/button")).click();
		driver.findElement(By.linkText("Dashboard")).click();	
		System.out.println(driver.getTitle());					
        List <WebElement> links = driver.findElements(By.partialLinkText("More info"));
        for(int i=0;i<links.size();i++)
            System.out.println(links.get(i).getText());
        for(int i=0;i<links.size();i++){
            links.get(i).click();
          
        }
	}
}

