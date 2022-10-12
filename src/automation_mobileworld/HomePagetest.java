package automation_mobileworld;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class HomePagetest {
	
	
	
		@Test
	    public void homepage1() throws InterruptedException
	    
	{
			System.setProperty("webdriver.chrome.driver", "C:\\Users\\athul.e\\Documents\\chromedriver_win32\\chromedriver.exe");
	        WebDriver driver = new ChromeDriver();
	        driver.get("https://mobileworld.banyanpro.com/");   
	        
	       Assert.assertEquals( driver.getCurrentUrl(),"https://qualicoach.org/mwapp/index.html");
	        driver.quit();
	        
	}
	    @Test
	    public void homepage2() throws InterruptedException {
	        WebDriver driver = new ChromeDriver();        
	         driver.get("https://qualicoach.org/mwapp/index.html");
	         driver.findElement(By.xpath("//a[@class='nav-link dropdown-toggle\']")).click();
	         
	         
	         driver.quit();
	        
	    }
	    
	    
	    @Test
	    public void homepage3() throws InterruptedException {
	        WebDriver driver = new ChromeDriver();        
	        driver.get("https://qualicoach.org/mwapp/index.html");
	        driver.findElement(By.xpath("//a[@class='nav-link dropdown-toggle\']")).click();
	     driver.findElement(By.xpath("//a[@class='dropdown-item\']")).click();
	   
	     Thread.sleep(1000);
	     driver.quit();
	        
	    }
	    @Test
	    public void homepage4() throws InterruptedException {
	        WebDriver driver = new ChromeDriver();        
	        driver.get("https://qualicoach.org/mwapp/index.html");
	        driver.findElement(By.xpath("//a[@class='nav-link dropdown-toggle\']")).click();
	     driver.findElement(By.xpath("//a[@class='dropdown-item\']")).click();
	     driver.findElement(By.xpath("//section[@id='home']")).click();
	     Thread.sleep(1000);
	     driver.quit();
	   }
	    @Test
	    public void homepage5() throws InterruptedException {
	       WebDriver driver = new ChromeDriver();        
	        driver.get("https://qualicoach.org/mwapp/index.html");
	         driver.findElement(By.xpath("//a[@class='nav-link dropdown-toggle\']")).click();
	         driver.findElement(By.xpath("//a[normalize-space()='Apple']")).click();
	         Thread.sleep(1000);
	         driver.quit();
	        
	   }
	   @Test
	   public void homepage6() throws InterruptedException {
	      WebDriver driver = new ChromeDriver();        
	    driver.get("https://qualicoach.org/mwapp/index.html");
	         driver.findElement(By.xpath("/html[1]/body[1]/nav[1]/div[1]/ul[1]/li[4]/a[1]")).click();
	        Thread.sleep(1000);
	     driver.quit();
	   }
	   @Test
	   public void homepage7() throws InterruptedException {
	     WebDriver driver = new ChromeDriver();        
	     driver.get("https://qualicoach.org/mwapp/index.html");
	        driver.findElement(By.xpath("/html[1]/body[1]/nav[1]/div[1]/ul[1]/li[4]/a[1]")).click();
	      
	       driver.findElement(By.cssSelector(".dropdown-item[href='order.html']")).click();
	    Thread.sleep(1000);
	    driver.quit();
	   
	     
	  }
	    
	    @Test
	    public void homepage8() throws InterruptedException {
	       WebDriver driver = new ChromeDriver();        
	        driver.get("https://qualicoach.org/mwapp/index.html");
	          driver.findElement(By.xpath("/html[1]/body[1]/nav[1]/div[1]/ul[1]/li[4]/a[1]")).click();
	        
	        driver.findElement(By.xpath("//a[@class='dropdown-item'][normalize-space()='Contact Us']")).click();
	         Thread.sleep(1000);
	         driver.quit();
	     
	    }  
	     

	}


