package org.example;

import com.aventstack.extentreports.ExtentTest;
import org.openqa.selenium.WebElement;


public class TestCases {
    static void testFirstName(WebElement firstNameInput, ExtentTest test) {
        // Test Case 1: Valid first name
        firstNameInput.sendKeys("John");
        String firstNameValue = firstNameInput.getAttribute("value");
        if (firstNameValue.equals("John")) {
            test.pass("Valid first name entered successfully");
        } else {
            test.fail("Valid first name not entered");
        }

        // Test Case 2: First name with special characters
        firstNameInput.clear();
        firstNameInput.sendKeys("John@Doe");
        String firstNameSpecialChars = firstNameInput.getAttribute("value");
        if (firstNameSpecialChars.equals("John@Doe")) {
            test.pass("First name with special characters entered successfully");
        } else {
            test.fail("First name with special characters not entered");
        }

        // Test Case 3: First name with numbers
        firstNameInput.clear();
        firstNameInput.sendKeys("John123");
        String firstNameNumbers = firstNameInput.getAttribute("value");
        if (firstNameNumbers.equals("John123")) {
            test.pass("First name with numbers entered successfully");
        } else {
            test.fail("First name with numbers not entered");
        }

        // Test Case 4: First name with whitespace characters only
        firstNameInput.clear();
        firstNameInput.sendKeys("   ");
        String firstNameWhitespace = firstNameInput.getAttribute("value");
        if (firstNameWhitespace.isEmpty()) {
            test.pass("First name with whitespace characters only entered successfully");
        } else {
            test.fail("First name with whitespace characters only not entered");
        }

        // Test Case 5: Empty first name
        firstNameInput.clear();
        String firstNameEmpty = firstNameInput.getAttribute("value");
        if (firstNameEmpty.isEmpty()) {
            test.pass("Empty first name field tested successfully");
        } else {
            test.fail("Empty first name field not detected");
        }
    }


    static void testLastName(WebElement lastNameInput, ExtentTest test) {
        // Test Case 1: Valid last name
        lastNameInput.sendKeys("Doe");
        String lastNameValue = lastNameInput.getAttribute("value");
        if (lastNameValue.equals("Doe")) {
            test.pass("Valid last name entered successfully");
        } else {
            test.fail("Valid last name not entered");
        }

        // Test Case 2: Last name with special characters
        lastNameInput.clear();
        lastNameInput.sendKeys("Doe@Smith");
        String lastNameSpecialChars = lastNameInput.getAttribute("value");
        if (lastNameSpecialChars.equals("Doe@Smith")) {
            test.pass("Last name with special characters entered successfully");
        } else {
            test.fail("Last name with special characters not entered");
        }

        // Test Case 3: Last name with numbers
        lastNameInput.clear();
        lastNameInput.sendKeys("Doe123");
        String lastNameNumbers = lastNameInput.getAttribute("value");
        if (lastNameNumbers.equals("Doe123")) {
            test.pass("Last name with numbers entered successfully");
        } else {
            test.fail("Last name with numbers not entered");
        }

        // Test Case 4: Last name with whitespace characters only
        lastNameInput.clear();
        lastNameInput.sendKeys("   ");
        String lastNameWhitespace = lastNameInput.getAttribute("value");
        if (lastNameWhitespace.isEmpty()) {
            test.pass("Last name with whitespace characters only entered successfully");
        } else {
            test.fail("Last name with whitespace characters only not entered");
        }

        // Test Case 5: Empty last name
        lastNameInput.clear();
        String lastNameEmpty = lastNameInput.getAttribute("value");
        if (lastNameEmpty.isEmpty()) {
            test.pass("Empty last name field tested successfully");
        } else {
            test.fail("Empty last name field not detected");
        }
    }

    static void testEmail(WebElement emailInput, ExtentTest test) {
        // Test Case 1: Valid email
        emailInput.sendKeys("john.doe@example.com");
        String emailValue = emailInput.getAttribute("value");
        if (emailValue.equals("john.doe@example.com")) {
            test.pass("Valid email entered successfully");
        } else {
            test.fail("Valid email not entered");
        }

        // Test Case 2: Invalid email
        emailInput.clear();
        emailInput.sendKeys("invalid_email");
        String invalidEmailValue = emailInput.getAttribute("value");
        if (invalidEmailValue.isEmpty()) {
            test.pass("Invalid email field tested successfully");
        } else {
            test.fail("Invalid email field not detected");
        }
    }

    static void testGender(WebElement maleRadioButton, WebElement femaleRadioButton, ExtentTest test) {
        // Test Case 1: Select Male
        maleRadioButton.click();
        if (maleRadioButton.isSelected()) {
            test.pass("Male gender selected successfully");
        } else {
            test.fail("Male gender not selected");
        }

        // Test Case 2: Select Female
        femaleRadioButton.click();
        if (femaleRadioButton.isSelected()) {
            test.pass("Female gender selected successfully");
        } else {
            test.fail("Female gender not selected");
        }
    }

    static void testPhoneNumber(WebElement phoneNumberInput, ExtentTest test) {
        // Test Case 1: Valid phone number
        phoneNumberInput.sendKeys("1234567890");
        String phoneNumberValue = phoneNumberInput.getAttribute("value");
        if (phoneNumberValue.equals("1234567890")) {
            test.pass("Valid phone number entered successfully");
        } else {
            test.fail("Valid phone number not entered");
        }

        // Test Case 2: Phone number with letters
        phoneNumberInput.clear();
        phoneNumberInput.sendKeys("123abc");
        String phoneNumberLetters = phoneNumberInput.getAttribute("value");
        if (phoneNumberLetters.isEmpty()) {
            test.pass("Phone number with letters field tested successfully");
        } else {
            test.fail("Phone number with letters field not detected");
        }
    }

    static void testPassword(WebElement passwordInput, ExtentTest test) {
        // Test Case 1: Valid password
        passwordInput.sendKeys("Password123");
        String passwordValue = passwordInput.getAttribute("value");
        if (passwordValue.equals("Password123")) {
            test.pass("Valid password entered successfully");
        } else {
            test.fail("Valid password not entered");
        }

        // Test Case 2: Short password
        passwordInput.clear();
        passwordInput.sendKeys("abc");
        String shortPasswordValue = passwordInput.getAttribute("value");
        if (shortPasswordValue.isEmpty()) {
            test.pass("Short password field tested successfully");
        } else {
            test.fail("Short password field not detected");
        }
    }

}
