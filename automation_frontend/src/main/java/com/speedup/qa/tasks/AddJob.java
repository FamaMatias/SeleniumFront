package com.speedup.qa.tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;

import static com.speedup.qa.userinterface.AddJob.*;


public class AddJob implements Task {
    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Click.on(USER));
        actor.attemptsTo(Click.on(VIEW_PROFILE));
    }
    public static AddJob addJob(){
        return Tasks.instrumented(AddJob.class);
    }
}
