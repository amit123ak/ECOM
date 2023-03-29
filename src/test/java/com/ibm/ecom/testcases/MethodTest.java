package com.ibm.ecom.testcases;

import org.apache.logging.log4j.LogManager;
import org.openqa.selenium.By;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.ibm.ecom.base.BaseClass;

public class MethodTest extends BaseClass{
	//org.apache.logging.log4j.Logger logger = LogManager.getLogger(MethodTest.class.getName());
	
  @Test (dataProvider="testdata")
  public static void signup(String user,String pwd) throws InterruptedException
  {   
	 // driver.get(prop.getProperty("testurl"));
	  org.apache.logging.log4j.Logger logger = LogManager.getLogger(MethodTest.class.getName());
	  driver.findElement(By.xpath(loc.getProperty("sign"))).click();
	  
	  logger.debug("click on sign button");
	  Thread.sleep(1000);
	  driver.findElement(By.xpath(loc.getProperty("email_feld"))).sendKeys(user);
	  logger.debug("typing user name");
	  Thread.sleep(1000);
	  driver.findElement(By.xpath(loc.getProperty("next_button"))).click();
	  logger.debug("click on next button");
	  Thread.sleep(4000);
	  driver.findElement(By.xpath(loc.getProperty("passwd_feld"))).sendKeys(pwd);
	  logger.debug("field password ");
	  Thread.sleep(4000);
	 driver.findElement(By.cssSelector(loc.getProperty("signbtn"))).click();
	  logger.debug("click on sign button ");
	  Thread.sleep(8000);
	  logger.error("error during sigining");
	  
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
