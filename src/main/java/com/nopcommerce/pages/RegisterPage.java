package com.nopcommerce.pages;

import com.nopcommerce.utility.Utility;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;

public class RegisterPage extends Utility {
    private static final Logger log = LogManager.getLogger(RegisterPage.class.getName());

    @CacheLookup
    @FindBy(xpath = "//h1[text()='Register']")
    WebElement checkRegisterText;
    @CacheLookup
    @FindBy(id = "gender-male")
    WebElement gender;
    @CacheLookup
    @FindBy(id = "FirstName")
    WebElement firstName;
    @CacheLookup
    @FindBy(id = "LastName")
    WebElement lastName;
    @CacheLookup
    @FindBy(name = "DateOfBirthDay")
    WebElement day;
    @CacheLookup
    @FindBy(name = "DateOfBirthMonth")
    WebElement month;
    @CacheLookup
    @FindBy(name = "DateOfBirthYear")
    WebElement year;
    @CacheLookup
    @FindBy(id = "Email")
    WebElement email;
    @CacheLookup
    @FindBy(id = "Password")
    WebElement password;
    @CacheLookup
    @FindBy(id = "ConfirmPassword")
    WebElement confirmPassword;
    @CacheLookup
    @FindBy(id = "register-button")
    WebElement registerButton;

    @CacheLookup
    @FindBy(xpath = "//div[text()='Your registration completed']")
    WebElement checkRegistrationText;
    @CacheLookup
    @FindBy(xpath = "//a[text()='Continue']")
    WebElement continueTab;


    public String verifyRegisterText() {
        log.info("Verify register text" + checkRegisterText.toString());
        return getTextFromElement(checkRegisterText);
    }

    public void mandatoryFields() {
        log.info("Click on gender" + gender.toString());
        clickOnElement(gender);
        log.info("Enter first name" + firstName.toString());
        sendTextToElement(firstName, "Abc");
        log.info("Enter last name" + lastName.toString());
        sendTextToElement(lastName, "Def");
        log.info("Select day" + day.toString());
        selectByVisibleTextFromDropDown(day, "2");
        log.info("Select month" + month.toString());
        selectByVisibleTextFromDropDown(month, "May");
        log.info("Select year" + year.toString());
        selectByVisibleTextFromDropDown(year, "1995");
        log.info("Enter email" + email.toString());
        sendTextToElement(email, getRandomString(5) + "@gmail.com");
        log.info("Enter password" + password.toString());
        sendTextToElement(password, "Abc@010");
        log.info("Enter confirm password" + confirmPassword.toString());
        sendTextToElement(confirmPassword, "Abc@010");
    }

    public void clickOnRegistrationButton() {
        log.info("Click on registration button" + registerButton.toString());
        clickOnElement(registerButton);
    }

    public String verifyRegistrationText() {
        log.info("Verify registration text" + checkRegistrationText.toString());
        return getTextFromElement(checkRegistrationText);
    }

    public void clickOnContinueTab() {
        log.info("Click on continue tab" + continueTab.toString());
        clickOnElement(continueTab);
    }
}
