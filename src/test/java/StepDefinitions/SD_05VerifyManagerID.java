package StepDefinitions;

import DemoWebsite.AT_05VerifyManagerID;
import io.cucumber.java.en.Then;

public class SD_05VerifyManagerID {
    @Then(": Verify ManagerID")
    public void verify_manager_id() {
        AT_05VerifyManagerID.VerifyID();

    }

}
