package com.store.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class Login_Page {
public WebDriver driver ;
	
public Login_Page(WebDriver driver)
{
	this.driver=driver;
}
By lnk_signin=By.linkText("Sign in");
By txt_email= By.id("email_create");
By btn_create =By.xpath("//button[@id='SubmitCreate']/span");
By radio_btn =By.id("id_gender2");
By txt_firstname=By.id("customer_firstname");
By txt_lastname=By.id("customer_lastname");
By txt_email1=By.id("email");
By txt_password=By.id("passwd");
By drp_day=By.id("days");
By drp_month=By.id("months");
By drp_year=By.id("years");
By Addr_txt_firstname=By.id("firstname");
By Addr_txt_lastname=By.id("lastname");
By Addr_txt_company=By.id("company");
By Addr_txt_city=By.id("city");
By Addr_drp_state=By.id("id_state");
By Addr_txt_zipcode=By.id("postcode");
By Addr_drp_country=By.id("id_country");
By Addr_txt_additional_info=By.id("other");
By Addr_txt_mobile=By.id("phone_mobile");
By Addr_txt_addr_alias=By.id("alias");
By btn_register=By.xpath("//button[@id='submitAccount']/span");

  public void validLogin(String email, String Password , String Firstname,String Lastname,String day ,String month,String year, String email_1 ) {
    try {
    driver.findElement(By.linkText("Sign in")).click();
    Thread.sleep(3000);
	driver.findElement(By.id("email_create")).clear();
	driver.findElement(By.id("email_create")).sendKeys(email);
	driver.findElement(By.xpath("//button[@id='SubmitCreate']/span")).click();
	Thread.sleep(3000);
    driver.findElement(By.id("id_gender2")).click();
    driver.findElement(By.id("customer_firstname")).click();
    driver.findElement(By.id("customer_firstname")).clear();
	driver.findElement(By.id("customer_firstname")).sendKeys(Firstname);
	driver.findElement(By.id("customer_lastname")).click();
	driver.findElement(By.id("customer_lastname")).clear();
	driver.findElement(By.id("customer_lastname")).sendKeys(Lastname);
	driver.findElement(By.id("email")).click();
	driver.findElement(By.id("email")).clear();
	driver.findElement(By.id("email")).sendKeys(email_1);
	driver.findElement(By.id("passwd")).click();
    driver.findElement(By.id("passwd")).clear();
	driver.findElement(By.id("passwd")).sendKeys(Password);
	driver.findElement(By.xpath("//*[@id=\"days\"]")).sendKeys("3");
    driver.findElement(By.id("months")).sendKeys("May");
    driver.findElement(By.id("years")).sendKeys("2000");
    }
	catch(Exception e)
    {
		e.printStackTrace();
		System.out.println(e.getMessage());
    }
	
}
 public void ValidLoginAddressData(String Firstname1,String Lastname1, String Address,String City,String State,String PostCode ,String Country, String Other,String Addr) {
	try {
	driver.findElement(By.id("firstname")).click();
	driver.findElement(By.id("firstname")).clear();	
	driver.findElement(By.id("firstname")).sendKeys(Firstname1);
	driver.findElement(By.id("lastname")).clear();
	driver.findElement(By.id("lastname")).sendKeys(Lastname1); 
	driver.findElement(By.id("address1")).sendKeys(Address);
	driver.findElement(By.id("city")).sendKeys(City);
	driver.findElement(By.id("id_state")).sendKeys(State);
	driver.findElement(By.id("postcode")).sendKeys(PostCode);
	driver.findElement(By.id("id_country")).sendKeys(Country);
	driver.findElement(By.id("other")).sendKeys(Other);
	driver.findElement(By.id("phone_mobile")).sendKeys("7028797345");
	driver.findElement(By.id("alias")).sendKeys(Addr);
	driver.findElement(By.xpath("//button[@id='submitAccount']/span")).click();
	Thread.sleep(2000);
	}
	catch(Exception e1)
	{
		e1.printStackTrace();
		System.out.println(e1.getMessage());
	}
 }
	
public void ValidProductData(String quantity ) throws InterruptedException {
	
	driver.findElement(By.linkText("Women")).click();
	driver.findElement(By.id("layered_quantity_1")).click();
	driver.findElement(By.xpath("//*[@id=\"center_column\"]/ul/li[2]/div/div[1]/div/a[1]/img")).click();
	driver.switchTo().frame(0);
	driver.findElement(By.xpath("//p[@id='quantity_wanted_p']/a[2]/span")).click();
    driver.findElement(By.id("group_1")).click();
    new Select(driver.findElement(By.id("group_1"))).selectByVisibleText("M");
    driver.findElement(By.id("group_1")).click();
    driver.findElement(By.id("color_11")).click();
    driver.findElement(By.xpath("//p[@id='add_to_cart']/button/span")).click();
	driver.switchTo().defaultContent();
	driver.findElement(By.xpath("//div[@id='layer_cart']/div/div[2]/div[4]/a/span")).click();
	driver.findElement(By.xpath("//a[@id='2_7_0_363687']/i")).click();
	driver.findElement(By.xpath("//a[@id='cart_quantity_down_2_9_0_363687']/span/i")).click();
	driver.findElement(By.xpath("//a[@id='cart_quantity_down_2_9_0_363687']/span/i")).click();
	driver.findElement(By.xpath("//div[@id='center_column']/p[2]/a/span")).click();
	driver.findElement(By.xpath("//div[@id='center_column']/form/p/button/span")).click();
	driver.findElement(By.xpath("//form[@id='form']/p/button/span")).click();
	driver.findElement(By.xpath("//body[@id='order']/div[2]/div/div/a")).click();
	driver.findElement(By.id("cgv")).click();
	driver.findElement(By.xpath("//form[@id='form']/p/button/span")).click();
	driver.findElement(By.xpath("//a[@id='button_order_cart']/span")).click();
	
	driver.findElement(By.linkText("Sign out")).click();
	
	}
 }


