package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utils.BaseClass;

public class LoginPage {
    public LoginPage() {
        PageFactory.initElements(BaseClass.driver, this);
    }

    @FindBy(id = "user-name")
    WebElement usernameField;

    @FindBy(id = "password")
    WebElement passwordField;

    @FindBy(id = "login-button")
    WebElement loginButton;
    
    @FindBy(xpath ="//h3[@data-test='error']")
    WebElement errorMessageForEmptyFields;
    
    @FindBy(xpath ="//h3[@data-test='error']")
    WebElement errorMsgForWrongCredentials;
   

    public void login(String username, String password) {
        usernameField.sendKeys(username);
        passwordField.sendKeys(password);
        loginButton.click();
    }

	public boolean verifyTitleOfLoginPage() {
		String expectedresult="Swag Labs";
		String actualResult=BaseClass.driver.getTitle();
		return expectedresult.equals(actualResult);
		
		
	}

	public void loginButtonWithEmptyCredentials() {
		loginButton.click();
		
	}

	public boolean loginrrorMessageForEmptyFields() {
		return errorMessageForEmptyFields.isDisplayed();
	}

	public boolean loginButtonWithInvalidCredentials() {
		return errorMsgForWrongCredentials.isDisplayed();
		
		
	}

	
}