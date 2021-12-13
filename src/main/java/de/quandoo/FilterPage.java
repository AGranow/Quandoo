package de.quandoo;

import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.support.FindBy;

public class FilterPage {

    @FindBy(xpath = "//button[@data-qa='filter-button-top-rated']")
    private SelenideElement topRatedButton;

    @FindBy(id = "CybotCookiebotDialogBodyLevelButtonLevelOptinAllowAll")
    private SelenideElement acceptAllCookieButton;

    public void clickTopRatedButton() {
        topRatedButton.click();
    }

    public SelenideElement getButton() {
        return topRatedButton;
    }

    public void clickAcceptAllCookieButton() {
        if (acceptAllCookieButton.exists()) {
            acceptAllCookieButton.click();
        }
    }
}
