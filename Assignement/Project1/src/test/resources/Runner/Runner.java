package Runner;
import org.junit.runner.RunWith;
import cucumber.api.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(tags = {"@CalendarFeature"}, features = "Features/LoginPage", glue = {
	"StepDefinition"}, plugin = { "pretty", "json:target/cucumber-json-report.json",
		"html:target/cucumber-html-report" },monochrome=true)

//src\main\java\StepDefinition\LoginPageStepDef.java
public class Runner {

	
	

	}




//package com.jha.css.wires.runner;
//
//import com.jha.css.wires.base.RestAssuredBase;
//import io.cucumber.junit.CucumberOptions;
//import net.serenitybdd.cucumber.CucumberWithSerenity;
//import org.junit.runner.RunWith;

//@RunWith(CucumberWithSerenity.class)
//@CucumberOptions(strict=true,tags = {"@CalendarFeature"}, features = "src/test/resources/features", glue = {
//		"com.jha.css.wires.stepdefinition"}, plugin = { "pretty", "json:target/cucumber-json-report.json",
//				"html:target/cucumber-html-report" },monochrome=true)
//
//public class Runner extends RestAssuredBase {
//
//}
//

