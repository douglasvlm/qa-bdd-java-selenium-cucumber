package com.douglas.tests;

import com.douglas.util.Hooks;
import org.junit.ClassRule;
import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features = "src/test/resources", tags = "@test", glue = {""},
        monochrome = true, dryRun = false, plugin = { "json:target/cucumber.json", "rerun:target/rerun.txt" })
public class RunnerTest {

    @ClassRule
    public static Hooks hooks = new Hooks();
}