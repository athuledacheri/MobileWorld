package automation_mobileworld;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import automation_mobileworld.SignUpS;

public class SignUpS {
	
	

	   @Test(dataProvider="Signup")
	    public void main(String Firstname,String Lastname,
	            String email,String Password,String date,
	            String mobilenumber,String shortbio) throws Exception
	       {
	        System.setProperty("webdriver.chrome.driver","C:\\Users\\athul.e\\Downloads\\chromedriver_win32\\chromedriver.exe");
	        WebDriver driver = new ChromeDriver();
	        
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
	            //driver.switchTo().alert().accept();
	            driver.close();
	         



	   }
	    @DataProvider(name="Signup")
	    public Object[][] getdata()
	    {
	        Object [][] data=new Object[2][7];    
	        data [0][0]="Athul";
	        data [0][1]="edacheriyan";
	        data [0][2]="athul@gmail.com";
	        data [0][3]="athul123";
	        data [0][4]="00/07/2000";
	        data [0][5]="123456789";
	        data [0][6]="Hai,Hello...";
	        data [1][0]="Ss";
	        data [1][1]="c";
	        data [1][2]="athul";
	        data [1][3]="athu";
	        data [1][4]="45/02/2000";
	        data [1][5]="1234";
	        data [1][6]="";
	       
	       return data;
	    }

}
