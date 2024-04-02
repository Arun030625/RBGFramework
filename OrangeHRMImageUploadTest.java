package testPackage1;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import com.surveillance.Test.BaseTest;
import com.surveillance.utilitiy.GenericKeywordsWithPage;
import com.surveillance.utilitiy.PropertySingleton;

import PagePackage1.OrangeHRMImageUploadpage;

public class OrangeHRMImageUploadTest extends BaseTest
{
	OrangeHRMImageUploadpage edit;
	SoftAssert a_assert=new SoftAssert();
	PropertySingleton _instance= null;
	public OrangeHRMImageUploadTest()
	{
		_instance=  PropertySingleton.getInstance();
		edit= new OrangeHRMImageUploadpage(GenericKeywordsWithPage.driver);
	}
	@BeforeClass
	public void startReport()
	{
		beforeClassForChild(this);
	}	
	@Test
	public void photoUploadForMyInfo() throws Throwable 
	{
		extentLoggerECP = parentExtentLogger.createNode("login With Valid Credentials");
		_instance = PropertySingleton.getInstance();
		edit=new OrangeHRMImageUploadpage(GenericKeywordsWithPage.driver);

		edit.enterUserName("Admin");
		edit.enterPassWord("admin123");
		edit.clickOnLoginButton();
		edit.clickOnmyinfo();
		edit.clickOnImage();
		edit.clickOnAddImage();
		edit.upLoad();

		edit.clickOnSave();

		System.out.println("photo uploaded succesfully");
	}

}
