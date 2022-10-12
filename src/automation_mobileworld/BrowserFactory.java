package automation_mobileworld;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BrowserFactory {
        
//        public static WebDriver startapplication(WebDriver driver, String BrowserName, String appURL)
//        {
//            if(BrowserName.equals("Chrome"))
//            {
//                System.setProperty("webdriver.chrome.driver", "C:\\Users\\priyanka.vs\\Downloads\\chromedriver_win32\\chromedriver.exe");
//                driver= new ChromeDriver();
//                
//            }
//            else if(BrowserName.equals("Edge"))
//            {
//                System.setProperty("webdriver.edge.driver", "C:\\Users\\priyanka.vs\\Downloads\\edgedriver_win64\\msedgedriver.exe");
//                driver = new EdgeDriver();
//            }
//            else
//            {
//                System.out.println("Sorry this browser is not supported !!");
//            }
//            
//            driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
//            driver.manage().window().maximize();
//            driver.get(appURL);
//            driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
//            
//            return driver;
//        }
        public static void QuitBrowser(WebDriver driver)
        {
            driver.quit();
        }
        
         
}


