package testcases;

import org.testng.annotations.Test;

import base.ProjectSpecificMethods;
import pages.LoginPage;

public class DeleteLead extends ProjectSpecificMethods {
  @Test
  public void runDeleteLead() throws InterruptedException {
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
  .clickLeadid().deleteLeadid().verifyLeadDelete();
  
  
  }
}
