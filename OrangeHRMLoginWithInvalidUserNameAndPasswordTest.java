package testPackage1;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import com.surveillance.Test.BaseTest;
import com.surveillance.utilitiy.GenericKeywordsWithPage;
import com.surveillance.utilitiy.PropertySingleton;

import PagePackage1.OrangeHRMLoginWithInvalidPaswordPage;
import PagePackage1.OrangeHRMLoginWithInvalidUserNameAndPasswordPage;
import PagePackage1.OrangeHRMLoginWithInvalidUserNamePage;
import PagePackage1.OrangeHRMLoginPage;

public class OrangeHRMLoginWithInvalidUserNameAndPasswordTest extends BaseTest
{
	OrangeHRMLoginWithInvalidUserNameAndPasswordPage p1;
	SoftAssert a_assert=new SoftAssert();
	PropertySingleton instance =null;

	public OrangeHRMLoginWithInvalidUserNameAndPasswordTest()
	{
		instance = PropertySingleton.getInstance();
		p1= new PagePackage1.OrangeHRMLoginWithInvalidUserNameAndPasswordPage(GenericKeywordsWithPage.driver);	
	}

	@BeforeClass
	public void startReport()
	{
		beforeClassForChild(this);
	}	
	@Test
	public void  loginpage() throws Exception 
	{
		extentLoggerECP = parentExtentLogger.createNode("login With Valid Credentials");
		instance = PropertySingleton.getInstance();
		p1=new PagePackage1.OrangeHRMLoginWithInvalidUserNameAndPasswordPage(GenericKeywordsWithPage.driver);

		 p1.enterUserName("xyzabc");
		 p1.enterPassWord("pavan@12345");
		 p1.clickOnLoginButton();
		 p1.result();
		 
	}
}
