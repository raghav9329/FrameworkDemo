package testcases;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import applicationpages.Homepage;
import factory.BrowserFactory;
import factory.DataProviderFactory;

public class VerifyHomePage {
WebDriver driver;
@BeforeMethod
public void setUp(){
	driver= BrowserFactory.getBrowser("chrome");
	driver.get(DataProviderFactory.getConfig().getApplicationUrl());
	
}
@Test
public void testHomePage(){
	Homepage home = PageFactory.initElements(driver,Homepage.class);
	String title = home.getApplicationTitle();
	Assert.assertTrue(title.contains("Avactis Demo Store"));
	
}
@AfterMethod
public void tearDown(){
	BrowserFactory.closeBrowser(driver);
}
}
