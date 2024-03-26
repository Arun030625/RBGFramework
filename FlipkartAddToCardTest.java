package testPackage1;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import com.surveillance.Test.BaseTest;
import com.surveillance.utilitiy.GenericKeywordsWithPage;
import com.surveillance.utilitiy.PropertySingleton;

import PagePackage1.FlipkartAddToCardPage;

public class FlipkartAddToCardTest extends BaseTest
{
	FlipkartAddToCardPage p1;
	SoftAssert S_assert= new SoftAssert();
	PropertySingleton _instance= null;

	public FlipkartAddToCardTest()
	{
		_instance=PropertySingleton.getInstance();
		p1 = new FlipkartAddToCardPage(GenericKeywordsWithPage.driver);

	}

	@BeforeClass
	public void startReport()
	{
		beforeClassForChild(this);
	}	

	@Test(dataProviderClass=FlipkartAddToCardPage.class,  dataProvider="getData")
	public void flipkartAddToCart( String search, String product,String mobileNumber, String name ,String mobNum ,String pincode, String locality, String address,String city,String landmark,String AlterMobileNumber,String summery ) throws Exception
	{
		extentLoggerECP = parentExtentLogger.createNode("login With Valid Credentials");
		_instance = PropertySingleton.getInstance();
		p1 = new  FlipkartAddToCardPage(GenericKeywordsWithPage.driver);
		
		p1.searchInputBox(search);
		p1.clickOnSearch(); 
		p1.clickOnProduct();
		 
 		 p1.windowHandle();
 		 p1.clickOnProduct();
  		Thread.sleep(4000);
 		p1.clickOnPlaceOrder();
		p1.enterMobileNumber(mobileNumber);
		p1.clickOnContinue();
		p1.clickOnAddNewAddrres();
		p1.enterNameForAddres(name);
		p1.enterMobNumForAddres(mobNum);
		p1.enterPincodeForAddres(pincode);
		p1.enterLocalityForAddres(locality);
		p1.enterBreifAddres(address);
		p1.enterCityForAddres(city);
		p1.clickOnSelectState();
		p1.selectState();
		p1.enterLandmarkForAddres(landmark);
		p1.enterAltMobNumForAddres(AlterMobileNumber);
		p1.clickOnHomeDelivery();
		p1.clickOnSaveAndContinue();
		p1.verifyTheSummery(summery);
		p1.clickOnAcceptAndContinue();
		p1.clickOnCOD();
		
	}
}
