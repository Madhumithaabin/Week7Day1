package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import base.ProjectSpecificMethods;

public class LoginPage extends ProjectSpecificMethods {
	
	public LoginPage(ChromeDriver driver) {
		this.driver = driver;
		
	}
	
	
	
				// action+ElementName
	public LoginPage enterUsername() throws InterruptedException {
		System.out.println(driver);
		driver.findElement(By.name("USERNAME")).sendKeys("Demosalesmanager");
		//Thread.sleep(10000);
		return this;
		
	}

	public LoginPage enterPassword() {
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		return this;
	}

	public HomePage clickLoginButton() {
		driver.findElement(By.className("decorativeSubmit")).click();
			
		return new HomePage(driver);
	}

}
