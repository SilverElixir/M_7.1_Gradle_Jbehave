package com.jbehave.gradle.task1;

import io.github.bonigarcia.wdm.WebDriverManager;
import io.github.bonigarcia.wdm.managers.ChromeDriverManager;
import org.junit.After;
import org.junit.Before;
import org.junit.BeforeClass;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BasicPage {

    protected WebDriver driver;

    public BasicPage(){
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
    }

    public SearchPage openSearchPage(){
        return new SearchPage();
    }

//    @BeforeClass
    public static void setupClass() {
        WebDriverManager.chromedriver().setup();
    }

//    @Before
    public void setupTest() {
        driver = new ChromeDriver();
    }

//    @After
    public void teardown() {
        if (driver != null) {
            driver.quit();
        }
    }

}
