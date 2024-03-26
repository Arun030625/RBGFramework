package testPackage1;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import com.surveillance.Test.BaseTest;
import com.surveillance.utilitiy.GenericKeywordsWithPage;
import com.surveillance.utilitiy.PropertySingleton;

import PagePackage1.OrangeHRMPersonalDetailsPage;

public class OrangeHRMPersonalDetailsTest extends BaseTest
{
	PropertySingleton _instance = null;
	SoftAssert s_assert = new SoftAssert();
	OrangeHRMPersonalDetailsPage p1;
	
	public OrangeHRMPersonalDetailsTest()
	{
		_instance = PropertySingleton.getInstance();
	}
	@BeforeClass
	public void startReport()
	{
		beforeClassForChild(this);
	}	
	
	@Test
	public void loginCredintials() throws Throwable
	{
		extentLoggerECP = parentExtentLogger.createNode("login With Valid Credentials");
		_instance = PropertySingleton.getInstance();
		 p1=new OrangeHRMPersonalDetailsPage(GenericKeywordsWithPage.driver);
		 
		 p1.enterUserName("Admin");
		 p1.enterPassWord("admin123");
		 p1.clickOnLoginButton();
		 p1.clickOnMyInfo();
		 p1.clickOnPersonalDetails();
		 p1.getTextOfPersonalLabel();
	}
}
