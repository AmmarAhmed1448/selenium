package com.example.selenium4;
import org.junit.runner.JUnitCore;
import org.junit.runner.Result;
import org.junit.runner.notification.Failure;

public class Main {
    public static void main(String[] args) {
        // Run the LoginTest class
        Result result = JUnitCore.runClasses(LoginTest.class);

        // Check if there are any test failures
        if (result.getFailureCount() > 0) {
            System.out.println("Test execution failed:");
            for (Failure failure : result.getFailures()) {
                System.out.println(failure.toString());
            }
        } else {
            System.out.println("All tests passed successfully!");
        }
    }
}
