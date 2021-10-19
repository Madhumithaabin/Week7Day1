package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import base.ProjectSpecificMethods;
import io.opentelemetry.sdk.metrics.view.View;

public class ViewLeadPage extends ProjectSpecificMethods {
	public ViewLeadPage(ChromeDriver driver) {
		this.driver = driver;

	}

	public ViewLeadPage verifyFirstName() {
		System.out.println(driver);
		String text = driver.findElement(By.id("viewLead_firstName_sp")).getText();
		Assert.assertEquals("Hari", text);
		return this;
	}

	public ViewLeadPage duplicateleadsucess() {
		String title = driver.getTitle();
		if (title.equals("View Lead | opentaps CRM")) {
			System.out.println("Sucessfully duplicated the lead");

		} else {
			System.out.println("lead is not duplicated");

		}
		return this;
	}

	public ViewLeadPage verifyLeadDelete() throws InterruptedException {
		String title = driver.getTitle();
		if (title.equals("My Leads | opentaps CRM")) {
			System.out.println("Sucessfully deleted the lead");

		} else {
			System.out.println("lead is not deleted");

		}
		return this;
	}

	public ViewLeadPage editleadsucess() {
		String title = driver.getTitle();
		if (title.equals("View Lead | opentaps CRM")) {
			System.out.println("Sucessfully updated the lead");

		} else {
			System.out.println("lead is not updated");
		}
		return this;
	}

	public ViewLeadPage verify_Mergeddata() {
		String title = driver.getTitle();
		if (title.equals("My Leads | opentaps CRM")) {
			System.out.println("Sucessfully Merged the lead");

		} else {
			System.out.println("leads are not merged");
		}
		return this;

	}

}
