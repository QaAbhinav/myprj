package selbatch2;

import java.util.NoSuchElementException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

public class WaitEx {
	WebDriver driver;

	@Test
	public void test01() throws Exception{
		System.setProperty("webdriver.chrome.driver","chromedriver.exe");
		driver=new ChromeDriver();
		Thread.sleep(20000);//hardcoded not recomended
		driver.get("file:///E:/Selinium/javabykiran-Selenium-Softwares/Offline%20Website/index.html");
		driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);//TIMEOUT EXCEPTION THROW
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);//NO SUCH ELEMENT EXCEPTION
		driver.findElement(By.id("email")).sendKeys("kiran@gmail.com");
		driver.findElement(By.id("password")).sendKeys("123456");
		WebDriverWait wait=new WebDriverWait(driver,20);//NO SUCH ELEMENT EXCEPTION
		wait.until(ExpectedConditions.visibilityOf(driver.findElement(By.id("password"))));
		Wait w=new FluentWait(driver)
				.pollingEvery(3, TimeUnit.SECONDS)
				.ignoring(NoSuchElementException.class);


		w.until(ExpectedConditions.visibilityOf(driver.findElement(By.id("password"))));		

	}



}


