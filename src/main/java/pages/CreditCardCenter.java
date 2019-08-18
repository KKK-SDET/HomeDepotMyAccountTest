package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import utils.Waits;

public class CreditCardCenter {
    WebDriver driver;

    public CreditCardCenter(WebDriver driver) {
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "//a[@href=\"#credit_offers\"]")
    private WebElement creditOffers;

    @FindBy(xpath = "(//span[contains(text(),'Apply Now')])[3]")
    private WebElement creditCardType;


    public void applyingToCreditCard() {
        creditOffers.click();
        creditCardType.click();
    }


}
