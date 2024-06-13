package com.stesting.stest;

// import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
// import org.openqa.selenium.WebElement;
// import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
// import org.openqa.selenium.support.ui.ExpectedCondition;
// import org.openqa.selenium.support.ui.ExpectedConditions;
// import org.openqa.selenium.support.ui.WebDriverWait;



// import java.time.Duration;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");





//        System.out.println("Hello mother fuckers");

        System.setProperty("webdriver.chrome.driver", "D:\\DevSoftwares\\Selenium\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        // driver.get("https://www.selenium.dev/selenium/web/web-form.html");
        // driver.getTitle();
        // driver.manage().timeouts().implicitlyWait(Duration.ofMillis(500));
        // WebElement textBox = driver.findElement(By.name("my-text"));
        // WebElement submitButton = driver.findElement(By.cssSelector("button"));
        // textBox.sendKeys("Selenium");
        // submitButton.click();
        // WebElement message = driver.findElement(By.id("message"));
        // message.getText();
//        driver.quit();

        // driver.get("https://www.w3schools.com/html/tryit.asp?filename=tryhtml_form_text");
        driver.get("http://127.0.0.1:5501/src/com/stesting/stest/dummy.html");

        // Duration time = Duration.ofSeconds(50);
        // WebDriverWait wait = new WebDriverWait(driver, time);
        driver.findElement(By.id("fname")).sendKeys("Hello mother fuckers");
        driver.findElement(By.xpath("//*[@id=\"lname\"]")).sendKeys("Hello mother fuckers");

        // WebElement fName = wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("fname")));
        // fName.sendKeys("Hello mother fuckers");

    }
}


