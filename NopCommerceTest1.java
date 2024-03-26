package testPackage1;


 

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import com.surveillance.Test.BaseTest;
import com.surveillance.utilitiy.GenericKeywordsWithPage;
import com.surveillance.utilitiy.PropertySingleton;


public class NopCommerceTest1 extends BaseTest 
{
	
	PropertySingleton _instance = null;
	SoftAssert s_assert = new SoftAssert();
	PagePackage1.NopCommercePage p1 ;
	
	public NopCommerceTest1() throws Throwable
	{
		_instance = PropertySingleton.getInstance();
		
	}
	
	@BeforeClass
	public void startReport()
	{
		beforeClassForChild(this);
	}	
	@Test
	public void loginCredintials() throws InterruptedException
	{
		_instance = PropertySingleton.getInstance();
		 p1=new PagePackage1.NopCommercePage(GenericKeywordsWithPage.driver);
		 
		 p1.nopCommersUserName("admin@yourstore.com");
		 p1.nopCommerUserPassword("admin");
		 p1.nopCommerloginButton();
		 Thread.sleep(3000);
		 p1.clickOnCustomeroption();
		 Thread.sleep(3000);

		 p1.selectCustomer();
		 Thread.sleep(8000);

		 p1.clickOnAddNew();
		 Thread.sleep(3000);

		 p1.enterEmail("arun199697@gmail.com");
		 Thread.sleep(3000);
		 p1.enterPassword("Stalin@007");
		 Thread.sleep(3000);
		 p1.enterFirstName("arun");
		 Thread.sleep(3000);
		 p1.enterLastNmae("prasad");
		 Thread.sleep(3000);
		 p1.selectGender();
		 Thread.sleep(3000);
		 p1.selectDateOfBirth("05/30/1996");
		 Thread.sleep(3000);
		 p1.enterCompanyName("RoyalEnfield");
		 Thread.sleep(3000);
		 p1.selectIsTaxExempt();
		 Thread.sleep(3000);
		 p1.enterNewsLetters();
		 Thread.sleep(3000);
		 p1.selectNewsLetters();
		 Thread.sleep(3000);
		 p1.CustomerRoleIds();
		 Thread.sleep(3000);
		 p1.SelectedCustomerRoleIds();
		 Thread.sleep(3000);
		 p1.clickVender();
		 Thread.sleep(3000);
		 p1.selectVender();
		 Thread.sleep(3000);
		 p1.selectActive();
		 Thread.sleep(3000);
		 p1.enterAdminComment("entering text for testing purpose only");
		 Thread.sleep(3000);
		 p1.saveTheNewAdmin();
		 Thread.sleep(3000);		 
		 
	}

	 
	

}
