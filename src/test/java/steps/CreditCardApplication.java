package steps;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import pages.CreditCardApplicationForm;
import pages.CreditCardCenter;
import pages.HomePage;
import utils.Driver;

import java.awt.*;
import java.io.File;
import java.io.IOException;
import java.util.Arrays;

public class CreditCardApplication {

    WebDriver driver;
    HomePage homePage;
    CreditCardCenter creditCardCenter;
    CreditCardApplicationForm creditCardApplicationForm;
    JavascriptExecutor js;


    {
        driver = Driver.getMyCurrentDriver();
        driver.manage().window().maximize();
        homePage = new HomePage(driver);
        creditCardCenter = new CreditCardCenter(driver);
        creditCardApplicationForm = new CreditCardApplicationForm(driver);
        js = (JavascriptExecutor) driver;
    }

    @When("user navigates to My Account")
    public void user_navigates_to_My_Account() throws InterruptedException {
        homePage.clickMyAccountButton();
    }

    @When("user signs in with valid email {string} and password {string}")
    public void user_signs_in_with_valid_email_and_password(String email, String password) throws InterruptedException {
        homePage.clickSignIn(email, password);
    }

    @And("user selects Exclusive Consumer Credit Card Offers")
    public void user_selects_Exclusive_Consumer_Credit_Card_Offers() {
        js.executeScript("window.scrollBy(0, 300);");
        creditCardCenter.applyingToCreditCard();
    }

    @And("user enters first name {string}, last name {string} and email {string}")
    public void user_enters_first_name_last_name_and_email(String firstName, String lastName, String email) throws AWTException, InterruptedException {
        js.executeScript("window.scrollBy(0, 300);");
        creditCardApplicationForm.enterPersonalInfo(firstName, lastName, email);
        js.executeScript("window.scrollBy(0, 500);");
    }

    @When("user enters address {string}, city {string}, selects state, enters zipcode {string} and phonenumber {string}")
    public void user_enters_address_city_selects_state_enters_zipcode_and_phonenumber(String address, String city, String zipcode, String phoneNumber) throws InterruptedException {

        Thread.sleep(5000);
        creditCardApplicationForm.enterResidenceInfo(address, city, zipcode, phoneNumber);

    }

    @And("user enters rent payment {string}, residence status and annual income {string}")
    public void user_enters_rent_payment_residence_status_and_annual_income(String rentSum, String income) throws InterruptedException {
        Thread.sleep(3000);
        js.executeScript("window.scrollBy(0, 200);");
        Thread.sleep(3000);
        creditCardApplicationForm.enterFinancialInfo(rentSum, income);
    }

    @And("user enters SSN {string} and birthDate {string}")
    public void user_enters_SSN_and_birthDate(String ssn, String birthDate) throws InterruptedException {
        js.executeScript("window.scrollBy(0, 200);");
        Thread.sleep(3000);
        creditCardApplicationForm.enterSsn_and_DOB(ssn, birthDate);
        js.executeScript("window.scrollBy(0, 600);");
    }

    @Then("user submits application")
    public void user_submits_application() throws InterruptedException, IOException {
        js.executeScript("window.scrollBy(0, 600);");
        Thread.sleep(3000);
        creditCardApplicationForm.completingRegistration();
        Thread.sleep(4000);
        String fileName = "finalPageVerification";
        String dir = "/Users/kumarbekchaldanbaev/Desktop/screenshots";
        File screenShot = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
        FileUtils.copyFile(screenShot, new File(dir, fileName));

    }


}


