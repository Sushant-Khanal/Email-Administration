# Email Application

## Project Overview

This project is a Java-based Email Application designed for IT Support Administrators to create and manage email accounts for new employees.

The system automatically:
- Generates company email addresses
- Assigns departments
- Generates random passwords
- Allows password modification
- Supports alternate email addresses
- Manages mailbox capacity
- Displays employee account information

---

# Scenario

You are an IT Support Administrator Specialist and are charged with creating email accounts for new hires.

The application should:

- Generate an email with the following syntax:

firstname.lastname@department.mycompany.com

- Determine the department:
  - Sales
  - Development
  - Accounting
  - Staff (default)

- Generate a random password

- Provide methods to:
  - Change password
  - Set mailbox capacity
  - Set alternate email address

- Provide getter methods to:
  - Get mailbox capacity
  - Get alternate email
  - Get password
  - Get first name
  - Get last name
  - Get department

- Display:
  - Employee name
  - Company email
  - Mailbox capacity

---

# Project Structure

emailapp/
│
├── Email.java
├── EmailApp.java
└── README.md

---

# Java Files Description

## 1. Email.java

This is the main class responsible for handling employee email account creation and management.

### Responsibilities
- Store employee information
- Generate company email addresses
- Generate random passwords
- Assign departments
- Manage mailbox capacity
- Manage alternate email addresses
- Change passwords
- Display employee account information

---

## 2. EmailApp.java

This is the driver class containing the `main()` method.

### Responsibilities
- Create Email objects
- Call methods from Email class
- Display generated employee information

---

# Features

## Email Generation

The application generates emails in the format:

firstname.lastname@department.mycompany.com

### Example

Employee Name:
Sushant Khanal

Department:
Development

Generated Email:
sushant.khanal@dev.mycompany.com

---

## Department Selection

Users select a department using department codes:

| Code | Department |
|------|-------------|
| 1 | Sales |
| 2 | Development |
| 3 | Accounting |
| 0 | Staff |

---

## Random Password Generation

The application automatically generates a random password using:
- Uppercase letters
- Numbers
- Special characters

Example:
AB12@CD34#

---

# Methods Used

## Set Methods

| Method | Description |
|--------|-------------|
| `setMailboxCapacity(int capacity)` | Sets mailbox capacity |
| `setAlternateEmail(String altEmail)` | Sets alternate email |
| `changePassword(String password)` | Changes account password |

---

## Get Methods

| Method | Description |
|--------|-------------|
| `getMailboxCapacity()` | Returns mailbox capacity |
| `getAlternateEmail()` | Returns alternate email |
| `getPassword()` | Returns generated password |
| `getFirstName()` | Returns employee first name |
| `getLastName()` | Returns employee last name |
| `getDepartment()` | Returns employee department |

---

## Other Important Methods

| Method | Description |
|--------|-------------|
| `setDepartment()` | Assigns employee department |
| `randomPassword(int length)` | Generates random password |
| `showInfo()` | Displays employee information |

---

# OOP Concepts Used

| Concept | Usage |
|---------|------|
| Class | Email and EmailApp |
| Object | Employee email account |
| Encapsulation | Private variables with public methods |
| Constructor | Initializes employee details |
| Methods | Performs email operations |

---

# Technologies Used

- Java
- Object-Oriented Programming (OOP)
- Scanner Class
- Random Password Generation

---

# How to Run the Project

### Step 1: Open Project in VS Code
Open the project folder in Visual Studio Code.
---
### Step 2: Open Terminal
Go to:
Terminal → New Terminal
---
### Step 3: Compile the Java Files
Run the following command:
```bash
javac emailapp/*.java
```
(This compiles all Java files inside the emailapp package.)
### Step 4: Run the Application:
Run:
```bash
java emailapp.EmailApp
```
---
---
Author

Sushant Khanal
---
---                                 
