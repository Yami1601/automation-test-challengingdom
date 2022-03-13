package com.expleo.challengingdom.automation.runner;

import org.junit.runner.RunWith;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features = "src/test/resources/features/challenging-dom.feature",
        glue = "com/expleo/challengingdom/automation/stepDefinitions",
        plugin ={"html:target/cucumber-html-report","json:target/report/cucumber.json"} ,
        monochrome = true,
        dryRun = false,
        publish = true,
        tags = "@DomApplicationValidation")
public class Runner {

}
