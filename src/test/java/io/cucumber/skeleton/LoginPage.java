package io.cucumber.skeleton;

import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import io.appium.java_client.MobileBy;

public class LoginPage extends Methods {
    String usernameTF, passwordTF, loginButton, errorText, aboutButton, locationButton;
    public LoginPage() {
        usernameTF = "UsernameField";
        passwordTF= "PasswordField";
        loginButton = "LoginButton";
        errorText = "ErrorLabel";
        aboutButton = "AboutButton";
        locationButton = "LocationButton";
    }

    @When("I press login button in login page")
    public void i_press_login_button_in_login_page() {
        click(MobileBy.id(loginButton));
    }

    @Then("It should show error empty username in login page")
    public void it_should_show_error_empty_username_in_login_page() {
        verifyElement(Assets.login.errorLogin.username,MobileBy.id(errorText));
    }

    @When("I fill in username in login page")
    public void i_fill_in_username_in_login_page() {
        fillInText(Assets.login.validUsername, MobileBy.id(usernameTF));
    }

    @Then("It should show error empty password in login page")
    public void it_should_show_error_empty_password_in_login_page() {
        verifyElement(Assets.login.errorLogin.password,MobileBy.id(errorText));
    }

    @When("I fill in invalid username in login page")
    public void i_fill_in_invalid_username_in_login_page() {
        fillInText(Assets.login.invalidUsername, MobileBy.id(usernameTF));
    }

    @When("I fill in invalid password in login page")
    public void i_fill_in_invalid_password_in_login_page() {
        fillInText(Assets.login.invalidPassword, MobileBy.id(passwordTF));
    }

    @Then("It should show error login invalid in login page")
    public void it_should_show_error_login_invalid_in_login_page() {
        verifyElement(Assets.login.errorLogin.invalidUser,MobileBy.id(errorText));
    }

    @When("I fill in password in login page")
    public void i_fill_in_password_in_login_page() {
        fillInText(Assets.login.validPassword, MobileBy.id(passwordTF));
    }

    @When("I press about button in login page")
    public void i_press_about_button_in_login_page() {
        click(MobileBy.id(aboutButton));
    }

    @When("I press location button in login page")
    public void i_press_location_button_in_login_page() {
        click(MobileBy.id(locationButton));
    }

}
