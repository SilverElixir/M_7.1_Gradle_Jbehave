package com.jbehave.gradle.task1;

import static org.junit.Assert.assertEquals;
import org.jbehave.core.annotations.*;
import org.jbehave.core.configuration.Configuration;
import org.jbehave.core.steps.BeforeOrAfterStep;
import org.jbehave.core.steps.StepCandidate;
import org.jbehave.core.steps.Steps;

import java.util.List;

public class SearchSteps extends Steps {

//    private final PageFactory pages;
    private BasicPage page;
    private SearchPage searchPage;

//    public SearchSteps(PageFactory pages) {
//        this.pages = pages;
//    }

    @BeforeScenario
    public void setupPages() {
//        searchPage = pages.initElements();
    }

    @AfterScenario
    public void closeBrowser() {
        page.driver.quit();
//        searchPage = pages.initElements();
    }

    public SearchSteps() {
        page = new BasicPage();
        searchPage = new SearchPage();
    }

    @Given("I am on Grishaverse Welcome page")
    public void openSearchPage() {
        page.openSearchPage().open();
    }

    @Given("popup with search results is shown: $value")
    public void checkShownPopup(String popup){
        searchPage.verifyShownPopup(popup);
    }

    @When("I click on Search button")
    public void clickButtonSearch() {
        searchPage.clickSearchButton();
    }

    @When("Enter text $value")
    public void setSearchParameters(String value) {
        searchPage.typeSearchParameters(value);
    }

    @When("I click on top item: $value")
    public void choose1stPopupSearchResult(String value){
        searchPage.choose1stPopupSearchResult(value);
    }

    @Then("pop-up $value appear")
    public void verifyPopupText(String value) {
        searchPage.verifyShownPopup(value);
    }

    @Then("$value wiki page is loaded")
    public void verifyURL()
    {
        assertEquals("https://thegrishaverse.fandom.com/wiki/The_Darkling",
                searchPage.verifyURL());
    }

    @Override
    public List<StepCandidate> listCandidates() {
        return null;
    }

    @Override
    public List<BeforeOrAfterStep> listBeforeOrAfterStories() {
        return null;
    }

    @Override
    public List<BeforeOrAfterStep> listBeforeOrAfterStory(boolean givenStory) {
        return null;
    }

    @Override
    public List<BeforeOrAfterStep> listBeforeOrAfterScenario(ScenarioType type) {
        return null;
    }

    @Override
    public Configuration configuration() {
        return null;
    }
}
