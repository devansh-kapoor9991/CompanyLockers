Project Name- CompanyLockers
Developed By-Devansh Kapoor
User Story
1.As a user I want lockme digital locker to store my credentials.
2.As a user I want a registration page to register in the locker.
3.As a user I want a login page to authenticate a user to access the application.
4.As a user I want to login inside the application and fetch my stored credentials.
5.As a user I want to delete my file.
6.As a developer I want to build a registration page to register a user in the digital locker.
7.As a developer I want to build a login page to authenticate the user.
8.As a developer I want to provide option to store user credentials.
9.As a developer I want to provide option to fetch user credentials.
10.As a developer I want to provide option to delete file.
11.As a developer I want to provide a option to exit the application.
12.As a developer I create user interaction with console input.

Sprint(1 week):-
1.As a user I want lockme digital locker to store my credentials.
2.As a user I want a registration page to register in the locker.
3.As a user I want a login page to authenticate a user to access the application.
4.As a user I want to login inside the application and fetch my stored credentials.
5.As a user I want to delete my file.
6.As a developer I want to build a registration page to register a user in the digital locker.
7.As a developer I want to build a login page to authenticate the user.
8.As a developer I want to provide option to store user credentials.
9.As a developer I want to provide option to fetch user credentials.
10.As a developer I want to provide option to delete file.
11.As a developer I want to provide a option to exit the application.
12.As a developer I create user interaction with console input.

Project git repositories:-
1- link : https://github.com/devansh-kapoor9991/CompanyLockers.git
2- clone git: git clone https://github.com/devansh-kapoor9991/CompanyLockers.git

How to run the project:-
1- clone project 
	clone git: git clone https://github.com/devansh-kapoor9991/CompanyLockers.git
2-In line 94 of HomePage.java -- Specify your own path here,your path would be visible where your project is stored in your system
  In line 166 of HomePage.java - Specify your own path here,your path would be visible where your project is stored in your system
3-open src --> locker.welcome --> Home.java -right click-select run as java application

Package and Classes :-
Package - locker.view
	     classes-HomePage.java
		     OptionsPage.java
Package - locker.welcome
	     class-Home.java

Concepts Used :-
Java OOPS
File Handling
String Handling
List Interface
Collections sort library
Switch case for user interaction

Algorithm:-

I.	Displays the Welcome application message in the terminal
II.	Displays the developer name
III.	Shows the start menu options which are Show current files,Register, Login , Exit
IV.	Takes input from user from command line
V.	If User selects Option 1
Show the current stored files database . Displays start menu
VI.	If User selects Option 2
Requests for the username
If the username is already there , ask them to choose a different name Make a new file by the username entered
Ask the user to enter the password Display user registered
Displays the start menu.
VII.	If the user selects Option 3
Ask for username
If the username is wrong display “wrong username” and display the start menu . Display enter password if username correct .
If the password is correct , display the options menu , else display the start menu .
Display the options menu options which are Store Credentials , Fetch Credentials ,Delete File , Back to start menu
1.	If user selects :- Store Credentials
Display : Welcome to your file locker .
Ask the user to enter the website whose credentials they wish to store Request for the website's username .
Request the user for the password for the website Display your data has been stored
Display the Options menu.
2.	If user selects :- Fetch Credentials
Ask user which website data they wish to fetch
If the website entered is not there , display credentials not stored If the website entered is correct , displays  the credentials Display the Options menu.
3.	If user selects :-Delete File
Delete the file with the “username”.txt Display the start menu
4.	If the user selects Back to main menu Display the start menu
VIII.	If the user selects Exit
Terminate execution







