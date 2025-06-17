# Banco-Java-V3
A Java console project that simulates the basic operations of a bank. It allows users to create accounts (checking, savings, or regular accounts), check balances, make deposits and withdrawals with PIN validation, list accounts by type, and save data to a file. The code implements OOP principles (inheritance, abstract classes, encapsulation).

This version represents an evolution from the previous Banco-Java 2.0 model.

Improvements over the previous version
Architecture and organization
Separation into clean, modular classes, with a clear and maintainable structure.

Application of the single responsibility principle (SRP).

The MVC model is gradually being incorporated.

Interfaces and abstractions
An ICuenta interface was implemented, which defines the main methods of any bank account.

The AbstractAccount class implements this interface and serves as a common base class for:

BankAccount (regular)

SavingsAccount

CheckingAccount

Validations and Robustness
Confirmation of entered data via the console, with the option to correct it before creating an account.

PIN validation before performing sensitive operations such as withdrawals.

Error handling with try-catch to prevent crashes due to incorrect user input (e.g., letters where a number is expected).

Retry cycles if invalid data is entered.

Improved Banking Operations
CheckingAccount now allows negative balances up to a limit of -50000. This is achieved by overriding (@Override) the withdraw method.

Added support for listing accounts by type (checking, savings, regular).

You can search for an account by ID and view details after validating the PIN.

Data Persistence
Account information is saved in a .txt file by writing it with FileWriter.

Prepared for future automatic reading from a file in later versions.

Interactive Menu
Improved console menu:

Step-by-step account loading with confirmation.

Options protected with PIN validation.

Access to a list of all accounts or by type.

Ability to delete or view accounts.

Modularization: The menu is encapsulated in a MenuBanco class.
