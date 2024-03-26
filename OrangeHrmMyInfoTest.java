 package testPackage1;

import java.util.Hashtable;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import com.surveillance.Test.BaseTest;
import com.surveillance.utilitiy.GenericKeywordsWithPage;
import com.surveillance.utilitiy.PropertySingleton;
import com.surveillance.utilitiy.ReadData;
import com.surveillance.utilitiy.Xls_Reader;
import PagePackage1.OrangeMyInfoPage;

public class OrangeHrmMyInfoTest extends BaseTest
{

	OrangeMyInfoPage edit ; 
	PropertySingleton _instance = null;
	SoftAssert s_assert = new SoftAssert();

	public OrangeHrmMyInfoTest() throws Throwable 
	{
		_instance = PropertySingleton.getInstance();
		edit = new OrangeMyInfoPage(GenericKeywordsWithPage.driver);
	}

	@BeforeClass
	public void startReport()
	{
		beforeClassForChild(this);
	
	}
	
	
	@Test 
	public void loginWithValidCredentials() throws Exception
	{
		extentLoggerECP = parentExtentLogger.createNode("login With Valid Credentials");
		s_assert = new SoftAssert();
		edit=new OrangeMyInfoPage(GenericKeywordsWithPage.driver);
		 
		edit.username("Admin");
		edit.password("admin123");
		edit.log();
		edit.myinfo();
		edit.personal();
		edit.firstname("ARUN");
		edit.middle("PRASAD");
		edit.last("MANGADODDI");
		edit.employeeid("16541-M-007");
		edit.otherid("1795");
		edit.driving("AP39LC1795");
		edit.licence("2006", "January", "6");
		Thread.sleep(5000);
	}
}