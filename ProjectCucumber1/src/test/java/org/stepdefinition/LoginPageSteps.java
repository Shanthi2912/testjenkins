package org.stepdefinition;

import java.util.List;
import java.util.Map;

import org.base.BaseClass;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.pojo.LoginPojoClass;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LoginPageSteps extends BaseClass{
	static WebDriver driver;

@Given("user has to be there in the fb page")
public void user_has_to_be_there_in_the_fb_page() {

loadUrl("https://www.facebook.com/");
}

@When("user has to fill username and password")
public void user_has_to_fill_username_and_password(io.cucumber.datatable.DataTable d) {
	List<Map<String, String	>> mp=d.asMaps();
	LoginPojoClass l=new LoginPojoClass();
	fill(l.getUsername(), mp.get(2).get("username"));
	fill(l.getPassword(), mp.get(2).get("password"));
	
	 
}

@When("user clicks the login button")
public void user_clicks_the_login_button() {
	LoginPojoClass l=new LoginPojoClass();
	btnClick(l.getBtnLogin());
}

@Then("user has to navigate to homepage")
public void user_has_to_navigate_to_homepage() {
   System.out.println("user has to navigate login page");
}

@When("user has to fill invalid username and invalid password and clicks login button")
public void user_has_to_fill_invalid_username_and_invalid_password_and_clicks_login_button() {
	LoginPojoClass l=new LoginPojoClass();
fill(l.getUsername(),readData(0, 0));
	fill(l.getPassword(), readData(0, 1));
	btnClick(l.getBtnLogin());
}

@Then("user should not able to navigate to homepage")
public void user_should_not_able_to_navigate_to_homepage() {
	  System.out.println("user should not able to navigate to homepage");
}

@When("user has to fill valid username and invalid password and clicks login button")
public void user_has_to_fill_valid_username_and_invalid_password_and_clicks_login_button() {
	LoginPojoClass l=new LoginPojoClass();
	fill(l.getUsername(),"jothi");
		fill(l.getPassword(), "lamp");
		btnClick(l.getBtnLogin());
}

@Then("user should nt able to navigate to homepage")
public void user_should_nt_able_to_navigate_to_homepage() {
	  System.out.println("user should not able to navigate to homepage");
}



//@When("user has to fill username and password")
//public void user_has_to_fill_username_and_password() {
// driver.findElement(By.id("email")).sendKeys("shanthi@gmail.com");
// driver.findElement(By.id("pass")).sendKeys("Bindu");
//}



//List<String> l=d.asList();
//List<List<String>>l=d.asLists();
//Map<String,String> mp=	d.asMap(String.class,String.class);
}
