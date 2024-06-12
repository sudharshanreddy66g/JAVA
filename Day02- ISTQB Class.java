Day-02 ISTQB Date:07-04-2024
----------------------------

Test ware at different testing phases:
-------------------------------------

--> Test planning work products:
--------------------------------
- Test plan
- Test Schedule,
- Risk register 
- And entry and exit criteria.


--> Test monitoring and control work productsP:-
-----------------------------------------------
- Test progress reports





--> Test analysis work products:-
-------------------------------
- Prioritized test conditions, ex:- Acceptance criteria.
- Defect reports regarding defects.


--> Test design work products:-
-------------------------------

- Test cases 
- Test characters, coverage items
- Test data requirements and test environment elements.


--> Test implementation work products:-
-------------------------------------




--> Test execution work products:-
--------------------------------
Test logs,
And Defect Reports.


--> Test completion work products:-
----------------------------------




Retrospective Meeting:- Inspect and Adapt.
---------------------

--> For the things which didn't go well, what are the actions items.
--> Steps to be taken to avoid similar impediment occuring next sprint.
--> There is always an owner for that action item.

Scrum master should create a process with the Test data team in giving testing team relevent test data before sprint start.
Continuos Improvement.

Roles in Testing:-
----------------

-> Test Management Role:-
------------------------

- Test planning,
- Monitoring,
- Control 
- And Test Completion.


-> Testing Role:-
---------------

Overall responsibility for the engineering(Technical aspect) of Testing.,
Test Analysis, Test Implementation and Test Execution.

Essential Skills And Good Practices In Testing:-
-----------------------------------------------

--> Generic Skills Required for Testing:-
---------------------------------------
1). Testing Knowledge.
2). Throughness, Crefulness, Curiosity, Attention to details, being methodical (identify defects
    where no body can think of).
3). Good Communication Skills, active listening, team player.
4). Analytical thinking, Critical thinking, Creativity.
5). Technical Knowledge.
6). Domain Knowledge:-
    -----------------
 Ecommerce, Medical, Inernet, Manking Domain.


Whole Team Approach:-
--------------------
Team member with necessary skills and knowledge can perform any task and 
everyone is responsible for the quality.


Indepedence Of Testing:-
-----------------------

Independence of testing makes the process more efficient at finding defects.

Chapter 2:
---------

Testing Throught SDLC


SDLC(SOFTWARE DEVELOPMENT LIFE CYCLE)


REQUIREMENT GATHERING
DESIGN(SYSTEM ARCHITECTURE/HLD)
DEVELOPMENT
TESTING
DEVELOPMENT
MAINTENANCE



SDLC MODELS:-
----------


WATEFALL MODEL:-
--------------

REQUIREMENT COLLECTION
DESIGN
DEVELOPMENT
TESTING
DEPLOMENT
MAINTENANCE


V & V MODEL:-
-------------
verification process						Validation Process

	 Business REQUIREMENT Specification	-------- ACCEPTANCE TEST DESIGN-----> ACCEPTANCE TESTING
	  SYSTEM Requirement Specification      -------- SYSTEM TEST DESIGN-----> SYSTEM TESTING        TESTING TEAM
	  HLD           ----------INTEGRATION Test DESIGN--------------------> INTEGRATION TESTING
	  LLD          ------------UNIT TEST DESIGN------------------->  UNIT TESTING
	                              CODING
	
DEVELOPMENT TEAM



Spiral Model:-
-------------


It is a combination of waterfall and iterative model.

1). Planning.
2). Risk Analysis.
3). Enginnering.
4). Evaluation.



AGILE MODEL:-
------------

SDLC model where we develop app/products in iterations/increment.
Deliver Living Room - 15 Days.
Deliver Kitchen - 15 Days.
Deliver BedRoom - 15 Days.


ISTQB TOPICS :-
-------------


TESTING IN THE CONTEXT OF SDLC MODEL :-
--------------------------------------
Impact Of SDLC on Testing :-
---------------------------
Choice of SDLC will impact the below.

