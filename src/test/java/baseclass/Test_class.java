package baseclass;

import static org.testng.Assert.assertEquals;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import pom_classes.POM1;
import pom_classes.POM2;
import pom_classes.POM3;

public class Test_class extends Base1{
//declare all useful members globally
	POM1 login1;
	POM2 login2;
	POM3 home;
	
	@BeforeClass
	public void  openbrowser() {
		initializebrowser();
		//all objects of POM class
		login1=new POM1(driver);
		login2=new POM2(driver);
		home=new POM3(driver);
}
	@BeforeMethod
	public void loginToApp() throws Throwable {
		//enter um
		login1.enterUN(Utility.getTD(0, 0));
		//enter pwd
		login1.enterpwd(Utility.getTD(0, 1));
		login1.clicklogin();
		
//enter pin
		login2.enterpin(Utility.getTD(0, 2));
		login2.clickctnbtn();
	}
	@Test
	public void verifyuserID() throws Throwable {
		Reporter.log("running verifyuserID",true);
		String actID = home.verifyuser();
		String expID = Utility.getTD(0, 0);
		Assert.assertEquals(actID,expID,"both are different TC is fail");
	}
	@AfterMethod
	public void logOutApp() {
		Reporter.log("log out application", true);
	}
	@AfterClass
	public void closebrowser() {
		Reporter.log("close the app", true);
	
		
		
		
		
		
		
		
		
		
		
	
}	
}