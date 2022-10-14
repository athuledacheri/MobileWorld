package automation_mobileworld;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;


public class HomePo {
    WebDriver driver;
	@AfterMethod
    public void closeBro() {
    BrowserFactory.QuitBrowser(driver);
    
	}
	
	

	 
	 public void startapplication(String BrowserName) {
         
		if(BrowserName.equals("Chrome"))
        {
            System.setProperty("webdriver.chrome.driver", "C:\\Users\\athul.e\\Documents\\chromedriver_win32\\chromedriver.exe");
            driver= new ChromeDriver();
            
        }
        else if(BrowserName.equals("Edge"))
        {
            System.setProperty("webdriver.edge.driver", "C:\\Users\\athul.e\\Documents\\edgedriver_win64\\msedgedriver.exe");
            driver = new EdgeDriver();
        }   
                 
	 }
	
@Test
	
	public  void homenav(){
	startapplication("Chrome");
     
    HomePageLand lp = new HomePageLand(driver);
    lp.goTo();
    lp.clickHomeNav();
    Assert.assertEquals( driver.getCurrentUrl(),"https://mobileworld.banyanpro.com/index.html");
    driver.close();
}
@Test

	public  void samsung(){
	startapplication("Edge");    HomePageLand lp = new HomePageLand(driver);
	 lp.goTo();
	 lp.clickLatestNav();
	 lp.clickSamsung();
	 Assert.assertEquals( driver.getCurrentUrl(),"https://mobileworld.banyanpro.com/#samsung");
	 driver.close();
}


@Test

	public  void lenovo(){

	startapplication("Chrome");

	HomePageLand lp = new HomePageLand(driver);
	lp.goTo();
	lp.clickLatestNav();
	lp.clickLenovo();
	Assert.assertEquals( driver.getCurrentUrl(),"https://mobileworld.banyanpro.com/#lenovo");
	driver.close();
}


@Test

	public  void apple(){

	startapplication("Edge");
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
		startapplication("Edge");
    HomePageLand lp = new HomePageLand(driver);
    lp.goTo();
    lp.clickAllMobilesNav();
    Assert.assertEquals( driver.getCurrentUrl(),"https://mobileworld.banyanpro.com/mobile.html");
    driver.close();
	}

    @Test
	
	public  void contact(){
    	startapplication("Chrome");    
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
    startapplication("Edge");   
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
    	startapplication("Chrome");      HomePageLand lp = new HomePageLand(driver);
      lp.clickMore();
      Assert.assertEquals( driver.getCurrentUrl(),"https://mobileworld.banyanpro.com/mobile.html");
      driver.close();
  }
      
 @Test
 
 public void arrow() {
	 
	 startapplication("Chrome");     HomePageLand lp = new HomePageLand(driver);
     lp.clickarrow();
     Assert.assertEquals( driver.getCurrentUrl(),"https://mobileworld.banyanpro.com/index.html");
     driver.close();
	 
 }
 
 
 
 
    
    
  
    
}

