package com.epam.mentoring.base;

import java.io.IOException;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.runner.RunWith;

import com.epam.mentoring.core.Driver;

@RunWith(Cucumber.class)
@CucumberOptions(features = { "src/test/resources" }, format = { "pretty",
		"html:target/reports/cucumber/html", "json:target/cucumber.json",
		"usage:target/usage.jsonx", "junit:target/junit.xml" }, tags = { "@done" }, glue = { "com.epam.mentoring" })
public class MainTest {

	@BeforeClass
	public static void setUp() {
		Driver.getInstance();
	}

	@AfterClass
	public static void takeScreenShot() throws IOException {
		Driver.getInstance().quit();
	}
}