package testcases;

import org.testng.annotations.Test;

import base.ProjectSpecificMethods;
import pages.LoginPage;
public class EditLead extends ProjectSpecificMethods{
	  @Test
	  public void runEditlead() throws InterruptedException {
	  new LoginPage(driver)
	  .enterUsername()
	  .enterPassword()
	  .clickLoginButton()
	  .clickCrmSfaLink()
	  .clickLeadsLink()
	  .findLead()
	  .clickPhone()
	  .enterPhone("99")
	  .clickfindlead()
	  .clickLeads()
	  .editLead()
	  .update_Cmpname()
	  .EditLeadButton()
	  .editleadsucess();
	  }
}
