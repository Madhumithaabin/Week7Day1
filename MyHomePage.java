package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import base.ProjectSpecificMethods;

public class MyHomePage extends ProjectSpecificMethods {
	public MyHomePage(ChromeDriver driver) {
		this.driver = driver;
		
	}

	public MyLeadsPage clickLeadsLink() {
		System.out.println(driver);
		driver.findElement(By.linkText("Leads")).click();
		return new MyLeadsPage(driver);
	}


}