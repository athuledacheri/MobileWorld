package automation_mobileworld;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class SignInScript {

	// Verifying inputs

	@Test(dataProvider = "Signin")
	public void sign(String username, String Password) throws Exception {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\athul.e\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		SignInPackage page = new SignInPackage(driver);
		page.goTo();
		page.signinbutton().click();
		page.uname().sendKeys(username);
		page.pwd().sendKeys(Password);
		page.loginbutton().click();

		int un = username.length();
		int pd = Password.length();

		if ((un < 3) || (un > 20)) {
			Assert.assertEquals("https://mobileworld.banyanpro.com/sign.html", driver.getCurrentUrl());
		}

		else if ((pd < 3) || (pd > 10)) {

			Assert.assertEquals("https://mobileworld.banyanpro.com/sign.html", driver.getCurrentUrl());

		}

		else {
			Assert.assertEquals("https://mobileworld.banyanpro.com/index.html", driver.getCurrentUrl());
		}

		driver.close();

	}

	@DataProvider(name = "Signin")
	public Object[][] getdata() {
		Object[][] data = new Object[7][2];

		// valid data

		data[0][0] = "Athul";
		data[0][1] = "pass123";

		// invalid usernames

		data[1][0] = "At";
		data[1][1] = "pass123";
		data[2][0] = "";
		data[2][1] = "pass123";
		data[3][0] = "asdfghjgfdkndskjfnksdjnfksdjfnkjfnkj";
		data[3][1] = "pass123";

		// invalid passwords

		data[4][0] = "Athul";
		data[4][1] = "";
		data[5][0] = "Athul";
		data[5][1] = "pa";
		data[6][0] = "AthulE";
		data[6][1] = "pass1234567890";

		return data;

	}
//	verify signup link

	@Test

	public void SignInLink() {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\athul.e\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		SignInPackage page = new SignInPackage(driver);
		page.goTo();
		page.signinbutton().click();
		page.signUpLink().click();
		Assert.assertEquals("https://mobileworld.banyanpro.com/signup.html", driver.getCurrentUrl());
		driver.close();

	}

}
