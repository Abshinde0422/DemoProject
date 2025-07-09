package stepDefinitions;

import io.cucumber.java.en.When;
import pages.CartPage;

public class CartSteps {
    CartPage cartPage = new CartPage();

    @When("User clicks on the cart icon")
    public void user_clicks_on_cart_icon() {
        cartPage.clickCart();
    }
}