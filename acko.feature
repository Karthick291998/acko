Feature: Acko health insurance
  
  Scenario: Health insurance in acko
    Given Launch the browser and webpage of acko
    When choose the product in acko
    And Select the type of insurance in acko
    And Enter the details in acko
    And Fill the quote in acko
    Then Fill the checkout
