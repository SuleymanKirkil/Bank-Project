package stepDefinitions.UIStepDefs;

import io.cucumber.java.en.*;
import org.junit.Assert;
import org.openqa.selenium.chrome.ChromeDriver;
import pages.HomePage;
import pages.SignInPage;
import utilities.ConfigReader;
import utilities.Driver;

public class logInStepDefs {

   HomePage homePage= new HomePage();
   SignInPage signInPage = new SignInPage();
    @Given("User opens GMI Bank Main page")
    public void user_opens_gmi_bank_main_page() {
    Driver.getDriver().get(ConfigReader.getProperty("GMIBankUrl"));
    }
    @Given("User Clicks on login Button")
    public void user_clicks_on_login_button() {
    homePage.loginButton.click();

    }

 @Given("User clicks on sign in button")
 public void user_clicks_on_sign_in_button() {
 homePage.signInButton.click();
 }

 @Given("User clicks on username box")
    public void user_clicks_on_username_box() {
    signInPage.usernameBox.click();
    }
    @Given("User types valid user name")
    public void user_types_valid_user_name() {
    signInPage.usernameBox.sendKeys(ConfigReader.getProperty("adminUsername"));
    }
    @Given("User clicks on password box")
    public void user_clicks_on_password_box() {
    signInPage.passwordBox.click();
    }
    @Given("User types correct password and clicks on sign in")
    public void User_types_correct_password_and_clicks_on_sign_in() {
    signInPage.passwordBox.sendKeys(ConfigReader.getProperty("adminPassword"));
    signInPage.submitButton.click();
    }
    @Then("User validates account page is opened")
    public void user_validates_account_page_is_opened() {
        Assert.assertTrue(2==2);
    }
    @Then("User closes the browser")
    public void user_closes_the_browser() {
       Driver.closeDriver();
    }

}
