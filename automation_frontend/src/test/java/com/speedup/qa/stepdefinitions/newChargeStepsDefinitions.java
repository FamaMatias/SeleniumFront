package com.speedup.qa.stepdefinitions;


import com.speedup.qa.tasks.AddJob;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.serenitybdd.screenplay.actors.OnStage;


public class newChargeStepsDefinitions {

    @When("^Add a new job$")
    public void addANewJob() {
        OnStage.theActorInTheSpotlight().wasAbleTo(AddJob.addJob());

    }

    @Then("^I should see in the profile$")
    public void iShouldSeeInTheProfile() {
    }
}
