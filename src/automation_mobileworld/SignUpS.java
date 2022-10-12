package automation_mobileworld;

import org.openqa.selenium.By;
import org.openqa.selenium.NoAlertPresentException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.support.ui.ExpectedConditions;
import automation_mobileworld.SignUpS;


public class SignUpS {
//	
	  WebDriver driver;
		@AfterMethod
	    public void closeBro() {
	    BrowserFactory.QuitBrowser(driver);
		}
	
	
@Test(dataProvider="Signup")
	   public void test1(String Firstname,String Lastname,
	            String email,String Password,String date,
	            String mobilenumber,String shortbio) throws Exception
	       {
	        System.setProperty("webdriver.chrome.driver","C:\\Users\\athul.e\\Documents\\chromedriver_win32\\chromedriver.exe");
	         driver = new ChromeDriver();
	        
	        SignUpP page=new SignUpP(driver);
	        page.goTo();
//	         driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
	            page.Signin().click();
//	            Thread.sleep(2000);
	            page.signup().click();
//	            Thread.sleep(2000);
	            page.Fname().sendKeys(Firstname);
//	            Thread.sleep(2000);
	            page.Lname().sendKeys(Lastname);
//	            Thread.sleep(2000);
	            page.eml().sendKeys(email);
//	            Thread.sleep(2000);
	            page.ppsd().sendKeys(Password);
//	            Thread.sleep(2000);
	            page.dob().sendKeys(date);
//	            Thread.sleep(2000);
	            page.male().click();
//	            Thread.sleep(2000);
	            page.MN().sendKeys(mobilenumber);
//	            Thread.sleep(2000);
	            page.Shtbio().sendKeys(shortbio);
//	            Thread.sleep(2000);
	            page.reg().click();
//	            Thread.sleep(2000);
	            //driver.switchTo().alert().accept();
//	            //Thread.sleep(2000);
//	            page.Signin().click();
////	            Thread.sleep(2000);
//	            //driver.switchTo().alert().accept();
//	            WebElement t = driver.findElement(By.name("submit"));
//	            t.click();
//	            WebDriverWait w = new WebDriverWait(driver,2);
	            boolean al=isAlertPresent(driver) ;

	            Assert.assertTrue(al);
	            
	         



	   }
@Test(dataProvider="Signup1")

	   public void test2(String Firstname,String Lastname,
	            String email,String Password,String date,
	            String mobilenumber,String shortbio) throws Exception
	       {
	        System.setProperty("webdriver.chrome.driver","C:\\Users\\athul.e\\Documents\\chromedriver_win32\\chromedriver.exe");
	         driver = new ChromeDriver();
	        
	        SignUpP page=new SignUpP(driver);
	        page.goTo();
//	         driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
	            page.Signin().click();
//	            Thread.sleep(2000);
	            page.signup().click();
//	            Thread.sleep(2000);
	            page.Fname().sendKeys(Firstname);
//	            Thread.sleep(2000);
	            page.Lname().sendKeys(Lastname);
//	            Thread.sleep(2000);
	            page.eml().sendKeys(email);
//	            Thread.sleep(2000);
	            page.ppsd().sendKeys(Password);
//	            Thread.sleep(2000);
	            page.dob().sendKeys(date);
//	            Thread.sleep(2000);
	            page.male().click();
//	            Thread.sleep(2000);
	            page.MN().sendKeys(mobilenumber);
//	            Thread.sleep(2000);
	            page.Shtbio().sendKeys(shortbio);
//	            Thread.sleep(2000);
	            page.reg().click();
//	            Thread.sleep(2000);
	            //driver.switchTo().alert().accept();
	            //Thread.sleep(2000);
	            page.Signin().click();
//	            Thread.sleep(2000);
	            WebElement t = driver.findElement(By.name("submit"));
	            t.click();
	            // Explicit wait condition for alert
	           
	            boolean al=isAlertPresent(driver) ;

	            Assert.assertTrue(al);
	            
	         



	   }
	   
	   public boolean isAlertPresent(WebDriver driver) 
	   { 
	       try 
	       { 
	           driver.switchTo().alert(); 
	           return true; 
	       }   // try 
	       catch (NoAlertPresentException Ex) 
	       { 
	           return false; 
	       }   // catch 
	   }   // isAlertPresent()
	   

	    @DataProvider(name="Signup")
	    public Object[][] getdata()
	    {
	        Object [][] data=new Object[1][7];    
	        data [0][0]="Athul";
	        data [0][1]="edacheriyan";
	        data [0][2]="athul@gmail.com";
	        data [0][3]="athul123";
	        data [0][4]="03/07/2000";
	        data [0][5]="123456789";
	        data [0][6]="Hai,Hello...";
	        
//	        data [0][0]="Athul";
//	        data [0][1]="edacheriyan";
//	        data [0][2]="athul@gmail.com";
//	        data [0][3]="athul123";
//	        data [0][4]="03/07/2000";
//	        data [0][5]="123456789";
//	        data [0][6]="Hai,Hello...";
//	        
	       
	       return data;
	    }
	    
	    @DataProvider(name="Signup1")
	    public Object[][] getdata1()
	    {
	        Object [][] data=new Object[3][7];    
	       
	        data [0][0]="Ss";
	        data [0][1]="ed";
	        data [0][2]="athul@gg.com";
	        data [0][3]="athu";
	        data [0][4]="15/02/2000";
	        data [0][5]="8943502056";
	        data [0][6]="hasegfiulwk";
	        

	        data [1][0]="Ss";
	        data [1][1]="ed";
	        data [1][2]="athulgg.com";
	        data [1][3]="athu";
	        data [1][4]="15/02/2000";
	        data [1][5]="9846403046";
	        data [1][6]="hasegfiulwk";
	        

	        data [2][0]="Ss";
	        data [2][1]="ed";
	        data [2][2]="athul@gg.com";
	        data [2][3]="123456";
	        data [2][4]="15/02/2000";
	        data [2][5]="1234";
	        data [2][6]="hasegfiulwk";
	       
	       
	       return data;
	    }



}
