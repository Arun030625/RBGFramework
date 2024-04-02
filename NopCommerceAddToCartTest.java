package testPackage1;


 

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import com.surveillance.Test.BaseTest;
import com.surveillance.utilitiy.GenericKeywordsWithPage;
import com.surveillance.utilitiy.PropertySingleton;


public class NopCommerceAddToCartTest extends BaseTest 
{
	
	PropertySingleton _instance = null;
	SoftAssert s_assert = new SoftAssert();
	PagePackage1.NopCommerceRegisterPage p1 ;
	
	public NopCommerceAddToCartTest() throws Throwable
	{
		_instance = PropertySingleton.getInstance();
		
	}
	
	@BeforeClass
	public void startReport()
	{
		beforeClassForChild(this);
	}	
	@Test
	public void nopcommerceRegister() throws InterruptedException
	{
		_instance = PropertySingleton.getInstance();
		 p1=new PagePackage1.NopCommerceRegisterPage(GenericKeywordsWithPage.driver);
		 
		 p1.clickOnRegister();
		 p1.selectGender();
		 p1.enterFirstName("ARUN PRASAD");
		 p1.enterLastName("Mangadoddi");
		 p1.date(30);
		 p1.month(5);
		 p1.year("1996");
		 p1.enterEmail("arunprasad007@gmail.com");
		 p1.enterCompany("RBG Techologies");
		 p1.enterPassword("Stalin@007");
		 p1.enterCNFPassword("Stalin@007");
		 p1 .finalRegister();
		 
		 
		 
	}

	 
	

}
