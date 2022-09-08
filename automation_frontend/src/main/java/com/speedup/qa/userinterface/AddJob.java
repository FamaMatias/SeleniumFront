package com.speedup.qa.userinterface;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class AddJob {

    public static final Target USER = Target
            .the("Selecciona el boton de la foto")
            .located(By.id("ember16"));

    public static final Target VIEW_PROFILE = Target
            .the("Selecciona la visualizacion del perfil")
            .located(By.linkText("View Profile"));
}
