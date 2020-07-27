package org.stepdefinition;

import java.util.concurrent.TimeUnit;

import org.base.BaseClass;

import cucumber.api.java.Before;
import io.cucumber.java.After;

public class HooksClass extends BaseClass{
@Before
public void beforeExecution1() {
	System.out.println("Before1");
	launchDriver();
}
@Before("@Regression")
public void beforeExecution2() {
	System.out.println("Before 2  ");
	driver.manage().timeouts().implicitlyWait(100, TimeUnit.SECONDS);
}
@Before("@Sanity")
public void beforeExecution3() {
	System.out.println("Before 3 ");
	driver.manage().window().maximize();
}
@After
public void afterExecution1() {
	System.out.println("After1");
}
@After("@Sanity")
public void afterExecution2() {
	System.out.println("After2");
}

}
