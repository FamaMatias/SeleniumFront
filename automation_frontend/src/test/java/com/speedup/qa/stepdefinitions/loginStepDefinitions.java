package com.speedup.qa.stepdefinitions;

import com.speedup.qa.models.CredentialData;
import com.speedup.qa.tasks.LoginUser;
import com.speedup.qa.tasks.OpenBrowser;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.serenitybdd.screenplay.actors.Cast;
import net.serenitybdd.screenplay.actors.OnStage;
import net.thucydides.core.annotations.Managed;
import org.openqa.selenium.WebDriver;

import java.util.List;

import static net.serenitybdd.screenplay.actors.OnStage.setTheStage;
import static net.serenitybdd.screenplay.actors.OnStage.theActorCalled;

public class loginStepDefinitions {

    @Managed
    private WebDriver myBrowser;

    @Before
    public void setUpOnStage(){
        setTheStage(Cast.whereEveryoneCan(BrowseTheWeb.with(myBrowser)));
        theActorCalled("Matias S Fama");

    }
    @Given("^that Elvis is in the portal$")
    public void thatElvisIsInThePortal() {
        OnStage.theActorInTheSpotlight().wasAbleTo(OpenBrowser.browser());
        }


    @When("^he complete the information for the login$")
    public void heCompleteTheInformationForTheLogin(List<CredentialData> data) {
        OnStage.theActorInTheSpotlight().attemptsTo(LoginUser.withdata(data.get(0)));
    }

    @Then("^the user can see the name$")
    public void theUserCanSeeTheName() {

    }
}
