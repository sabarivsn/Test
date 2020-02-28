package com.qa.sample;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import cucumber.api.CucumberOptions;
import cucumber.api.testng.CucumberFeatureWrapper;
import cucumber.api.testng.TestNGCucumberRunner;

@CucumberOptions(features="resources/features",glue= {"com.qa.stepDefinitions"},
plugin = {"pretty","json:target/cucumber.json","html:target/cucumber"})
public class CucumberTestRunner {

	private TestNGCucumberRunner runner;
	
	@BeforeClass
	public void setup()
	{
		runner = new TestNGCucumberRunner(this.getClass());
	}
	
	@Test(dataProvider="features")
	public void test(CucumberFeatureWrapper wrapper) throws Throwable
	{
		runner.runCucumber(wrapper.getCucumberFeature());
	}
	
	@DataProvider(name="features")
	public Object[][] getFeatures()
	{
		return runner.provideFeatures();
	}
	
	@AfterClass
	public void clean()
	{
		runner.finish();
	}
}