1). Scope and Timing.
2). Levels of test documentation.
3). Choice of test techniques and approach.
4). Extent of test automation.
5). Roles and Responsibilities of tester.


SDLC and Good Testing Practices:-
--------------------------------
1). For every dev activity, there is a corresponding test activity.
2). Different test levels have different test objectives. For example test objective of 
    integration testing will be diff from objective of system testing.

3). Testing starts early, which means testers starts reviewing the re and other
    documentation so that any defect can be caugh. SHIFT LEFT


Testing as a Driver for Software Development:-
---------------------------------------------

public static void main()
{
	-----
	-----
}


Testing --- > Unit Testing.


Automated Test Script..... and then he will run this. Script will fail.
He will refactor his code.
Again this test cse.
Again fail.
Again he will factor code.
Untill Test case Pass.

TDD(Test Data Driven Development):-
-----------------------------

Tests are written first, then the code is written to satisfy the tests, and then the 
tests and code are refactored.

ATDD(Acceptance test Driven Development) :
-----------------------------------------

Automated test script ----> Derives test from acceptance criteria.


BDD(Behaviral Driven Development):-
----------------------------------

It is a software dev approach where focus is on the behaviour of the system from the
perspective of developers, testers and customers. It emphasizes on communicatio
and collaboration by using a gherkin language.

Developer ----- ? Tester GHERKIN language

	Given TV is ON
	When user press home key on remote
	And click on Netflix on remote
	Then Netflix is launched
	And user play a content on Netflix
	Then video plays.

Devops and Testing:-
-------------------


CI/CD PIPELINE:-
---------------
Commit change
Trigger Build
Build
Notify of Build Outcome
Run Test
Notify of test outcome
Deliver build to environment
Deploy where necessary.

Whenever a dev commits a change in MAIN REPO, this CI/CD pipeling is triggered....
---
1). Build is Generated.
2). Repost Build is created or not.
3). Build is successful.
4). Run test (Automated Tests)
5). All Pass
6). Report of test cases.
7). Build will be deploed in live.


Benefits:--
---------

--> Faster Feedback
--> CI promotes shift left.
--> Promotes automated test process like CI/CD.
--> Increased focus on Non Functionality test attributes.
--> Automation.


Shift Left:-
----------
Shift Left means testing should start early even before code is implemented
or code is integrated. But this does not mean we should not test latter.


Retrospective and Process Improvement:-
-------------------------------------
 Typical Benefits of Retrospective:-
----------------------------------
1). Increased test effectiveness.
2). Increased quality of testware.
3). Team bonding and learning.
4). Better cooperation.



Test Levels and Test Types:-
---------------------------

Test Level:-
-----------

Unit Testing, Integration Testing, System Testing, Acceptance Testing.






Test Type:-
----------
Functional Testing,
Non-Functionality Testing,
Security,
Load,
Spike,
Endurance,
Maintability, 
Portability Testing.


Integartion Testing:-
---------------------
i). Functional Testing.
ii). Non Functional Testing

System Testing:-
---------------
Functional Testing
Load Testing



Acceptance Testing:-
--------------------

Compatability Testing.




Test Levels:-
-------------
1). unit Testing:-
----------------
Developer
MR 
Compenent testing also known as unit testing,focuses on testing individual software components or modules in isolation from the rest of the system.


2). Integration Testing:-
-----------------------

The main goal of integration testing is to verify that the integrated components 
work together correctly and exchange data as expected.



3). System Testing:-
-------------------

System testing covers functional and non functionaal aspects of the system, including usability, performance, security and reliability.

4). Acceptance Testing:-
-----------------------

Acceptance testing focuses on validating that the software meets the acceptance criteria defined by stakeholders, including end-users, customers, and business.

Smoke Testing:-
--------------
Is a type of testing which is conducted once the build is deployed by the developer in the testing environment. As a part of it, 





Tools:-
-------
Jmeter, Load Runner, Gatling.

Retesting:-
----------





































































 

























































































 












































































