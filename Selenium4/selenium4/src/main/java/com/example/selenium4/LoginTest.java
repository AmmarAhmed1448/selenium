package com.example.selenium4;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
// import com.aventstack.extentreports.reporter.ExtentHtmlReporter;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

import org.junit.*;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginTest {

    private WebDriver driver;
    private static ExtentReports extent;
    private ExtentTest test;

    // @Before
    // public void setUp() {
    //     System.setProperty("webdriver.chrome.driver",
    //             "D:\\DevSoftwares\\Selenium\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
    //     driver = new ChromeDriver();

    //     // Initialize ExtentReports
    //     // ExtentHtmlReporter htmlReporter = new
    //     // ExtentHtmlReporter("test-output/LoginTestReport.html");
    //     ExtentSparkReporter htmlReporter = new ExtentSparkReporter("test-output/LoginTestReport.html");
    //     extent = new ExtentReports();
    //     extent.attachReporter(htmlReporter);
    // }

    @BeforeClass
    public static void setUpBeforeClass() {
        System.setProperty("webdriver.chrome.driver",
                "D:\\DevSoftwares\\Selenium\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");

        // Initialize ExtentReports only once before all tests
        ExtentSparkReporter htmlReporter = new ExtentSparkReporter("test-output/LoginTestReport.html");
        extent = new ExtentReports();
        extent.attachReporter(htmlReporter);
    }

    @Before
    public void setUp() {
        driver = new ChromeDriver();
    }

    @Test
    public void testValidCredentials() {
        test = extent.createTest("Login_SL_01", "Test with valid credentials");

        driver.get("https://www.saucedemo.com/v1/");
        // Enter valid credentials
        driver.findElement(By.id("user-name")).sendKeys("standard_user");
        driver.findElement(By.id("password")).sendKeys("secret_sauce");
        driver.findElement(By.id("login-button")).click();

        // Verify login success
        String actualOutcome = driver.getCurrentUrl();
        String expectedOutcome = "https://www.saucedemo.com/v1/inventory.html";
        Assert.assertEquals(expectedOutcome, actualOutcome);
        test.log(Status.PASS, "Log in successful");
    }

    @Test
    public void testNonRegisteredUsername() {
        test = extent.createTest("Login_SL_02", "Test with non-registered username");

        driver.get("https://www.saucedemo.com/v1/");
        // Enter non-registered username and a password
        driver.findElement(By.id("user-name")).sendKeys("Ammar_Ahmed");
        driver.findElement(By.id("password")).sendKeys("ammar123");
        driver.findElement(By.id("login-button")).click();

        // Verify error message
        // Find the <h3> element by its data-test attribute
        WebElement h3Element = driver.findElement(By.cssSelector("h3[data-test='error']"));

        Assert.assertEquals("Epic sadface: Username and password do not match any user in this service",
                h3Element.getText());
        test.log(Status.PASS, "Error message displayed: " + h3Element.getText());
    }

    @Test
    public void testIncorrectPassword() {
        // Similar structure for other test cases
        test = extent.createTest("Login_SL_03", "Test with incorrect password");

        driver.get("https://www.saucedemo.com/v1/");
        // Enter valid username with incorrect password
        driver.findElement(By.id("user-name")).sendKeys("standard_user");
        driver.findElement(By.id("password")).sendKeys("ammar123");
        driver.findElement(By.id("login-button")).click();

        // Verify error message
        // Find the <h3> element by its data-test attribute
        WebElement h3Element = driver.findElement(By.cssSelector("h3[data-test='error']"));

        Assert.assertEquals("Epic sadface: Username and password do not match any user in this service",
                h3Element.getText());
        test.log(Status.PASS, "Error message displayed: " + h3Element.getText());
    }

    @Test
    public void testEmptyUsernameField() {
        // Similar structure for other test cases
        test = extent.createTest("Login_SL_04", "Test with empty username field");

        driver.get("https://www.saucedemo.com/v1/");
        // Leave username field empty and enter password
        driver.findElement(By.id("password")).sendKeys("ammar123");
        driver.findElement(By.id("login-button")).click();

        // Verify error message
        // Find the <h3> element by its data-test attribute
        WebElement h3Element = driver.findElement(By.cssSelector("h3[data-test='error']"));
        Assert.assertEquals("Epic sadface: Username is required", h3Element.getText());
        test.log(Status.PASS, "Error message displayed: " + h3Element.getText());
    }

    @Test
    public void testEmptyPasswordField() {
        // Similar structure for other test cases
        test = extent.createTest("Login_SL_05", "Test with empty password field");

        driver.get("https://www.saucedemo.com/v1/");
        // Leave password field empty and enter username
        driver.findElement(By.id("user-name")).sendKeys("standard_user");
        driver.findElement(By.id("login-button")).click();

        // Verify error message
        // Find the <h3> element by its data-test attribute
        WebElement h3Element = driver.findElement(By.cssSelector("h3[data-test='error']"));
        Assert.assertEquals("Epic sadface: Password is required", h3Element.getText());
        test.log(Status.PASS, "Error message displayed: " + h3Element.getText());
    }

    @Test
    public void testAllEmptyFields() {
        // Similar structure for other test cases
        test = extent.createTest("Login_SL_06", "Test with all empty fields");

        driver.get("https://www.saucedemo.com/v1/");
        // Leave both fields empty
        driver.findElement(By.id("login-button")).click();

        // Verify error message
        // Find the <h3> element by its data-test attribute
        WebElement h3Element = driver.findElement(By.cssSelector("h3[data-test='error']"));
        Assert.assertEquals("Epic sadface: Username is required", h3Element.getText());
        test.log(Status.PASS, "Error message displayed: " + h3Element.getText());
    }

    // @After
    // public void tearDown() {
    //     if (driver != null) {
    //         driver.quit();
    //     }
    //     extent.flush();
    // }

    @After
    public void tearDown() {
        if (driver != null) {
            driver.quit();
        }
    }

    @AfterClass
    public static void tearDownAfterClass() {
        // Flush the ExtentReports instance after all tests are executed
        if (extent != null) {
            extent.flush();
        }
    }
}
