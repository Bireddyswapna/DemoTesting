Feature: Verify Login Page
  Scenario Outline: Verify Login Page with Valid and invalid test data
    Given : navigate to GuruBank website
    Then : enter data "<Username>", "<Password>", "<ExpectedResult>"
    Then : click on Login Button
    Examples:
    |Username|	 Password|	ExpectedResult|
    |mngr541021|  rYjEzaj|	login successful|
    |mngr648418|  rYjEzaj|  user or password is not valid|
    |mngr541021|  cbhdbu |  user or password is not valid|
    |mngr586411|  dvghsfs|	user or password is not valid|


