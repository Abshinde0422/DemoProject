package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import utils.BaseClass;

public class MenuDrawerPage {
	 public MenuDrawerPage() {
	        PageFactory.initElements(BaseClass.driver, this);
	    }
	 
	 @FindBy(xpath="//button[text()='Open Menu']")
	 WebElement MenuDrawerIcon;
	 
	 @FindBy(id = "inventory_sidebar_link")
	 WebElement AllItemIcon;
	 
	 @FindBy(id = "inventory_sidebar_link")
	 WebElement ClickAllItem;
	 
	 @FindBy(xpath="//div[@class='product_label' and text()='Products']")
	 WebElement ProductPage;
	 
	 @FindBy(id = "logout_sidebar_link")
	 WebElement LogOutButton;
	 
	 @FindBy(id = "login-button")
	 WebElement loginButton;
	 
	 @FindBy(id = "about_sidebar_link")
	 WebElement AboutButton;
	

	public void clickOnMenuDrawer() throws InterruptedException {
		MenuDrawerIcon.click();	
		Thread.sleep(2000);
	}


	public boolean verifyAllItemButton() {
		return AllItemIcon.isDisplayed();
	}


	public void clickOnAllItem() {
		ClickAllItem.click();
		
	}


	public boolean verifyProductPage() {
		
		return ProductPage.isDisplayed();
	}


	public boolean verifyLogoutButton() {
		return LogOutButton.isDisplayed();
	}
	
	public void clickOnLogout() {
		LogOutButton.click();
	}


	public boolean verifyBackToLogin() {
		return loginButton.isDisplayed() ;
		}


	public boolean verifyPrsenceOfAboutButton() {
		return AboutButton.isDisplayed();
	}


	
	
}
