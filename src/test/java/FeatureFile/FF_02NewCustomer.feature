Feature: NewCustomer
  @SanityTest

  Scenario: Adding New Customer
    Given : navigate to GuruBank website
    Then :  enter username and Password
    Then : click on Login Button
    Then : click on NewCustomer
    Then : Enter Customer Details
    Then : click on Submit Button