package testPackage1;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import com.surveillance.Test.BaseTest;
import com.surveillance.utilitiy.GenericKeywordsWithPage;
import com.surveillance.utilitiy.PropertySingleton;

import PagePackage1.OrangeHRMSaveAndDeletePage;

public class OrangeHRMSaveAndDeleteTest extends BaseTest
{
	
	
		OrangeHRMSaveAndDeletePage p1 ;
		SoftAssert s_assert = new SoftAssert();
		PropertySingleton _instance = null;
	
		
		public OrangeHRMSaveAndDeleteTest()
		{
			  _instance = PropertySingleton.getInstance();
			   p1 = new PagePackage1.OrangeHRMSaveAndDeletePage(GenericKeywordsWithPage.driver);

		}
		
		@BeforeClass
		public void startReport()
		{
			beforeClassForChild(this);
		}	
		
		@Test(dataProviderClass = OrangeHRMSaveAndDeletePage.class, dataProvider = "getData")
		public void saveAndDelete(String First_Name,String Middle_Name,String Last_Name, String Employee_Id, String Employee_Name) throws InterruptedException
		{
			extentLoggerECP = parentExtentLogger.createNode("login With Valid Credentials");
			  _instance = PropertySingleton.getInstance();
			  p1 = new PagePackage1.OrangeHRMSaveAndDeletePage(GenericKeywordsWithPage.driver);
			  
			 p1.enterUserName("Admin");
			 p1.enterPassWord("admin123");
 			 p1.clickOnLoginButton();
 			 p1.clickOnPim();
 			 p1.clickOnAdd();
  			 p1.enterFirstName(First_Name);
 			 p1.enterMiddleName(Middle_Name);
 			 p1.enterLastNmae(Last_Name);
 			 p1.enterEmployeeId(Employee_Id);
 			 p1.clickOnSave();
 			 p1.clickOnEmpolyeeList();
 			 p1.enterEmployeeName(Employee_Name);
 			 p1.clickOnSearchButton();
 			 p1.clickOnDeleteButton();
 			 p1.clickOnFinalDeleteButton();
		}
		
	
}
