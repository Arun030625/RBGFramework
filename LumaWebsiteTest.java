package testPackage1;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import com.surveillance.Test.BaseTest;
import com.surveillance.utilitiy.GenericKeywordsWithPage;
import com.surveillance.utilitiy.PropertySingleton;

import PagePackage1.LumaWebsitePage;

public class LumaWebsiteTest  extends BaseTest
{
	LumaWebsitePage p1;
	SoftAssert s_assert = new SoftAssert();
	PropertySingleton _instance = null;

	public LumaWebsiteTest()
	{
		  _instance = PropertySingleton.getInstance();
		   p1 = new LumaWebsitePage(GenericKeywordsWithPage.driver);

	}
	
	@BeforeClass
	public void startReport()
	{
		beforeClassForChild(this);
	}	
	@Test
	 public void lumaWebsite() throws Exception
	 {
		extentLoggerECP = parentExtentLogger.createNode("login With Valid Credentials");
		  _instance = PropertySingleton.getInstance();
		  p1 = new PagePackage1.LumaWebsitePage(GenericKeywordsWithPage.driver);
		 p1.MoouseOverOnWoman();
		  
		 p1.MoouseOverOnTops();
		 p1.MoouseOverOnTees();
		 p1.clickOnProduct();
		 p1.selectSize();
		 p1.selectColour();
		 p1.clickOnAddToCart();
		 p1.printTheSuccesMessage();
		 
		 
	 }
	
}
