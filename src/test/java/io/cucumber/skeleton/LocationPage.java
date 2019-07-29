package io.cucumber.skeleton;

import cucumber.api.java.en.Then;
import io.appium.java_client.MobileBy;

public class LocationPage extends Methods {
    String netherlandText, USAText, romaniaText, mexicoText;
    public LocationPage() {
        netherlandText = "NetherlandLabel";
        USAText = "USALabel";
        romaniaText = "RomaniaLabel";
        mexicoText = "MexicoLabel";
    }

    @Then("It should show netherland address in location page")
    public void it_should_show_netherland_address_in_location_page() {
        verifyElement(Assets.location.netherland, MobileBy.id(netherlandText));
    }

    @Then("It should show USA address in location page")
    public void it_should_show_USA_address_in_location_page() {
        verifyElement(Assets.location.USA, MobileBy.id(USAText));
    }

    @Then("It should show romania address in location page")
    public void it_should_show_romania_address_in_location_page() {
        verifyElement(Assets.location.romania, MobileBy.id(romaniaText));
    }

    @Then("It should show mexico address in location page")
    public void it_should_show_mexico_address_in_location_page() {
        verifyElement(Assets.location.mexico, MobileBy.id(mexicoText));
    }
}
