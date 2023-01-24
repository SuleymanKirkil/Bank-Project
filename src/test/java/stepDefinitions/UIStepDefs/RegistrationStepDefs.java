package stepDefinitions.UIStepDefs;

import io.cucumber.java.en.*;
import org.junit.Assert;
import pages.HomePage;
import pages.RegisterPage;

public class RegistrationStepDefs {
    RegisterPage registerPage = new RegisterPage();
    HomePage homePage = new HomePage();
    @Given("User Clicks on Registration Button")
    public void user_clicks_on_registration_button() {
    homePage.registerButton.click();
    }

    @Given("User clicks {string} and clicks next box")
    public void user_clicks_and_clicks_next_box(String box) {
    switch (box) {
        case "SSN Box":
            registerPage.ssnBox.click();
            registerPage.firstnameBox.click();
            break;
        case "Firstname Box":
            registerPage.firstnameBox.click();
            registerPage.lastNameBox.click();
            break;
        case "Lastname Box":
            registerPage.lastNameBox.click();
            registerPage.addressBox.click();
            break;
        case "Address Box":
            registerPage.addressBox.click();
            registerPage.emailBox.click();
            break;
        case "Phone Number":
            registerPage.mobilephoneBox.click();
            registerPage.emailBox.click();
            break;
        case "Username Box":
            registerPage.usernameBox.click();
            registerPage.emailBox.click();
            break;
        case "Email Box":
            registerPage.emailBox.click();
            registerPage.firstPasswordBox.click();
            break;
        case "New Password Box":
            registerPage.firstPasswordBox.click();
            registerPage.secondPassword.click();
            break;
        case "Password Comfirmation Box":
            registerPage.secondPassword.click();
            registerPage.firstnameBox.click();
            break;
        default:
            break;
    }
    }

    @Given("User verifies {string} message is displayed")
    public void user_verifies_message_is_displayed(String invalid) {
    switch (invalid) {
        case "Please enter your social security number.":
            Assert.assertTrue(registerPage.invalidSsn.isDisplayed());
            break;
        default:
            break;
    }
    }
    @When("User enters {string} in the {string} and clicks next box")
    public void user_enters_in_the_and_clicks_next_box(String string, String string2) {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }

    @Then("User verifies system put {string} between digits automatically")
    public void user_verifies_system_put_between_digits_automatically(String string) {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }
}
