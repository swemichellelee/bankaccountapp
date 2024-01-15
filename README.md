# Bank Account App
## Scenario: Create an application to handle new customer bank account requests.
<br> Bank application should do the following:
<br> Read a .csv file of names, social security numbers, account type, and initial deposit
<br> Use a proper data structure to hold all of these accounts
<br>
<br> Both savings and checking accounts share the following properties:
<br>deposit()
<br>withdraw()
<br>transfer()
<br>showInfo()
<br>
<br>Both will contain an 11-Digit Account Number (generated with the following process: 1 or 2 depending on Savings or Checking, last two digits of SSN, unique 5-digit number, and random 3-digit number)
<br>
<br>Savings Account holders are given a Safety Deposit Box, identified by a 3-digit number and accessing with a 4-digit code
<br>
<br>Checking Account holders are assigned a Debit Card with a 12-digit number and a 4-digit PIN
<br>
<br>Both accounts will use an interface that determines the base interest rate --
<br>Savings accounts will use .25 points less than the base rate
<br>Checking accounts will use 15% of  the base rate
<br>
<br>The ShowInfo method should reveal relevant account information as well as information specific to the Checking account or Savings account
<br>
<br>Learning Objectives:
<br>Develop a robust application architecture
<br>When to use abstract classes and abstract methods
<br>Use an interface API to receive information from a developer’s application
<br>Explore constructors deeper and use the super() keyword
<br>Explore access modifiers, when to use public, private, or protected
<br>Read data from a file and store in an appropriate data structure
<br>Generate random numbers and work with String API
