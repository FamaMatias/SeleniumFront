package com.speedup.qa.runners;

import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(features = "classpath:feature/newChange.feature"
        ,glue = "classpath:com/speedup/qa/stepdefinitions"
        ,snippets = SnippetType.CAMELCASE)
public class newChargeRunners {
}