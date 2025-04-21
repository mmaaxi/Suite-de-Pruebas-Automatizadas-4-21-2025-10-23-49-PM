package pages;

import org.openqa.selenium.WebDriver;

public class tc_1Page {
    WebDriver driver;

    public tc_1Page(WebDriver driver) {
        this.driver = driver;
    }

    public String getCurrentURL() {
        return driver.getCurrentUrl();
    }
}