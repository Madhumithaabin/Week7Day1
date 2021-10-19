package testcases;

import org.testng.annotations.Test;

import base.ProjectSpecificMethods;
import pages.LoginPage;

public class MergeLead extends ProjectSpecificMethods {
  @Test
  public void runMergeLead() throws InterruptedException {
  new LoginPage(driver)
  .enterUsername()
  .enterPassword()
  .clickLoginButton()
  .clickCrmSfaLink()
  .clickLeadsLink()
  .mergeLead()
  .clickFrom()
  .swicthWindow()
  .enterFName("ashok")
  .clickfindlead()
  .clickLead()
  .swicthcloseWindow()
  .clickTo()
  .swicthWindow()
  .enterFName("Smitha")
  .clickfindlead()
  .clickLead()
  .swicthcloseWindow()
  .clickMergeButton()
  .alertHandle()
  .clickfindleaId()
  .verify_Mergeddata();
  }
}
