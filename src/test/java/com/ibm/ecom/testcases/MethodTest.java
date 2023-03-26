package com.ibm.ecom.testcases;

import org.openqa.selenium.By;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.ibm.ecom.base.BaseClass;

public class MethodTest extends BaseClass{
	
  @Test (dataProvider="testdata")
  public static void signup(String user,String pwd) throws InterruptedException
  {   
	 // driver.get(prop.getProperty("testurl"));
	  driver.findElement(By.xpath(loc.getProperty("sign"))).click();
	  Thread.sleep(1000);
	  driver.findElement(By.xpath(loc.getProperty("email_feld"))).sendKeys(user);
	  Thread.sleep(1000);
	  driver.findElement(By.xpath(loc.getProperty("next_button"))).click();
	  Thread.sleep(4000);
	  driver.findElement(By.xpath(loc.getProperty("passwd_feld"))).sendKeys(pwd);
	  Thread.sleep(4000);
	 driver.findElement(By.cssSelector(loc.getProperty("signbtn"))).click();
	  Thread.sleep(8000);
	  
  }
  
  @DataProvider (name ="testdata")
  public Object[][] tData(){
	 return new Object[][]{
		 
		 {"amitkumargondcse@gmail.com","Amitkumar@12345"},
		 {"amitkumargondcse@gmail.com","Amitkumar@12345"},
		 {"amitkumargondcse@gmail.com","Amitkumar@12345"},
		 {"amitkumargondcse@gmail.com","Amitkumar@12345"},
		 {"amitkumargondcse@gmail.com","Amitkumar@12345"},
		 {"amitkumargondcse@gmail.com","Amitkumar@12345"},
		 {"amitkumargondcse@gmail.com","Amitkumar@12345"},
		 {"amitkumargondcse@gmail.com","Amitkumar@12345"},
		 {"amitkumargondcse@gmail.com","Amitkumar@12345"},
		 {"amitkumargondcse@gmail.com","Amitkumar@123456"}
	 
	 };
  }
}
