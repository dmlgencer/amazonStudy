@amazon_login
  Feature: Amazon_Login_Test_Case
    Scenario: TC_001
      Given user goes to amazon home page
      When user hovers over the accounts and lists section
      When user clicks the signIn button
      When user clicks the sign in field and enter a valid email
      When user clicks the continue button
    Scenario Outline: TC_001

      Given user goes to amazon home page
      When user hovers over the accounts and lists section
      When user clicks the signIn button
      When user clicks the sign in field and enter a valid "<email>"
      When user clicks the continue button
      When user clicks the password field and enter a valid "<password>"
      When user clicks the sigIn submit button
