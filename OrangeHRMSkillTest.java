package testPackage1;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import com.surveillance.Test.BaseTest;
import com.surveillance.utilitiy.GenericKeywordsWithPage;
import com.surveillance.utilitiy.PropertySingleton;

import PagePackage1.OrangeHRMSkillPage;

public class OrangeHRMSkillTest extends BaseTest
{
	

	OrangeHRMSkillPage p1 ;
	SoftAssert s_assert = new SoftAssert();
	PropertySingleton _instance = null;

	
	public OrangeHRMSkillTest()
	{
		  _instance = PropertySingleton.getInstance();
		   p1 = new  OrangeHRMSkillPage(GenericKeywordsWithPage.driver);

	}
	
	@BeforeClass
	public void startReport()
	{
		beforeClassForChild(this);
	}	
	
	@Test()
	public void saveAndDeleteForSkill( ) throws InterruptedException
	{
		extentLoggerECP = parentExtentLogger.createNode("login With Valid Credentials");
		  _instance = PropertySingleton.getInstance();
		  p1 = new  OrangeHRMSkillPage(GenericKeywordsWithPage.driver);
		 
		  p1.enterUserName("Admin");
		  p1.enterPassWord("admin123");
		  p1.clickOnLoginButton();
		  p1.clickOnAdmin();
		  p1.clickOnQualification();
		  p1.clickOnSkill();
		  p1.clickOnAdd();
		  p1.enterName("Arun Prasad");
		  p1.enterDescription("text msg for testing");
		  p1.clickOnSave();
		  p1.clickOnEdit();
		  p1.enterDifferentDescription("different text for testing");
		  p1.clickONSaveAgain();
				  
	}		  
				  
				  
				  
			  
}
