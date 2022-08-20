package com.qa.demoqa.runner;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        snippets = CucumberOptions.SnippetType.CAMELCASE,
        plugin = {"pretty", "html:datePicker/cucumber-report/cucumber.html"},
        features = {"src/test/resources/features/datepicker.feature"},
        glue = {"com.qa.demoqa.stepdefinitions"},
        publish = true
)
public class DatePickerRunner {
}
