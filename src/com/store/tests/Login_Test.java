package com.store.tests;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.store.pages.Login_Page;
public class Login_Test{
	public WebDriver driver;
	public Properties prop;
	public FileInputStream fis;
	
@BeforeClass

public void launchApp() throws IOException {
	
	Properties prop= new Properties();
	FileInputStream fis= new FileInputStream(System.getProperty("user.dir")+"/src/com/store/common/config.properties");
	prop.load(fis); 
	System.setProperty("webdriver.chrome.driver",System.getProperty("user.dir")+"/src/com/store/utilities/chromedriver.exe" );
	driver=new ChromeDriver();
	driver.get(prop.getProperty("url"));
	driver.manage().window().maximize(); 
	driver.manage().timeouts().implicitlyWait(15,TimeUnit.SECONDS);
	JavascriptExecutor js=(JavascriptExecutor)driver;
	js.executeScript("window.scrollBy(0,2000)","");
}
@Test 
public void validLogin() throws IOException, InterruptedException
{	
Properties prop= new Properties();
FileInputStream fis= new FileInputStream(System.getProperty("user.dir")+"/src/com/store/common/config.properties");
prop.load(fis); 
Login_Page lp= new Login_Page(driver);
lp.validLogin(prop.getProperty("email"),prop.getProperty("Firstname"),prop.getProperty("Lastname"),prop.getProperty("email_1"),prop.getProperty("Password"),prop.getProperty("day"),prop.getProperty("month"),prop.getProperty("year"));
lp.ValidLoginAddressData(prop.getProperty("Firstname1"),prop.getProperty("Lastname1"),prop.getProperty("Address"),prop.getProperty("City"),prop.getProperty("State"),prop.getProperty("PostCode"),prop.getProperty("Country"),prop.getProperty("Other"),prop.getProperty("Addr"));
lp.ValidProductData(prop.getProperty("quantity"));
JavascriptExecutor js=(JavascriptExecutor)driver;
js.executeScript("window.scrollBy(0,2000)","");
}

@AfterClass
public void tierdown()
{
	driver.quit();
}
}
