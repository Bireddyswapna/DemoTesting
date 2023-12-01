package StepDefinitions;

import DemoWebsite.AT_04VerifyLoginPageUsingExcel;
import io.cucumber.java.en.Then;

public class SD_04VerifyLoginPageUsingExcel {
    @Then(": enter data {string}, {string}, {string}")
    public void enter_data(String Username, String Password, String ExpectedResult) {
        AT_04VerifyLoginPageUsingExcel.EnterLoginDetails(Username,Password,ExpectedResult);

    }
}
