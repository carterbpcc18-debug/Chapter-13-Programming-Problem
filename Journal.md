# Galactic Archive of Forbidden Spells

## Phase 1: The Casting Ritual

**Journal Prompt:**

What did you accomplish in this phase, and what do you understand about the difference between checked exceptions (classes extending `Exception`) and unchecked exceptions (classes extending `RuntimeException`)?

**Response:**

In this phase, I created a custom exception hierarchy consisting of SpellException, ManaLeakException, and FizzleException. I also created the SpellCaster class, which uses random numbers to determine whether a spell successfully casts, causes a mana leak, or fizzles. Finally, I created a Main class that attempts to cast a spell using a try-catch block.

I learned that checked exceptions must be handled using a try-catch block or declared with a throws statement. Unchecked exceptions, which extend RuntimeException, do not have this requirement. Checked exceptions are useful when an operation might encounter an expected problem that the programmer should account for, such as a failed spell casting.

---

## Phase 2: The Safety Circle

**Journal Prompt:**

What happens to program execution when you place the try-catch block inside the loop versus wrapping the entire loop in a single try block? How does this choice affect error recovery?

**Response:**

In this phase, I updated the Main class to store five different spell names in an array and use a loop to attempt casting each spell. I also added separate catch blocks for ManaLeakException, FizzleException, and the general SpellException class.

I learned that placing the try-catch block inside the loop allows the program to handle each spell individually. If one spell fails, the exception is caught, and the loop continues to the next spell. If the entire loop were inside one try block, an exception could stop the remaining iterations. Handling exceptions inside the loop provides better error recovery because one failed operation does not prevent the others from running.

---

## Phase 3: The Eternal Ledger

**Journal Prompt:**

How did you ensure that your file stream was properly closed even when an exception occurred during writing? What are the key benefits of using try-with-resources over manual closing in a finally block?

**Response:**

In this phase, I added file-writing functionality to record every spell casting attempt in a text file named spell_log.txt. Both successful casts and failed attempts are recorded with the spell name and the corresponding result or exception.

I used a try-with-resources statement to open and close the PrintWriter automatically. This ensures that the file is properly closed even if an exception occurs. I learned that try-with-resources makes resource management easier because it automatically handles closing resources, reduces the amount of code needed, and helps prevent resource leaks compared to manually closing files in a finally block.

---

## Phase 4: Reading the Omens

**Journal Prompt:**

What did you accomplish in this phase? When reading from an external file, why does the Java compiler require you to handle FileNotFoundException or declare that it is thrown?

**Response:**

In this phase, I added a readLog method to the Main class that reads the contents of spell_log.txt line by line and displays them in the console. I also added a test using a nonexistent filename to make sure the program handles missing files without crashing.

I learned that FileNotFoundException is a checked exception because an external file might not exist or might not be accessible. Java requires the programmer to either handle this exception with a try-catch block or declare it using throws. This helps prevent unexpected program termination and makes file operations more reliable.

---

## Phase 5: Validation & Reflection

**Journal Prompt:**

What issues or edge cases did you discover while testing your program? If you reviewed your work with an AI tutor, what suggestions did it provide, and how did they help you better understand exception handling and file I/O?

**Response:**

During testing, I verified that all five spells were attempted and that the program continued running even when individual spells caused exceptions. I also confirmed that both successful and unsuccessful casting attempts were recorded in spell_log.txt. The program was able to read the casting history and display a friendly error message when attempting to read a file that did not exist.

One important detail I observed was that the spell outcomes are random, so the console output changes each time the program runs. I also learned that using try-catch blocks inside the loop prevents one failed spell from stopping the remaining attempts. Overall, this project helped me better understand custom exceptions, resource management, and how Java handles file input and output.