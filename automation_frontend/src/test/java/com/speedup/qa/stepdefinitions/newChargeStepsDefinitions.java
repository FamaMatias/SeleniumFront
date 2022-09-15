package com.speedup.qa.stepdefinitions;


import com.speedup.qa.models.DataJob;
import com.speedup.qa.tasks.AddNewJob;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.serenitybdd.screenplay.actors.OnStage;

import java.util.List;


public class newChargeStepsDefinitions {

    @When("^Add a new job$")
    public void addANewJob(List<DataJob> data) {
        OnStage.theActorInTheSpotlight().wasAbleTo(AddNewJob.whitData(data.get(0)));

    }

    @Then("^I should see in the profile$")
    public void iShouldSeeInTheProfile() {
    }
}
