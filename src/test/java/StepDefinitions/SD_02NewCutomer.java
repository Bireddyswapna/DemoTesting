package StepDefinitions;

import DemoWebsite.AT_02NewCustomer;
import io.cucumber.java.en.Then;

public class SD_02NewCutomer {
    @Then(": click on NewCustomer")
    public void click_on_new_customer() {
        AT_02NewCustomer.AddCustomer();

    }

    @Then(": Enter Customer Details")
    public void enter_customer_details() {
        AT_02NewCustomer.EnterCustomerInfo();

    }

    @Then(": click on Submit Button")
    public void click_on_submit_button() {
        AT_02NewCustomer.submit();

    }


}
