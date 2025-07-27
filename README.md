# Java Class Task – Student Management System

This repository contains Java programs created as part of a class assignment.  
It demonstrates fundamental programming concepts (access modifiers, control statements, data operations, data types, and input/output) in both **individual examples** and as a **combined system**.

---

## 📂 Files Overview

### 1. `AccessModifiersExample.java`
- Demonstrates the use of `private`, `public`, and `protected` access modifiers.
- Implements a simple student data class where fields are private, and getters/setters are used to manage access.

### 2. `ControlStatementsExample.java`
- Shows the use of `if-else` statements and loops.
- Classifies student grades (A, B, C, Fail) based on average marks.

### 3. `DataOperationsExample.java`
- Contains methods to perform basic data operations such as calculating the average of an array of marks.

### 4. `DataTypes.java`
- Demonstrates different Java data types (`int`, `double`, `char`, `boolean`).
- Prints student information using various data types.

### 5. `InputOutput.java`
- Handles user input using `Scanner`.
- Collects basic student details from the user.

### 6. `MainProgram.java`
- Integrates all the above functionalities into a **single Student Management System**:
  - Takes user input (name, age, marks).
  - Calculates average marks.
  - Determines grade category.
  - Displays student details (with correct access control).

---

## ▶️ How to Compile and Run

1. **Compile all files:**
   ```bash
   javac *.java

2. **Run individual programs:**
   ```bash
   java AccessModifiersExample
   java ControlStatementsExample
   java DataOperationsExample
   java DataTypes
   java InputOutput
3. **Run the full system:**
```bash
  java MainProgram
```
## ✅ Purpose
- This project is intended to:
- Demonstrate basic Java programming concepts.
- Show how independent modules can be combined into one cohesive system.
- Serve as a reference for understanding class structures, methods, and modular code organization.
  
## 👩‍🏫 Notes
- Each file is self-contained and can be executed independently.
- MainProgram.java serves as the integrated application.
- Code is kept simple for educational clarity rather than production optimization.
