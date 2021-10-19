package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import base.ProjectSpecificMethods;

public class MyLeadsPage extends ProjectSpecificMethods {
	
	public MyLeadsPage(ChromeDriver driver) {
		this.driver = driver;
		
	}
	public CreateLeadPage clickCreateLeadLink() {
		System.out.println(driver);
		driver.findElement(By.linkText("Create Lead")).click();
		return new CreateLeadPage(driver);
	}
	public LeadDetailsChange findLead() {
		driver.findElement(By.linkText("Find Leads")).click();
return new LeadDetailsChange(driver);
	}
	public MyMergeLead mergeLead() {
		 driver.findElement(By.linkText("Merge Leads")).click();
return new MyMergeLead(driver);
	}


}
