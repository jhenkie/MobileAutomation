package io.cucumber.skeleton;

import cucumber.api.java.en.Then;
import io.appium.java_client.MobileBy;

public class ProfilePage extends Methods {
    String welcomeText;
    public ProfilePage() {
        welcomeText = "ProfileLabel";
    }

    @Then("It should show welcome note in profile page")
    public void it_should_show_welcome_note_in_profile_page() {
        verifyElement(Assets.profile.welcome, MobileBy.id(welcomeText));
    }
}
