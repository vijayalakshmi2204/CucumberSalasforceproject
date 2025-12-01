package com.cucumber.runner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import io.cucumber.junit.Cucumber;


@RunWith(Cucumber.class)
@CucumberOptions(features="C:\\viji\\workspace\\cucumberframework\\CucumberSFProject\\Features\\RandomScenariosTest.feature",
					glue= {"com.cucumber.steps"},
					plugin= {"pretty","html:target/cucumber-reports/cucumber.html",
							"json:target/cucumber-reports/cucumber.json"},tags="@Run"
							
)
public class Runner {

}
