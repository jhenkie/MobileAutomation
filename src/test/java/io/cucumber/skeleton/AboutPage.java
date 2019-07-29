package io.cucumber.skeleton;

import cucumber.api.java.en.Then;
import io.appium.java_client.MobileBy;

public class AboutPage extends Methods {
    String titleText, detailText;
    public AboutPage() {
        titleText = "TitleLabel";
        detailText = "BodyLabel";
    }

    @Then("It should show title in about page")
    public void it_should_show_title_in_about_page() {
        verifyElement(Assets.about.title, MobileBy.id(titleText));
    }

    @Then("It should show detail in about page")
    public void it_shoudl_show_detail_in_about_page() {
        verifyElement(Assets.about.detail, MobileBy.id(detailText));
    }
}
