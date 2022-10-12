package automation_mobileworld;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;


public class HomePo {
    WebDriver driver;
	@AfterMethod
    public void closeBro() {
    BrowserFactory.QuitBrowser(driver);
	}
	
@Test
	
	public  void homenav(){
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\athul.e\\Documents\\chromedriver_win32\\chromedriver.exe");
     driver = new ChromeDriver();
    HomePageLand lp = new HomePageLand(driver);
    lp.goTo();
    lp.clickHomeNav();
    Assert.assertEquals( driver.getCurrentUrl(),"https://mobileworld.banyanpro.com/index.html");
    driver.close();
}
@Test

	public  void samsung(){
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\athul.e\\Documents\\chromedriver_win32\\chromedriver.exe");
     driver = new ChromeDriver();
    HomePageLand lp = new HomePageLand(driver);
	 lp.goTo();
	 lp.clickLatestNav();
	 lp.clickSamsung();
	 Assert.assertEquals( driver.getCurrentUrl(),"https://mobileworld.banyanpro.com/#samsung");
	 driver.close();
}


@Test

	public  void lenovo(){
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\athul.e\\Documents\\chromedriver_win32\\chromedriver.exe");
    driver = new ChromeDriver();
	HomePageLand lp = new HomePageLand(driver);
	lp.goTo();
	lp.clickLatestNav();
	lp.clickLenovo();
	Assert.assertEquals( driver.getCurrentUrl(),"https://mobileworld.banyanpro.com/#lenovo");
	driver.close();
}


@Test

	public  void apple(){
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\athul.e\\Documents\\chromedriver_win32\\chromedriver.exe");
	driver = new ChromeDriver();
	HomePageLand lp = new HomePageLand(driver);
	lp.goTo();
	lp.clickLatestNav();
	lp.clickApple();
	Assert.assertEquals(driver.getCurrentUrl(),"https://mobileworld.banyanpro.com/#apple");
	driver.close();
}

    
//	
	
	@Test
	
	public  void allmobiles(){
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\athul.e\\Documents\\chromedriver_win32\\chromedriver.exe");
    driver = new ChromeDriver();
    HomePageLand lp = new HomePageLand(driver);
    lp.goTo();
    lp.clickAllMobilesNav();
    Assert.assertEquals( driver.getCurrentUrl(),"https://mobileworld.banyanpro.com/mobile.html");
    driver.close();
	}

    @Test
	
	public  void contact(){
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\athul.e\\Documents\\chromedriver_win32\\chromedriver.exe");
    driver = new ChromeDriver();
    HomePageLand lp = new HomePageLand(driver);
    lp.goTo();
    lp.clickSupportNav();
    lp.clickContactUs();
    
    Set<String> windows=driver.getWindowHandles();
    Iterator<String> it = windows.iterator();
    it.next();
    driver.switchTo().window(it.next());
    
    Assert.assertEquals(driver.getCurrentUrl(),"https://mobileworld.banyanpro.com/contact.html");
    driver.close();
}

    @Test
	
	public  void order(){
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\athul.e\\Documents\\chromedriver_win32\\chromedriver.exe");
     driver = new ChromeDriver();
    HomePageLand lp = new HomePageLand(driver);
    lp.goTo();
    lp.clickSupportNav();
    lp.clickOrder();
    Set<String> windows=driver.getWindowHandles();
    Iterator<String> it = windows.iterator();
    it.next();
    driver.switchTo().window(it.next());

    Assert.assertEquals(driver.getCurrentUrl(),"https://mobileworld.banyanpro.com/order.html");
    driver.close();
}

    @Test
	
  	public  void moreDetailsBtn(){
  	System.setProperty("webdriver.chrome.driver", "C:\\Users\\athul.e\\Documents\\chromedriver_win32\\chromedriver.exe");
      driver = new ChromeDriver();
      HomePageLand lp = new HomePageLand(driver);
      lp.clickMore();
      Assert.assertEquals( driver.getCurrentUrl(),"https://mobileworld.banyanpro.com/mobile.html");
      driver.close();
  }
      
 @Test
 
 public void arrow() {
	 
	 System.setProperty("webdriver.chrome.driver", "C:\\Users\\athul.e\\Documents\\chromedriver_win32\\chromedriver.exe");
      driver = new ChromeDriver();
     HomePageLand lp = new HomePageLand(driver);
     lp.clickarrow();
     Assert.assertEquals( driver.getCurrentUrl(),"https://mobileworld.banyanpro.com/index.html");
     driver.close();
	 
 }
    
    
  
    
}

