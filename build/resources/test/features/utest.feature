# ccastrova@choucairtesting.com
Feature: Join the community of testers.
  As a user,I want to join to the world's largest community of testers on the Utes.com page

  @case
  Scenario: Register on the Utest.com page
    Given than Carlos is on the Utest page
    When he clicks Join Today on the Utest page
    And he enters the data required in the four registration steps
    And he accept the terms of use, the guidelines and the privacy and security policy of utest
    Then he registers successful on the Utest page seeing a message First, please check your email inbox