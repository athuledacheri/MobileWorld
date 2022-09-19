package automation_mobileworld;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;


public class HomePo {
//
//	@AfterMethod
//	public void closeBro() {
//	BrowserFactory.QuitBrowser(driver);
//	}
//	
	
	@Test
	
	public  void dumb(){
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\athul.e\\Downloads\\chromedriver_win32\\chromedriver.exe");
    WebDriver driver = new ChromeDriver();
    HomePageLand lp = new HomePageLand(driver);
    lp.goTo();
    
    lp.clickAllMobilesNav();
//    Assert.assertEquals("https://mobileworld.banyanpro.com/mobile.html", driver.getCurrentUrl());
    driver.close();
	}
    
    @Test
	
	public  void dumb0(){
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\athul.e\\Downloads\\chromedriver_win32\\chromedriver.exe");
    WebDriver driver = new ChromeDriver();
    HomePageLand lp = new HomePageLand(driver);
    lp.goTo();
    
    lp.clickApple();
//    Assert.assertEquals(driver.getCurrentUrl(),"https://mobileworld.banyanpro.com/#apple");
    driver.close();
}
    
    @Test
	
	public  void dumb1(){
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\athul.e\\Downloads\\chromedriver_win32\\chromedriver.exe");
    WebDriver driver = new ChromeDriver();
    HomePageLand lp = new HomePageLand(driver);
    lp.goTo();
    
    lp.clickContactUs();
   
//    	 Assert.assertEquals(driver.getCurrentUrl()," https://mobileworld.banyanpro.com/contact.html");
    driver.close();
}
   @Test
	
	public  void dumb2(){
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\athul.e\\Downloads\\chromedriver_win32\\chromedriver.exe");
    WebDriver driver = new ChromeDriver();
    HomePageLand lp = new HomePageLand(driver);
    lp.goTo();
    
    lp.clickHomeNav();
//    Assert.assertEquals("https://mobileworld.banyanpro.com/index.html", driver.getCurrentUrl());
    driver.close();
}
    
  @Test
	
	public  void dumb3(){
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\athul.e\\Downloads\\chromedriver_win32\\chromedriver.exe");
    WebDriver driver = new ChromeDriver();
    HomePageLand lp = new HomePageLand(driver);
    lp.goTo();
    
    lp.clickLatestNav();
//    Assert.assertEquals("https://mobileworld.banyanpro.com/index.html", driver.getCurrentUrl());
    driver.close();
}
    @Test
	
	public  void dumb4(){
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\athul.e\\Downloads\\chromedriver_win32\\chromedriver.exe");
    WebDriver driver = new ChromeDriver();
    HomePageLand lp = new HomePageLand(driver);
    lp.goTo();
    
    lp.clickLenovo();
//    Assert.assertEquals( driver.getCurrentUrl(),"https://mobileworld.banyanpro.com/#lenovo");
    driver.close();
}
    @Test
	
	public  void dumb5(){
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\athul.e\\Downloads\\chromedriver_win32\\chromedriver.exe");
    WebDriver driver = new ChromeDriver();
    HomePageLand lp = new HomePageLand(driver);
    lp.goTo();
    
    lp.clickOrder();
//    Assert.assertEquals(driver.getCurrentUrl(),"https://mobileworld.banyanpro.com/order.html");
    driver.close();
}
    @Test
	
	public  void dumb6(){
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\athul.e\\Downloads\\chromedriver_win32\\chromedriver.exe");
    WebDriver driver = new ChromeDriver();
    HomePageLand lp = new HomePageLand(driver);
    lp.goTo();
    
    lp.clickSamsung();
//    Assert.assertEquals( driver.getCurrentUrl(),"https://mobileworld.banyanpro.com/#samsung");
    driver.close();
}
    @Test
	
	public  void dumb7(){
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\athul.e\\Downloads\\chromedriver_win32\\chromedriver.exe");
    WebDriver driver = new ChromeDriver();
    HomePageLand lp = new HomePageLand(driver);
    lp.goTo();
    
    lp.clickSupportNav();
    
    driver.close();
}
    
    
    
    
    
}

