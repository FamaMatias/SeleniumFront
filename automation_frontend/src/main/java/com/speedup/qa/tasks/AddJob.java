package com.speedup.qa.tasks;

import com.speedup.qa.interaction.ScrollDown;
import com.speedup.qa.interaction.WaitInteraction;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;

import static com.speedup.qa.userinterface.AddJob.*;


public class AddJob implements Task {
    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Click.on(USER),WaitInteraction.waitFor(5), ScrollDown.on(4));
        actor.attemptsTo(Click.on(ADD_JOB));

    }
    public static AddJob addJob(){
        return Tasks.instrumented(AddJob.class);
    }
}
