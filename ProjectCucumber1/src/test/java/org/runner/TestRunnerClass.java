package org.runner;

import org.junit.AfterClass;
import org.junit.runner.RunWith;
import org.stepdefinition.JvmReport;

import io.cucumber.junit.Cucumber; //4.8.0
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features= "src/test/resources",
glue="org.stepdefinition",
tags={"@Sanity,@Regression"},plugin= {"html:src\\test\\resources\\Reports\\HtmlReport","json:src\\test\\resources\\Reports\\jsonReport\\fbpage.json"})
public class TestRunnerClass {

	@AfterClass
	public static void jvmReportGeneration() {
		JvmReport.generateJVMReport(System.getProperty("user.dir")+"\\src\\test\\resources\\Reports\\jsonReport\\fbpage.json");

	}
	
	                                                                                                                                                 
	
	
}
 