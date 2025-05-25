package com.zaidan.testng.utils;

import java.time.Duration;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import java.util.HashMap;
import io.github.bonigarcia.wdm.WebDriverManager;

public class HelperClass {

    private static HelperClass helperClass;

    private static WebDriver driver;
    public final static int TIMEOUT = 10;

    private HelperClass() {

        WebDriverManager.chromedriver().setup();

        ChromeOptions options = new ChromeOptions();
        // Gunakan profile baru yang kosong (temporary)
        options.addArguments("user-data-dir=C:/temp/chrome-profile-zaidan");
        options.addArguments("--no-first-run");
        options.addArguments("--disable-save-password-bubble");
        options.setExperimentalOption("prefs", new HashMap<String, Object>() {{
            put("credentials_enable_service", false);
            put("profile.password_manager_enabled", false);
        }});

        driver = new ChromeDriver(options);
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(TIMEOUT));
        driver.manage().window().maximize();
    }

    public static void openPage(String url) {
        driver.get(url);
    }

    public static WebDriver getDriver() {
        return driver;

    }

    public static void setUpDriver() {

        if (helperClass == null) {

            helperClass = new HelperClass();
        }
    }

    public static void tearDown() {

        if (driver != null) {
            driver.close();
            driver.quit();
        }

        helperClass = null;

    }

}