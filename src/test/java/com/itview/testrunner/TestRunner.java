package com.itview.testrunner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions
(
		features= {"Features/calculator.feature"},			// add slash to run the particular feature and its name
		glue= {"com.itview.basictestcases"},
		plugin= {"pretty","html:target/cucumber-report.html"},
		monochrome = true,
		tags= "@Add"		// This run the particular Scenario form the multiple Scenario from the features
		
)


public class TestRunner 
{

}
