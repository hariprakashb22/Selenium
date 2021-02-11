Feature: Application Form
Scenario: Filling the application Form
Given Launch
And Get the Url
When Enter Names
   |FirstName|LastName|Date|Continents|
   |Hari|Prakash|22.01.1997|Asia|
   |Kumar|An|31.01188|Asia|
And Selet items
Then Fill the date and commands
    
	