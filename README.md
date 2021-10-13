

To run the tests localy on any system you just need an IDE, I used InteliJ for initial development but any other IDE should work. 

Clone this repository localy then open the project using the IDE. 



Below is the file and folder structure for the project.

src
  + main
  + test
    + java                        Test runners and supporting code
    + resources
     + features                  Feature files
     + search                  Feature file subdirectories
             search_by_keyword.feature

Test data is defined in the search_by_keyword.feature file in the following format


  Scenario: Searching for a term
  
    Given Sergey is navigating to weather api homepage  ///Navigates to the weather.api homepage
    
    When he looks up "New%20York"                       //Searches for the specified city by adding it to the api call url,
                                                          the city name need to be url encoded
    
    Then he should see information about "New York"     //Verifies that the response contains the specified keyword
    



  There are 2 existing scenarios in the search_by_keyword.feature file. One is a valid city input the other one is an invalid input.
  
  HTML reports are generated using serenity. They are located at the following path api_test\target\site\serenity and are generated after each run 
  
  When creating new tests or adding new test data in the search_by_keyword.feature file please checkout develop and use it for testing/developing before merging the changes in the master branch
  
  
  Gitlab integration can be viewed at https://gitlab.com/stefan.bogasiu/weather-api
