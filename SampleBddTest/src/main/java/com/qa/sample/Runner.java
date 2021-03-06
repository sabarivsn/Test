package com.qa.sample;

import org.testng.ITestNGListener;
import org.testng.TestListenerAdapter;
import org.testng.TestNG;

public class Runner {
	
	public static void main(String[] args)
	{
		Thread runnerThread = new Thread(new Runner().new TestRunnable());
		runnerThread.run();
	}
	
	private class TestRunnable implements Runnable
	{
		public void run() {
			TestListenerAdapter adapter = new TestListenerAdapter();
			TestNG testng = new TestNG();
			testng.setTestClasses(new Class[] {CucumberTestRunner.class});
			testng.addListener((ITestNGListener)adapter);
			testng.run();
		}
	}
}
