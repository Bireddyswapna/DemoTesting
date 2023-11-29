package StepDefinitions;

import DemoWebsite.AT_01Login;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.Test;

import java.io.IOException;

public class SD_01Login {
    @Test
    @Given(": navigate to GuruBank website")
    public void navigate_to_guru_bank_website() throws IOException {
        AT_01Login.LoginPage();

    }

    @Then(":  enter username and Password")
    public void enter_username_and_password() {
        AT_01Login.UsernamePassword();

    }

    @Then(": click on Login Button")
    public void click_on_login_button() {
        AT_01Login.LoginButton();

    }
}
