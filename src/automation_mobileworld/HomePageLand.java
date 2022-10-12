package automation_mobileworld;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePageLand {
	
	    static WebDriver driver;
	    
	    
	    
	    public HomePageLand(WebDriver driver) {
			// TODO Auto-generated constructor stub
	    	this.driver=driver;
	        PageFactory.initElements(driver, this);
		}

		@FindBy(css="div[id='navbarSupportedContent'] ul li:nth-child(1) a")
		WebElement homeNav;
		
		@FindBy(css="div[id='navbarSupportedContent'] ul li:nth-child(2) a")
		WebElement latestNav;
		
		@FindBy(css="div[id='navbarSupportedContent'] ul li:nth-child(3) a")
		WebElement allMobilesNav;
		
		@FindBy(css="div[id='navbarSupportedContent'] ul li:nth-child(4) a")
		WebElement supportNav;
		
		@FindBy(xpath="//div[@id='apple']//div[2]//div[1]//div[1]//a[1]")
		WebElement moreBtn;
		
		@FindBy(linkText="Samsung")
		WebElement samsung;
		
		@FindBy(linkText="Lenovo")
		WebElement lenovo;
		
		@FindBy(linkText="Apple")
		WebElement apple;
		
		@FindBy(linkText="Contact Us")
		WebElement contactUs;
		
		@FindBy(linkText="Order")
		WebElement order;

		@FindBy(css="button[class='btn btn-warning my-2 my-sm-0']")
		WebElement signIn;
		
		@FindBy(xpath="//i[@class='fas fa-arrow-up']")
		WebElement arrow;
		
		public void goTo() {
			driver.get("https://mobileworld.banyanpro.com/");
		}
		public static void quitbrowser()
		{
			driver.quit();
		}
		
		public void clickHomeNav() {
			homeNav.click();
		}

		public void clickLatestNav() {
			latestNav.click();
		}
		public void clickAllMobilesNav() {
			allMobilesNav.click();
		}
		public void clickSupportNav() {
			supportNav.click();
		}
		public void clickSamsung() {
			samsung.click();
		}
		public void clickLenovo() {
			lenovo.click();
		}
		public void clickApple() {
			apple.click();
		}
		public void clickOrder() {
			order.click();
		}
		public void clickContactUs() {
			contactUs.click();

		}
		public void clickMore() {
			moreBtn.click();
		}
		
		public void clickarrow() {
			arrow.click();
		}
	}
