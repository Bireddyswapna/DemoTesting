package StepDefinitions;

import DemoWebsite.AT_03VerifyRegisteredSucessfully;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;

import java.io.IOException;

public class SD_03VerifyRegistrationPage {
    @Given(": Navigate to Registration page")
    public void navigate_to_registration_page() throws IOException {
        AT_03VerifyRegisteredSucessfully.RegistrationPage();


    }

    @Then(": check Title Assertion")
    public void check_title_assertion() {
        AT_03VerifyRegisteredSucessfully.TitleAssertion();

    }

}
