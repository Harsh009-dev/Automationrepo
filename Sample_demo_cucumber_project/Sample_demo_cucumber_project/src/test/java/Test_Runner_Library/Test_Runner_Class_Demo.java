package Test_Runner_Library;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;

@RunWith(Cucumber.class)
@io.cucumber.junit.CucumberOptions(
		features="src/test/resources/FeatureFile/Practice_form.feature",
		glue={"step_defination"},
				plugin = {"com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:"
						}
		,monochrome = true
				//,publish = true		
)

public class Test_Runner_Class_Demo {

}
