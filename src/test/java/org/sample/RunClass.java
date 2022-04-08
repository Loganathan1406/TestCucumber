package org.sample;

import org.junit.AfterClass;
import org.junit.runner.RunWith;
import org.stepclass.JvmReportClass;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features = "src\\test\\resources\\Feature\\Login.feature",

		glue = "org.stepclass", dryRun = false, plugin = { "pretty",
				"html:C:\\Users\\LOGU\\eclipse-workspace\\Test\\src\\test\\resources\\AllReports\\htmlReport",
				"junit:C:\\Users\\LOGU\\eclipse-workspace\\Test\\src\\test\\resources\\AllReports\\junitReport\\junitReport.junit",
				"json:C:\\Users\\LOGU\\eclipse-workspace\\Test\\src\\test\\resources\\AllReports\\jsonReport\\jsonReport.json" })

public class RunClass {

	@AfterClass
	public static void report() {
		JvmReportClass.generateJvmReport(
				"C:\\Users\\LOGU\\eclipse-workspace\\Test\\src\\test\\resources\\AllReports\\jsonReport\\jsonReport.json");

	}

}
