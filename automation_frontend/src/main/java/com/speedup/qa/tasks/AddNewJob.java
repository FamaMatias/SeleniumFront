package com.speedup.qa.tasks;

import com.speedup.qa.interaction.ScrollDown;
import com.speedup.qa.interaction.WaitInteraction;
import com.speedup.qa.models.DataJob;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;

import static com.speedup.qa.userinterface.AddJob.*;


public class AddNewJob implements Task {

    private DataJob dataJob;

    public AddNewJob (DataJob dataJob){
        this.dataJob = dataJob;
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Click.on(USER),WaitInteraction.waitFor(5), ScrollDown.on(7));
        actor.attemptsTo(Click.on(ADD_EXPERIENCE));
        actor.attemptsTo(Click.on(ADD_JOB));
        actor.attemptsTo(Enter.theValue(dataJob.getTitle()).into(TITLE));
        actor.attemptsTo(Click.on(EMPLOYMENT_TYPE.of(dataJob.getEmploymentType())));
        actor.attemptsTo(Enter.theValue(dataJob.getCompanyName()).into(COMPANY_NAME));
        actor.attemptsTo(Enter.theValue(dataJob.getLocation()).into(LOCATION));
        actor.attemptsTo(Enter.theValue(dataJob.getIndustry()).into(INDUSTRY));
        actor.attemptsTo(Click.on(MONTH.of(dataJob.getMonth())));
        actor.attemptsTo(Click.on(YEAR.of(dataJob.getYear())));
        actor.attemptsTo(Enter.theValue(dataJob.getDescription()).into(DESCRIPTION));
        actor.attemptsTo(Click.on(SAVE));
    }
    public static AddNewJob whitData(DataJob dataJob){
        return new AddNewJob(dataJob);
    }
}
