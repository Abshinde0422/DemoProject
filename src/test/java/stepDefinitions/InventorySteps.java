package stepDefinitions;

import io.cucumber.java.en.Then;
import pages.InventoryPage;
import static org.junit.Assert.assertEquals;

public class InventorySteps {
    InventoryPage inventoryPage = new InventoryPage();

    @Then("User should see the product listing page with title {string}")
    public void user_should_see_inventory_page(String expectedTitle) {
        String actualTitle = inventoryPage.getPageTitle();
        assertEquals(expectedTitle, actualTitle);
    }
}