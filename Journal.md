# Galactic Archive of Forbidden Spells

## Phase 1: The Casting Ritual

**Journal Prompt:**

What did you accomplish in this phase, and what do you understand about the difference between checked exceptions (classes extending `Exception`) and unchecked exceptions (classes extending `RuntimeException`)?

**Response:**

In this phase, I created a custom exception hierarchy consisting of SpellException, ManaLeakException, and FizzleException. I also created the SpellCaster class, which uses random numbers to determine whether a spell successfully casts, causes a mana leak, or fizzles. Finally, I created a Main class that attempts to cast a spell using a try-catch block.

I learned that checked exceptions must be handled using a try-catch block or declared with a throws statement. Unchecked exceptions, which extend RuntimeException, do not have this requirement. Checked exceptions are useful when an operation might encounter an expected problem that the programmer should account for, such as a failed spell casting.