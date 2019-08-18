package steps;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.*;
import org.testng.Assert;
import pages.HomePage;
import utils.Driver;
import utils.Waits;
import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

public class MyAccountRegistration {

    WebDriver driver;
    HomePage homePage;

    {
        driver = Driver.getMyCurrentDriver();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.manage().window().maximize();
        homePage = new HomePage(driver);
    }

    @Given("Home Depot web-site is up and running and MyAccount icon is displayed")
    public void home_Depot_web_site_is_up_and_running_and_MyAccount_icon_is_displayed() throws IOException {
        driver.get("http://homedepot.com");
        String dir = "/Users/kumarbekchaldanbaev/Desktop/screenshots";
        String fileName = "verificationIMG.png";
        File screenshotTaker = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
        FileUtils.copyFile(screenshotTaker, new File(dir, fileName));
        Assert.assertTrue(homePage.myAccountButton.isDisplayed(), "MyAccount Button is not displayed");
        System.out.println("Is MyAccountButton is displayed: " + homePage.myAccountButton.isDisplayed());
    }

    @When("user navigates to My Account and Registration sections")
    public void user_navigates_to_My_Account_and_Registration_sections() throws InterruptedException {
        homePage.clickMyAccountAndRegistrationBtn();
    }

    @When("user enters valid but a reserved email {string} and password {string}")
    public void user_enters_valid_but_a_reserved_email_and_password(String string, String string2) throws InterruptedException {

        homePage.enterDataAccountCreation(string, string2);

        WebElement actualErrorMessage = driver.findElement(By.xpath("//span[text()='This email has already been registered.']"));
        Waits.waitUntilVisible(driver, actualErrorMessage);

        String actualMessage = actualErrorMessage.getText();
        System.out.println("Text of error message is: " + actualMessage);
        String expectedErrorMessage = "This email has already been registered.";

        Assert.assertEquals(expectedErrorMessage, actualMessage, "You are entering unregistered email");
    }

    @When("user enters valid zipcode {string} and phone number {string}")
    public void user_enters_valid_zipcode_and_phone_number(String string, String string2) {

        homePage.enterZipPhoneData(string, string2);

    }

    @Then("check CreateAccount button status")
    public void check_CreateAccount_button_status() {

        WebElement createAccountButton = driver.findElement(By.xpath("//button[@id='accountRegister']"));
        System.out.println("CreateAccountButton is enabled?: " + createAccountButton.isEnabled());

        Assert.assertFalse(createAccountButton.isEnabled(), "CreateAccount Button is enabled");
    }

}


