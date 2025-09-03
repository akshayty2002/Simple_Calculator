
Java Calculator

Overview
--------
This is a simple console-based calculator program written in Java.
It performs basic arithmetic operations: addition, subtraction, multiplication, and division.
The program takes user input for numbers and operations, displays the result, and allows repeated calculations until the user chooses to exit.

Features
--------
- Addition, Subtraction, Multiplication, Division
- Handles division by zero with an error message
- User-friendly console prompts
- Continuous operation until the user exits

Requirements
------------
- Java Development Kit (JDK) installed (version 8 or above recommended)
- Command-line interface to compile and run the program

How to Compile and Run
----------------------
1. Open a terminal or command prompt.
2. Navigate to the directory containing 'calculator.java'.
3. Compile the program using:
   javac calculator.java
4. Run the program using:
   java calculator
5. Follow on-screen prompts to use the calculator.

Usage Instructions
------------------
- Enter two integer numbers when prompted.
- Choose an operation by entering the corresponding number (1 to 4).
- View the result displayed.
- When asked if you want to continue, enter '1' for yes or '2' to exit.

Code Structure
--------------
The main logic is contained within a 'while(true)' loop that:
- Prompts for inputs,
- Executes the chosen operation using a 'switch' statement,
- Displays results or error messages,
- Queries the user to continue or exit.

Notes
-----
- The program uses the Scanner class for input and properly closes it upon exit.
- Only integer inputs are supported; input validation for non-integers is not implemented.
- Feel free to fork and improve the project.

Contributions
-------------
Contributions are welcome! To contribute:
- Fork the repository.
- Create a branch for your feature.
- Submit pull requests with clear descriptions.

License
-------
This project is released under the MIT License.

Contact
-------
For questions or feedback, please contact: akshayvatstyagi0007@gmail.com

Happy calculating!
