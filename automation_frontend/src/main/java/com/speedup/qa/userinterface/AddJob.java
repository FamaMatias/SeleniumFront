package com.speedup.qa.userinterface;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class AddJob {

    public static final Target USER = Target
            .the("Selecciona el boton de la foto")
            .located(By.linkText("Welcome, Matias!"));

    public static final Target ADD_JOB = Target
            .the("Seleccionar añadir experiencia")
            .located(By.xpath("//li-icon[@aria-label='Add new education']"));

}
