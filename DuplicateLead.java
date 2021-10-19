package testcases;

import org.testng.annotations.Test;

import base.ProjectSpecificMethods;
import pages.LoginPage;

public class DuplicateLead extends ProjectSpecificMethods{
  @Test
  public void runDuplicateLead() throws InterruptedException {
		new LoginPage(driver)
		.enterUsername()
		.enterPassword()
		.clickLoginButton()
		.clickCrmSfaLink()
		.clickLeadsLink()
		.findLead()
		.clickPhone()
		.enterPhone("99").
		clickfindlead().clickLead().
		duplicateLead().
		clickSubmit().
		duplicateleadsucess();
	  
  
  }
}
