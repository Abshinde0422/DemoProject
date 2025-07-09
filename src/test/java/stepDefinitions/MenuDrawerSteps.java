package stepDefinitions;

import static org.testng.Assert.assertTrue;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import pages.MenuDrawerPage;

public class MenuDrawerSteps {
	MenuDrawerPage menuDrawerPage=new MenuDrawerPage();
	
	
	@And("User clicks on menu drawer icon")
	public void User_clicks_on_menu_drawer_icon() throws InterruptedException {
		menuDrawerPage.clickOnMenuDrawer();
	}
	
	@Then("Verify user can see All item button")
	public void Verify_user_can_see_All_item_button() {
		assertTrue(menuDrawerPage.verifyAllItemButton());
	}
	
	@And("User clicks on All item button")
	public void User_clicks_on_All_item_button() {
		menuDrawerPage.clickOnAllItem();
	}
	
	@Then("Verify user navigate back to products page")
	public void Verify_user_navigate_back_to_products_page() {
		assertTrue(menuDrawerPage.verifyProductPage());
	}
	
	@Then("Verify user can see Logout button")
	public void Verify_user_can_see_Logout_button() {
		assertTrue(menuDrawerPage.verifyLogoutButton());
	}
	@And("User clicks on Logout button")
	public void user_clicks_on_logout_button() {
	   menuDrawerPage.clickOnLogout();
	}

	@Then("Verify user navigate back to login page")
	public void verify_user_navigate_back_to_login_page() {
	    assertTrue(menuDrawerPage.verifyBackToLogin());
	}
	
	@Then("Verify user can see About button")
	public void Verify_user_can_see_About_button() {
		assertTrue(menuDrawerPage.verifyPrsenceOfAboutButton());
	}


}
