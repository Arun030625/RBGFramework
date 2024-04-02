package testPackage1;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import com.surveillance.Test.BaseTest;
import com.surveillance.utilitiy.GenericKeywordsWithPage;
import com.surveillance.utilitiy.PropertySingleton;

import PagePackage1.OrangeHRMEditrContactDetailspage;

public class OrangeHRMEditrContactDetailsTest extends BaseTest
{
	OrangeHRMEditrContactDetailspage edit;
	SoftAssert a_assert=new SoftAssert();
	PropertySingleton _instance= null;
	
	public   OrangeHRMEditrContactDetailsTest()
	{
		_instance=  PropertySingleton.getInstance();
		edit= new OrangeHRMEditrContactDetailspage(GenericKeywordsWithPage.driver);
	}
	@BeforeClass
	public void startReport()
	{
		beforeClassForChild(this);
	}	
	@Test
	public void editContactDetails() throws InterruptedException
	{
		extentLoggerECP = parentExtentLogger.createNode("login With Valid Credentials");
		_instance = PropertySingleton.getInstance();
		edit=new OrangeHRMEditrContactDetailspage(GenericKeywordsWithPage.driver);
		
		edit.enterUsername("Admin");
		edit.enterPassword("admin123");
		edit.clickOnLogin();
		edit.clickOnMyInfo();
		edit.clickOnContactDetails();
		edit.enterAddress1("plot no 10");
		edit.enterAddress2("rock view enclave");
		edit.enterCity("hyderabad");
		edit.enterState("telangana");
		edit.enterCountry("India");
		edit.enterPincode("500032"); 
		edit.enterMobileNumber("9999999999");
		edit.enterWorkNumber("9675876543");
		edit.enterWork("automation engineer");
		edit.enterEmail("arun@gmail.com");
		edit.enterOtherEmail("other@gmail.com");
		edit.clickOnSave();
		Thread.sleep(10000);
		
		
	}
}
	  