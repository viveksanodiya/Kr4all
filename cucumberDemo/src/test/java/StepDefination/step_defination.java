package StepDefination;

import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.And;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
public class step_defination {

    @Given("^initilize the browser$")
    public void initilize_the_browser() throws Throwable {
       System.out.println("java");
    }
    @And("^navigate to web site$")
    public void navigate_to_web_site() throws Throwable {
    	System.out.println("mumbai");
    }

    @And("^click on login button to land on sign in page$")
    public void click_on_login_button_to_land_on_sign_in_page() throws Throwable {
    	System.out.println("indore");
    }

    @When("^user enter user Username and password $")
    public void user_enter_user_username_and_password() throws Throwable {
    	System.out.println("baba");
    }

    @Then("^verifiy the user is successfully to login$")
    public void verifiy_the_user_is_successfully_to_login() throws Throwable {
    	System.out.println("pune");
    }

   

}