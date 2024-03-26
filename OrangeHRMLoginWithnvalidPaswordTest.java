package testPackage1;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import com.surveillance.Test.BaseTest;
import com.surveillance.utilitiy.GenericKeywordsWithPage;
import com.surveillance.utilitiy.PropertySingleton;

import PagePackage1.OrangeHRMLoginWithInvalidPaswordPage;
import PagePackage1.OrangeHRMLoginPage;

public class OrangeHRMLoginWithnvalidPaswordTest extends BaseTest
{
	OrangeHRMLoginWithInvalidPaswordPage p1;
	SoftAssert a_assert=new SoftAssert();
	PropertySingleton instance =null;

	public OrangeHRMLoginWithnvalidPaswordTest()
	{
		instance = PropertySingleton.getInstance();
		p1= new PagePackage1.OrangeHRMLoginWithInvalidPaswordPage(GenericKeywordsWithPage.driver);	
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
		p1=new PagePackage1.OrangeHRMLoginWithInvalidPaswordPage(GenericKeywordsWithPage.driver);

		 p1.enterUserName("pavan@12345");
		 p1.enterPassWord("xyzabc");
		 p1.clickOnLoginButton();
		 p1.result();
	}
}
