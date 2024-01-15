# Bank Account App
Scenario: Create an application to handle new customer bank account requests.
Bank application should do the following:
Read a .csv file of names, social security numbers, account type, and initial deposit
Use a proper data structure to hold all of these accounts
Both savings and checking accounts share the following properties:
deposit()
withdraw()
transfer()
showInfo()
Both will contain an 11-Digit Account Number (generated with the following process: 1 or 2 depending on Savings or Checking, last two digits of SSN, unique 5-digit number, and random 3-digit number)
Savings Account holders are given a Safety Deposit Box, identified by a 3-digit number and accessing with a 4-digit code
Checking Account holders are assigned a Debit Card with a 12-digit number and a 4-digit PIN
Both accounts will use an interface that determines the base interest rate
Savings accounts will use .25 points less than the base rate
Checking accounts will use 15% of  the base rate
The ShowInfo method should reveal relevant account information as well as information specific to the Checking account or Savings account

Learning Objectives:
Develop a robust application architecture
When to use abstract classes and abstract methods
Use an interface API to receive information from a developer’s application
Explore constructors deeper and use the super() keyword
Explore access modifiers, when to use public, private, or protected
Read data from a file and store in an appropriate data structure
Generate random numbers and work with String API
