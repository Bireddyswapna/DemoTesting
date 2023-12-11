package StepDefinitions;

import DemoWebsite.AT_06LoginVersion03;
import io.cucumber.java.en.Given;

import java.io.IOException;

public class SD_06LoginVersion3 {
    @Given(": navigate to GuruBank version3 website")
    public void navigate_to_guru_bank_version3_website() throws IOException {
        AT_06LoginVersion03.LoginBankV3();

    }
}
