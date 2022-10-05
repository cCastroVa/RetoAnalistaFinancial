# ccastrova@choucairtesting.com
Feature: Join the community of testers.
  As a user,I want to join to the world's largest community of testers on the Utes.com page

  @case
  Scenario: Register on the Utest.com page
    Given than Carlos is on the Utest page
    When he clicks Join Today on the Utest page
    And he enters the data required in the first registration step
      | first_name | last_name | email_address     | month_bird | day_bird | year_bird | language |
      | Carlos     | Castro    | ccastrova@testing.com | December   | 3        | 1997      | Spanish  |
    And he enters the data required in the second registration step
      | city            | postal_code | country |
      |Bello, Antioquia | 050044      | Colombia|
    And he enters the data required in the third registration step
      | computer | version              | language_computer   | mobile_device | model        | operating_system |
      | Windows  | Windows 10 Education | Spanish             | Motorola      | Moto G9 Plus | Android 10       |
    And he enters the data required in the fourth registration step
      |password        | repeat_password   |
      | Asdfghjkl123*a | Asdfghjkl123*a    |
    And he accept the terms of use, the guidelines and the privacy and security policy of utest
    Then he registers successful on the Utest page seeing a message First, please check your email inbox