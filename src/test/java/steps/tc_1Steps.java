package steps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import pages.tc_1Page;

import static org.junit.Assert.assertEquals;

public class tc_1Steps {
    WebDriver driver;
    tc_1Page googleSheetsPage;

    @Given("I navigate to the Google Sheets page")
    public void iNavigateToTheGoogleSheetsPage() {
        driver = new ChromeDriver();
        driver.get("https://docs.google.com/spreadsheets/d/1UGuR_CmlfZxDzlonxoaWEfpYjyK0pxcRiRZGBnBMlCI");
        googleSheetsPage = new tc_1Page(driver);
    }

    @Then("I should see the correct document URL")
    public void iShouldSeeTheCorrectDocumentURL() {
        String currentURL = googleSheetsPage.getCurrentURL();
        assertEquals("https://docs.google.com/spreadsheets/d/1UGuR_CmlfZxDzlonxoaWEfpYjyK0pxcRiRZGBnBMlCI", currentURL);
        driver.quit();
    }
}