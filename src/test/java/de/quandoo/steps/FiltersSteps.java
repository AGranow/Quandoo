package de.quandoo.steps;

import de.quandoo.FilterPage;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import static com.codeborne.selenide.Condition.attribute;
import static com.codeborne.selenide.Selenide.open;
import static com.codeborne.selenide.Selenide.sleep;

public class FiltersSteps {

    FilterPage filterPage;

    @Given("I am on the Berlin Restorants page")
    public void openRestaurantsPage() {
        filterPage = open("https://www.quandoo.de/en/berlin", FilterPage.class);
        filterPage.clickAcceptAllCookieButton();
    }


    @When("I select  TOP RATED filter")
    public void selectFilter() {
        filterPage.clickTopRatedButton();
    }

    @Then("I see that Top Rated filter is applied")
    public void topRatedIsApplied() {
        filterPage.getButton().shouldHave(attribute("data-state", "active"));
        sleep(3000);
    }

}
