package org.example;
//
//
//
//
//import com.aventstack.extentreports.ExtentReports;
//import com.aventstack.extentreports.ExtentTest;
////import com.aventstack.extentreports.reporter.ExtentHtmlReporter;
//import com.aventstack.extentreports.reporter.ExtentSparkReporter;
//import org.openqa.selenium.By;
//import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.WebElement;
//import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.support.ui.ExpectedConditions;
//import org.openqa.selenium.support.ui.WebDriverWait;
//
//import java.time.Duration;
//
//public class Main {
//    public static void main(String[] args) {
//        // Set up ExtentReports
////        ExtentHtmlReporter htmlReporter = new ExtentHtmlReporter("test-report.html");
//        ExtentSparkReporter htmlReporter = new ExtentSparkReporter("D:\\Ammar\\HTML Coursera\\React\\Selenium 3\\src\\test\\java\\TestResults.html");
//        ExtentReports extent = new ExtentReports();
//        extent.attachReporter(htmlReporter);
//
//        // Create a test in the report
//        ExtentTest test = extent.createTest("Test Form Submission", "Test the submission of the HTML form");
//
//        // Set the path to ChromeDriver executable
//        System.setProperty("webdriver.chrome.driver", "D:\\DevSoftwares\\Selenium\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
//
//        // Initialize ChromeDriver
//        WebDriver driver = new ChromeDriver();
//
//        // Open the HTML form in the browser
//        driver.get("http://127.0.0.1:5501/src/main/java/org/example/testhtml.html");
//
//        // Find form elements
//        WebElement firstNameInput = driver.findElement(By.id("firstName"));
//        WebElement lastNameInput = driver.findElement(By.id("lastName"));
//        WebElement emailInput = driver.findElement(By.id("email"));
//        WebElement maleRadioButton = driver.findElement(By.id("male"));
////        WebElement femaleRadioButton = driver.findElement(By.id("female"));
////        WebElement fileInput = driver.findElement(By.id("file"));
//        WebElement submitButton = driver.findElement(By.cssSelector("button[type='submit']"));
//
//        // Fill form fields
//        firstNameInput.sendKeys("John");
//        lastNameInput.sendKeys("Doe");
//        emailInput.sendKeys("john.doe@example.com");
//        maleRadioButton.click();
//        // Upload a file (replace with your file path)
////        fileInput.sendKeys("D:\\Ammar\\HTML Coursera\\React\\Selenium 3\\src\\main\\java\\org\\example\\test.txt");
//
//        // Submit the form
//        submitButton.click();
//
//        // Wait for the form submission (replace with appropriate conditions)
//        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
//        wait.until(ExpectedConditions.urlContains("/submit"));
//
//        // Verify submission success (replace with appropriate assertions)
//        String currentUrl = driver.getCurrentUrl();
//        if (currentUrl.contains("/submit")) {
//            test.pass("Form submitted successfully!");
//        } else {
//            test.fail("Form submission failed!");
//        }
//
//        // Close the browser
////        driver.quit();
//
//        // Mark the test as completed
//        extent.flush();
//    }
//}


import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.support.ui.ExpectedConditions;
//import org.openqa.selenium.support.ui.WebDriverWait;

//import java.time.Duration;
//import org.openqa.selenium.support.ui.ExpectedConditions;
//import org.openqa.selenium.support.ui.WebDriverWait;
//
//import java.time.Duration;

//import org.example.TestCases;




