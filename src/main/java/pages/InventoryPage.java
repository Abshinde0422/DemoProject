package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utils.BaseClass;

public class InventoryPage {
    public InventoryPage() {
        PageFactory.initElements(BaseClass.driver, this);
    }

    @FindBy(className = "title")
    WebElement title;

    public String getPageTitle() {
        return title.getText();
    }
}