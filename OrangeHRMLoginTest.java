package testPackage1;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import com.surveillance.Test.BaseTest;
import com.surveillance.utilitiy.GenericKeywordsWithPage;
import com.surveillance.utilitiy.PropertySingleton;

import PagePackage1.OrangeHRMLoginPage;

public class OrangeHRMLoginTest extends BaseTest
{
	OrangeHRMLoginPage p1;
	SoftAssert a_assert=new SoftAssert();
	PropertySingleton instance =null;

	public OrangeHRMLoginTest()
	{
		instance = PropertySingleton.getInstance();
		p1= new PagePackage1.OrangeHRMLoginPage(GenericKeywordsWithPage.driver);	
	}

	@BeforeClass
	public void startReport()
	{
		beforeClassForChild(this);
	}	
	@Test
	public void  loginpage() 
	{
		extentLoggerECP = parentExtentLogger.createNode("login With Valid Credentials");
		instance = PropertySingleton.getInstance();
		p1=new PagePackage1.OrangeHRMLoginPage(GenericKeywordsWithPage.driver);

		 p1.enterUserName("Admin");
		 p1.enterPassWord("admin123");
		 p1.clickOnLoginButton();
	}
}
