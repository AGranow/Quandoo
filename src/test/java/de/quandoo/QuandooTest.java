package de.quandoo;

import static org.junit.Assert.assertTrue;
import org.junit.Test;

@org.junit.runner.RunWith(io.cucumber.junit.Cucumber.class)
@io.cucumber.junit.CucumberOptions(plugin = {"json:target/cucumber-report.json", "pretty"}, glue = {"de.quandoo"})

public class QuandooTest {

}