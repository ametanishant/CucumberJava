package StepDefinitions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.*;

public class LoginDemoSteps {

	/**WebDriver driver = null;

	
	@Given("browser is open -T1")
	public void browser_is_open_t1() {
		String projectPath = System.getProperty("user.dir");
		System.setProperty("webdriver.chrome.driver", projectPath + "/src/test/resources/drivers/chromedriver");
		driver = new ChromeDriver();
	
	}

	@And("user is on login page -T1")
	public void user_is_on_login_page_t1() {
		driver.navigate().to("https://example.testproject.io/web/");
		
	}

	@When("^user enters a (.*) and (.*) -T1$")
	public void user_enters_a_username_and_password_t1(String username, String password) {
		System.out.println("Inside Step - user enters user name apassword");
		driver.findElement(By.id("name")).sendKeys(username);
		driver.findElement(By.id("password")).sendKeys(password);
		
	}

	@And("user hit enter -T1")
	public void user_hit_enter_t1() {
		driver.findElement(By.id("password")).click();
	}

	@Then("user is navigated to home page -T1")
	public void user_is_navigated_to_home_page_t1() {
		driver.getPageSource().contains("FREE SIGN UP");
		driver.close();
		driver.quit();
		
	} **/

}
