Scenario: 1.1 Verify that enter correct value in search field will give search results
Given I am on Grishaverse Welcome page
When I click on Search button
And Enter text "The Dark"
Then pop-up "The Darkling" appear

Scenario: 1.1.2 Verify that enter incorrect value in search field will not give any results
Given popup with search results is shown: "The Darkling"
When I click on top item: "The Darkling"
Then "The Darkling" wiki page is loaded

!-- Scenario: 1.1.3 Verify that the first link in results is exists
!-- Given I am on search page
!-- When Enter the value in Search field whether
!-- And click on search button
!-- Then verify the first link is exists
!-- And click on the first link
!-- Then verify the url of the page