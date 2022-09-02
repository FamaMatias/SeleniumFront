package com.speedup.qa.userinterface;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class Login {
    public static final Target ENTER_LOGIN_SCREEN = Target
            .the("Selecciona el boton de ingresar")
            .located(By.className("nav__button-secondary"));

    public static final Target USER_NAME = Target
            .the("Se ingresa el usuario (email)")
            .located(By.id("username"));

    public static final Target USER_PASSWORD = Target
            .the("Se ingresa la contraseña (email)")
            .located(By.name("session_password"));
}
