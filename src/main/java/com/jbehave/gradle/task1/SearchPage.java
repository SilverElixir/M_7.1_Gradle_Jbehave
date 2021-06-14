package com.jbehave.gradle.task1;

import org.openqa.selenium.By;

public class SearchPage extends BasicPage {

    public void open() {
        driver.get("https://thegrishaverse.fandom.com/wiki/Grishaverse_Wiki");
    }

    public void clickSearchButton() {
        driver.findElement(By.className("wds-global-navigation__search-toggle")).click();
    }

    public void typeSearchParameters(String value) {
        driver.findElement(By.name("query")).sendKeys(value);
    }

    public void verifyShownPopup(String popup) {
        driver.findElement(By.cssSelector("[id^='Autocomplete'] > li[title='" + popup + "']"));
    }

    public String verifyURL() {
          return driver.getCurrentUrl();
    }

    public void choose1stPopupSearchResult(String item) {
        driver.findElement(By.cssSelector("[id^='Autocomplete'] > li[title='" + item + "']")).click();
    }
}
