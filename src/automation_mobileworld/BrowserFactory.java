package automation_mobileworld;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class BrowserFactory {
	
//	public static WebDriver startapplication(WebDriver driver, String BrowserName, String appURL)
//    {
//        if(BrowserName.equals("Chrome"))
//        {
//            System.setProperty("webdriver.chrome.driver", "C:\\Users\\athul.e\\Documents\\chromedriver_win32\\chromedriver.exe");
//            driver= new ChromeDriver();
//            
//        }
//        else if(BrowserName.equals("Edge"))
//        {
//            System.setProperty("webdriver.edge.driver", "C:\\Users\\athul.e\\Documents\\edgedriver_win64\\msedgedriver.exe");
//            driver = new EdgeDriver();
//        }   
//      
//       driver.manage().window().maximize();
//       driver.get(appURL);
//       
//        
//        return driver;
//    }
//   
        
        public static void QuitBrowser(WebDriver driver)
        {
            driver.quit();
        }
        
        
      
        
         
}


