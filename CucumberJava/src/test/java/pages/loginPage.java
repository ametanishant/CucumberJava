package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class loginPage {

	WebDriver driver;

	private By txt_username_ = By.id("name");

	private By txt_password_ = By.id("password");

	private By btn_login = By.id("login");
	
	private By btn_logout = By.id("logout");
	
	
	
	public loginPage(WebDriver driver) {
		this.driver = driver;
	}

	public void enterUserName(String username) {

		driver.findElement(txt_username_).sendKeys(username);

	}

	public void enterPassword(String password) {
		driver.findElement(txt_password_).sendKeys(password);

	}

	public void clicklogin() {
		driver.findElement(btn_login).click();

	}
	
	public void checkLogoutIsDisplayed() {
		driver.findElement(btn_logout).isDisplayed();

	}

}
