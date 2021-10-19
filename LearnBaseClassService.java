package base;

import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;

public class LearnBaseClassService {
	public ChromeDriver driver;
	public static String incidentNum;

	  @BeforeMethod
	  public void preCondition() {
			WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver();
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
			driver.get("https://dev96375.service-now.com/navpage.do");
			WebElement frame = driver.findElement(By.id("gsft_main"));
			driver.switchTo().frame(frame);

			driver.findElement(By.id("user_name")).sendKeys("admin");
			driver.findElement(By.id("user_password")).sendKeys("Abinjenny@96");
			driver.findElement(By.id("sysverb_login")).click();
			driver.switchTo().defaultContent();
		
	  }

	  @AfterMethod()
	  public void postCondition() {
	  //driver.close();
	  }

}
