package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import java.util.Random;

public class CreditCardApplicationForm {

    WebDriver driver;

    public CreditCardApplicationForm(WebDriver driver) {
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "//input[@name='apply_firstname']")
    private WebElement inputFirstName;

    @FindBy(id = "apply_lastname")
    private WebElement lastName;

    @FindBy(xpath = "//div[@class=\"emailAccordian\"]")
    private WebElement emailBox;

    @FindBy(id = "apply_email")
    private WebElement email1;

    @FindBy(xpath = "//div[@class=\"addressAccordian\"]")
    private WebElement addressBox;

    @FindBy(id = "apply_address")
    private WebElement address;

    @FindBy(id = "apply_apt")
    private WebElement appt;

    @FindBy(id = "apply_city")
    private WebElement city;

    @FindBy(id = "apply_state")
    private WebElement state;

    @FindBy(id = "apply_zipcode")
    private WebElement zipCode;

    @FindBy(xpath = "//div[@class=\"phoneAccordian\"]")
    private WebElement phoneBox;

    @FindBy(id = "apply_phone")
    private WebElement phoneNumber;

    @FindBy(xpath = "//div[@class=\"financialInfoAccordian\"]")
    private WebElement financialInfoBox;

    @FindBy(id = "apply_monthlymortgage")
    private WebElement rentPayment;

    @FindBy(id = "apply_residencestatus")
    private WebElement residenceStatus;

    @FindBy(xpath = "//input[@id='apply_annualincome']")
    private WebElement netIncome;

    @FindBy(xpath = "//div[@class=\"ssnAccordian\"]")
    private WebElement ssnBox;

    @FindBy(id = "apply_ssn")
    private WebElement ssn;

    @FindBy(xpath = "//div[@class=\"dobAccordian\"]")
    private WebElement dobBox;

    @FindBy(id = "apply_dob")
    private WebElement dob;

    @FindBy(xpath = "//div[@class=\"customCheckbox\"]")
    private WebElement checkBox;

    @FindBy(id = "apply_submit")
    private WebElement submitForm;

    public void enterPersonalInfo(String firstName, String surName, String email) throws InterruptedException {
        Thread.sleep(3000);
        inputFirstName.click();
        Thread.sleep(3000);
        inputFirstName.sendKeys(firstName);

        Thread.sleep(3000);
        lastName.click();
        lastName.sendKeys(surName);

        emailBox.click();

        Thread.sleep(3000);
        email1.click();
        email1.sendKeys(email);
    }

    public void enterResidenceInfo(String streetAddress, String cityName, String zipcode, String phoneNum) throws InterruptedException {
        Thread.sleep(3000);

        addressBox.click();

        Thread.sleep(2000);
        address.click();
        address.sendKeys(streetAddress);
        appt.click();

        Thread.sleep(3000);
        city.click();
        city.sendKeys(cityName);


        Thread.sleep(3000);
        Select selectState = new Select(state);
        selectState.selectByVisibleText("IL");

        Thread.sleep(3000);
        zipCode.click();
        zipCode.sendKeys(zipcode);

        Thread.sleep(3000);
        phoneBox.click();
        phoneNumber.sendKeys(phoneNum);

        Thread.sleep(3000);
    }

    public void enterFinancialInfo(String rent, String income) throws InterruptedException {

        financialInfoBox.click();
        rentPayment.sendKeys(rent);

        Thread.sleep(3000);
        Select selectResidenceStatus = new Select(residenceStatus);
        selectResidenceStatus.selectByVisibleText("Rent");
        Thread.sleep(3000);
        netIncome.sendKeys(income);
        Thread.sleep(3000);
    }

    public void enterSsn_and_DOB(String ssnNum, String birthDate) throws InterruptedException {

        Random random = new Random();
        Integer randSSN = random.nextInt(1000000000);
        ssnNum = randSSN.toString();
        ssnBox.click();
        Thread.sleep(3000);
        ssn.sendKeys(ssnNum);

        Thread.sleep(3000);
        dobBox.click();
        dob.sendKeys(birthDate);

        Thread.sleep(3000);
    }

    public void completingRegistration() throws InterruptedException {


        checkBox.click();
        Thread.sleep(10000);
        submitForm.click();

    }
}
