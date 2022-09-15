package com.speedup.qa.userinterface;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class AddJob {

    public static final Target USER = Target
            .the("Selecciona el boton de la foto")
            .located(By.linkText("Welcome, Matias!"));

    public static final Target ADD_EXPERIENCE = Target
            .the("Seleccionar añadir experiencia")
            .located(By.xpath("(//div[@class='ivm-image-view-model   '])[1]"));

    public static final Target ADD_JOB = Target
            .the("Seleccionar añadir puesto")
            .located(By.xpath("//span[@aria-hidden='true'][normalize-space()='Add position']"));

    public static final Target TITLE = Target
            .the("Label titulo")
            .located(By.xpath("(//input[@type='text'])[1]"));

    public static final Target EMPLOYMENT_TYPE= Target
            .the("Seleccion de tipo de empleo")
            .locatedBy("//select[@id='text-entity-list-form-component-profileEditFormElement-POSITION-profilePosition-ACoAAD3TEGMBGlmaEyXsJBnDylWb5fLM-tJEQto-1-employmentStatus']//option[@value='{0}']");

    public static final Target COMPANY_NAME = Target
            .the("Label nombre de la compania")
            .located(By.xpath("(//input[@type='text'])[2]"));

    public static final Target LOCATION = Target
            .the("Label localizacion")
            .located(By.xpath("(//input[@type='text'])[3]"));

    public static final Target MONTH = Target
            .the("Seleccion mes")
            .locatedBy("(//select[@name='month'])[1]");
    public static final Target YEAR = Target
            .the("Seleccion año")
            .locatedBy("(//select[@name='year'])[1]");

    public static final Target INDUSTRY = Target
            .the("Label industria")
            .located(By.xpath("(//input[@type='text'])[4]"));

    public static final Target DESCRIPTION = Target
            .the("Label description")
            .located(By.xpath("(//textarea[@id='multiline-text-form-component-profileEditFormElement-POSITION-profilePosition-ACoAAD3TEGMBGlmaEyXsJBnDylWb5fLM-tJEQto-1-description'])"));

    public static final Target SAVE = Target
            .the("Boton de guardar")
            .located(By.xpath("(//button[@class='artdeco-button artdeco-button--2 artdeco-button--primary ember-view'])[1]"));


}
