package stepDefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import io.cucumber.java.en.Then;
import pages.LoginPage;
import utils.BaseClass;

import static org.junit.Assert.assertTrue;

public class LoginSteps {
	LoginPage loginPage = new LoginPage();

	@Given("User is on SauceDemo login page")
	public void user_is_on_login_page() {
		BaseClass.driver.get("https://www.saucedemo.com/");
	}

	@When("User enters username {string} and password {string}")
	public void user_enters_credentials(String username, String password) {
		loginPage.login(username, password);
	}

	@Then("User should be logged in successfully")
	public void user_should_be_logged_in_successfully() {
		assertTrue(BaseClass.driver.getCurrentUrl().contains("inventory"));
	}

	@Then("Verify the title of the login page")
	public void Verify_the_title_of_the_login_page() {
		assertTrue(loginPage.verifyTitleOfLoginPage());
	}

	@When("User do not enter any credentials")
    public void user_do_not_enter_any_credentials() {
        loginPage.loginButtonWithEmptyCredentials();
    }

	@Then("Verify the error message for empty fields")
	public void verify_the_error_message_for_empty_fields() {
        assertTrue(loginPage.loginrrorMessageForEmptyFields());
	}
	
	@Then("verify the error message for invalid fields")
	public void verify_the_error_message_for_invalid_fields() {
		assertTrue(loginPage.loginButtonWithInvalidCredentials());
	}
}