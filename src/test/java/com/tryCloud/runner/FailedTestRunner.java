package com.tryCloud.runner;


import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        glue = "net/seamlessly/step_definitions",
        features = "@target/rerun.txt"
)
public class FailedTestRunner {
}