public class Main {
    public static void main(String[] args) {
        // Set up ExtentReports
        ExtentSparkReporter htmlReporter = new ExtentSparkReporter("TestResults.html");
        ExtentReports extent = new ExtentReports();
        extent.attachReporter(htmlReporter);

        // Create a test in the report
        ExtentTest test = extent.createTest("Test Form Submission", "Test the submission of the HTML form");

        // Set the path to ChromeDriver executable
        System.setProperty("webdriver.chrome.driver", "D:\\DevSoftwares\\Selenium\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");

        // Initialize ChromeDriver
        WebDriver driver = new ChromeDriver();

        // Open the HTML form in the browser
        driver.get("http://127.0.0.1:5501/src/main/java/org/example/testhtml.html");

        // Find form elements
        WebElement firstNameInput = driver.findElement(By.id("firstName"));
        WebElement lastNameInput = driver.findElement(By.id("lastName"));
        WebElement emailInput = driver.findElement(By.id("email"));
        WebElement maleRadioButton = driver.findElement(By.id("male"));
        WebElement femaleRadioButton = driver.findElement(By.id("female"));
        WebElement phoneNumberInput = driver.findElement(By.id("phoneNumber"));
        WebElement passwordInput = driver.findElement(By.id("password"));
        WebElement submitButton = driver.findElement(By.cssSelector("button[type='submit']"));


        // Test Case 1: Valid first name
        firstNameInput.sendKeys("John");
        String firstNameValue = firstNameInput.getAttribute("value");
        if (firstNameValue.equals("John")) {
            test.pass("Valid first name entered successfully");
        } else {
            test.fail("Valid first name not entered");
        }

//        // Test Case 2: First name with special characters
//        firstNameInput.clear();
//        firstNameInput.sendKeys("John@Doe");
//        String firstNameSpecialChars = firstNameInput.getAttribute("value");
//        if (firstNameSpecialChars.equals("John@Doe")) {
//            test.pass("First name with special characters entered successfully");
//        } else {
//            test.fail("First name with special characters not entered");
//        }
//
//        // Test Case 3: First name with numbers
//        firstNameInput.clear();
//        firstNameInput.sendKeys("John123");
//        String firstNameNumbers = firstNameInput.getAttribute("value");
//        if (firstNameNumbers.equals("John123")) {
//            test.pass("First name with numbers entered successfully");
//        } else {
//            test.fail("First name with numbers not entered");
//        }
//
//        // Test Case 4: First name with whitespace characters only
//        firstNameInput.clear();
//        firstNameInput.sendKeys("   ");
//        String firstNameWhitespace = firstNameInput.getAttribute("value");
//        if (firstNameWhitespace.isEmpty()) {
//            test.pass("First name with whitespace characters only entered successfully");
//        } else {
//            test.fail("First name with whitespace characters only not entered");
//        }
//
//        // Test Case 5: Empty first name
//        firstNameInput.clear();
//        String firstNameEmpty = firstNameInput.getAttribute("value");
//        if (firstNameEmpty.isEmpty()) {
//            test.pass("Empty first name field tested successfully");
//        } else {
//            test.fail("Empty first name field not detected");
//        }


//        Duration duration = Duration.ofSeconds(10);
//        WebDriverWait wait = new WebDriverWait(driver, duration);
//        WebElement firstNameInput = wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("firstName")));
//        WebElement lastNameInput = wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("lastName")));
//        WebElement emailInput = wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("email")));
//        WebElement maleRadioButton = wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("male")));
//        WebElement femaleRadioButton = wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("female")));
//        WebElement phoneNumberInput = wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("phoneNumber")));
//        WebElement passwordInput = wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("password")));
//        WebElement submitButton = wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector("button[type='submit']")));

        // Test Cases for First Name
//        TestCases.testFirstName(firstNameInput, test);
//
//        // Test Cases for Last Name
//        TestCases.testLastName(lastNameInput, test);
//
//        // Test Cases for Email
//        TestCases.testEmail(emailInput, test);
//
//        // Test Cases for Gender
//        TestCases.testGender(maleRadioButton, femaleRadioButton, test);
//
//        // Test Cases for Phone Number
//        TestCases.testPhoneNumber(phoneNumberInput, test);
//
//        // Test Cases for Password
//        TestCases.testPassword(passwordInput, test);

        // Close the browser
//        driver.quit();

        // Mark the test as completed
        extent.flush();
    }}
