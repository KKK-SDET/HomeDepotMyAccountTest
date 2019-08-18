package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import utils.Waits;


public class HomePage {

    WebDriver driver;
    WebDriverWait wait;



    public HomePage(WebDriver driver) {
        PageFactory.initElements(driver, this);
        wait = new WebDriverWait(driver, 4);
    }

    @FindBy(id = "headerMyAccount")
    public WebElement myAccountButton;

    @FindBy(xpath = "//span[text()='Register']")
    private WebElement registerButton;

    @FindBy(xpath = "//span[text()=' Sign in ']/..")
    private WebElement signInButton;

    @FindBy(xpath = "(//input[@id='email_id'])[1]")
    private WebElement emailSignIn;

    @FindBy(xpath = "//input[@id='password']")
    private WebElement passwordSignIn;

    @FindBy(id = "accountSignIn")
    private WebElement signIn;

    @FindBy(xpath = "//a[text()='My Credit Card Account']")
    private WebElement creditCardButton;

    @FindBy(xpath = "(//input[@id='email_id'])[2]")
    private WebElement emailBox;

    @FindBy(id = "registrationPassword")
    private WebElement passwordBox;

    @FindBy(id = "zipcode")
    private WebElement zipCodeBox;

    @FindBy(id = "phoneNumber")
    private WebElement phoneNumberBox;

    @FindBy(xpath = "//button[@id='accountRegister']")
    private WebElement createAccountButton;

    public void clickMyAccountAndRegistrationBtn() throws InterruptedException {
        myAccountButton.click();
        Thread.sleep(2000);
        registerButton.click();
    }

    public void clickMyAccountButton(){
        myAccountButton.click();
    }

    public void clickSignIn(String email, String password) throws InterruptedException {
        signInButton.click();
        emailSignIn.sendKeys(email);
        passwordSignIn.sendKeys(password);
        signIn.click();
        Thread.sleep(3000);
        myAccountButton.click();
        creditCardButton.click();
        Thread.sleep(3000);
    }

    public void enterDataAccountCreation(String string, String string2) throws InterruptedException {
        Thread.sleep(2000);
        emailBox.sendKeys(string);
        passwordBox.click();
        Thread.sleep(2000);
        passwordBox.sendKeys(string2);
    }

    public void enterZipPhoneData(String zip, String phone) {

        zipCodeBox.sendKeys(zip);
        phoneNumberBox.sendKeys(phone);
    }

    public void clickCreateAccount() {
        createAccountButton.click();
    }

}
