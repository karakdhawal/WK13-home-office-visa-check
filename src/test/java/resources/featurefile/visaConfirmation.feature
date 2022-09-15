Feature: Visa Confirmation Test
  As user I want to login into nop commerce website

Scenario: An Australian coming to UK for tourism
  Given I am on Homepage
  When I click on start button
  And I select a nationality Australia
  And I click on nationality continue button
  And I select reason Tourism
  And I click on reason continue button
  Then I verify result you will not need a visa to come to the UK

Scenario: A chilean coming to the UK for work and Plans on staying for longer than six months
  Given I am on Homepage
  When I click on start button
  And I select a Nationality Chile
  And I click on nationality continue button
  And I select reason work academic visit or business
  And I click on reason continue button
  And I select intended to stay for longer than 6 months
  And I click on duration continue button
  And I select have planning to work for health and care professional
  And I click on worktype continue button
  Then I verify result You need a visa to work in health and care

  Scenario: A columbian national coming to the UK to join a partner for a long stay they do have an article 10 or 20 card
    Given I am on Homepage
    When I click on start button
    And I select a nationality Colombia
    And I click on nationality continue button
    And I select reason join partner or family for a long stay
    And I click on reason continue button
    And I select state my partner of family member have uk immigration status yes
    And I click on family immigration continue button
    Then I verify result you'll need a visa to join your family or partner in the UK
