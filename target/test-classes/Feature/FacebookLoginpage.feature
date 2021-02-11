Feature: Validation of fb loginpage
	
	Scenario Outline:: fb validation
	    Given Launch the browser
	    And Enter the Url
	    When Enter the "<username>" and "<password>"
	    Then validate and quit
	    
	    
    Examples:
    |username|password|
    |Ram|454545|
    |sam|4555522|
    |Siva|bahag|	    
