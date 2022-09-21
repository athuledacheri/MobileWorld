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

//	@AfterMethod
//	public void closeBro() {
//	   driver.quit();
//	}
//	
	
	@Test
	
	public  void allmobiles(){
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\athul.e\\Downloads\\chromedriver_win32\\chromedriver.exe");
    WebDriver driver = new ChromeDriver();
    HomePageLand lp = new HomePageLand(driver);
    lp.goTo();
    lp.clickAllMobilesNav();
//    Assert.assertEquals( driver.getCurrentUrl(),"https://mobileworld.banyanpro.com/mobile.html");
    driver.close();
	}
    
    @Test
	
	public  void apple(){
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\athul.e\\Downloads\\chromedriver_win32\\chromedriver.exe");
    WebDriver driver = new ChromeDriver();
    HomePageLand lp = new HomePageLand(driver);
    lp.goTo();
    lp.clickLatestNav();
    lp.clickApple();
//    Assert.assertEquals(driver.getCurrentUrl(),"https://mobileworld.banyanpro.com/#apple");
    driver.close();
}
    
    @Test
	
	public  void contact(){
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\athul.e\\Downloads\\chromedriver_win32\\chromedriver.exe");
    WebDriver driver = new ChromeDriver();
    HomePageLand lp = new HomePageLand(driver);
    lp.goTo();
    lp.clickSupportNav();
    lp.clickContactUs();
   
//    	 Assert.assertEquals(driver.getCurrentUrl()," https://mobileworld.banyanpro.com/contact.html");
    driver.close();
}
   @Test
	
	public  void homenav(){
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\athul.e\\Downloads\\chromedriver_win32\\chromedriver.exe");
    WebDriver driver = new ChromeDriver();
    HomePageLand lp = new HomePageLand(driver);
    lp.goTo();
    lp.clickHomeNav();
//    Assert.assertEquals( driver.getCurrentUrl(),"https://mobileworld.banyanpro.com/index.html");
    driver.close();
}
    
  @Test
	
	public  void latestnav(){
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\athul.e\\Downloads\\chromedriver_win32\\chromedriver.exe");
    WebDriver driver = new ChromeDriver();
    HomePageLand lp = new HomePageLand(driver);
    lp.goTo();
    lp.clickLatestNav();
//    Assert.assertEquals(driver.getCurrentUrl(),"https://mobileworld.banyanpro.com/index.html" );
    driver.close();
}
    @Test
	
	public  void lenovo(){
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\athul.e\\Downloads\\chromedriver_win32\\chromedriver.exe");
    WebDriver driver = new ChromeDriver();
    HomePageLand lp = new HomePageLand(driver);
    lp.goTo();
    lp.clickLatestNav();
    lp.clickLenovo();
    Assert.assertEquals( driver.getCurrentUrl(),"https://mobileworld.banyanpro.com/#lenovo");
    driver.close();
}
    @Test
	
	public  void order(){
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\athul.e\\Downloads\\chromedriver_win32\\chromedriver.exe");
    WebDriver driver = new ChromeDriver();
    HomePageLand lp = new HomePageLand(driver);
    lp.goTo();
    lp.clickSupportNav();
    lp.clickOrder();
//    Assert.assertEquals(driver.getCurrentUrl(),"https://mobileworld.banyanpro.com/order.html");
    driver.close();
}
    @Test
	
	public  void samsung(){
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\athul.e\\Downloads\\chromedriver_win32\\chromedriver.exe");
    WebDriver driver = new ChromeDriver();
    HomePageLand lp = new HomePageLand(driver);
    lp.goTo();
    lp.clickLatestNav();
    lp.clickSamsung();
//    Assert.assertEquals( driver.getCurrentUrl(),"https://mobileworld.banyanpro.com/#samsung");
    driver.close();
}
    @Test
	
	public  void supportnav(){
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\athul.e\\Downloads\\chromedriver_win32\\chromedriver.exe");
    WebDriver driver = new ChromeDriver();
    HomePageLand lp = new HomePageLand(driver);
    lp.goTo();
    lp.clickSupportNav();
    
    driver.close();
}
    
    
//    @Test
//	
//   	public  void dumb8(){
//   	System.setProperty("webdriver.chrome.driver", "C:\\Users\\athul.e\\Downloads\\chromedriver_win32\\chromedriver.exe");
//       WebDriver driver = new ChromeDriver();
//       HomePageLand lp = new HomePageLand(driver);
//       lp.goTo();
//       lp.clickSupportNav();
//       lp.clickContactUs();
//       driver.close();
//   }
//    
//    
    
    
}

