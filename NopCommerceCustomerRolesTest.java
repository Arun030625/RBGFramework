package testPackage1;


 

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import com.surveillance.Test.BaseTest;
import com.surveillance.utilitiy.GenericKeywordsWithPage;
import com.surveillance.utilitiy.PropertySingleton;

import PagePackage1.NopCommerceCustomerRolePage;


public class NopCommerceCustomerRolesTest extends BaseTest 
{
	NopCommerceCustomerRolePage p1 ;
	SoftAssert s_assert = new SoftAssert();
	PropertySingleton _instance = null;

	
	public NopCommerceCustomerRolesTest() throws Throwable
	{
		_instance = PropertySingleton.getInstance();
		 p1=new PagePackage1.NopCommerceCustomerRolePage(GenericKeywordsWithPage.driver);

	}
	
	@BeforeClass
	public void startReport()
	{
		beforeClassForChild(this);
	}	
	@Test
	public void loginCredintials() throws InterruptedException
	{
		extentLoggerECP = parentExtentLogger.createNode("login With Valid Credentials");
		_instance = PropertySingleton.getInstance();
		 p1=new PagePackage1.NopCommerceCustomerRolePage(GenericKeywordsWithPage.driver);
		 
		 p1.nopCommersUserName("admin@yourstore.com");
		 p1.nopCommerUserPassword("admin");
		 p1.nopCommerloginButton();
		 Thread.sleep(3000);
		 p1.clickOnCustomeroption();
		 Thread.sleep(3000);
		 p1.selectCustomer();
		 Thread.sleep(3000);
		 p1.clickOnAddNew();
		 Thread.sleep(3000);
		 p1.enterName("M.Arun Prasad");
		 Thread.sleep(3000);
		 p1.clickOnFreeShipping();
		 Thread.sleep(3000);
		 p1.clickOnTaxExemption();
		 Thread.sleep(3000);
		 p1.clickOnOverrideTaxDisplayType();
		 Thread.sleep(3000);
		 p1.clickDefaultTaxDisplayTypeId();
		 Thread.sleep(3000);
		 p1.selectTaxInclude();
		 Thread.sleep(3000);
		 p1.clickOnEnablePasswordLifetime();
		 Thread.sleep(3000);
		 p1.enterSystemName("InbookSystem");
		 Thread.sleep(3000);
		 p1.clickOnsave();
	}

	 
	

}
