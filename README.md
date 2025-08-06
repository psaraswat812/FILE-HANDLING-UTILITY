# FILE-HANDLING-UTILITY
COMPANY : CODETECH IT SOLUTIONS
NAME : PURANJAY SARASWAT
INTERN ID : CT04DZ1931
DOMAIN : JAVA PROGRAMMING 
DURATION : 4 WEEKS
MENTOR: NEELA SANTOSH

DESCRIPTION : Java File Handling Program Description (500+ words)
---------------------------------------------------

This Java program, part of the package `JavaTasks.Task1`, introduces a class called `FileHandler` which demonstrates essential file handling operations using Java’s standard I/O classes. These operations include writing to a file, appending data to a file, and reading from a file. These are commonly used techniques in many software applications that need to work with external data storage.

The class consists of three main static methods: `writeToFile`, `appendToFile`, and `readFromFile`. Additionally, there is a `main` method which acts as the testing ground for these three functions.

1. **writeToFile(String filename, String content):**
   This method is responsible for creating a new file or overwriting an existing file with the specified content. The method utilizes the `FileWriter` class, which provides a simple way to write character data to a file. By default, `FileWriter` opens the file in overwrite mode. The file is closed after writing to ensure no system resources are leaked. Error handling is done using a `try-catch` block to catch any `IOException` that may occur during the operation. If an exception arises, the user is notified through a meaningful message printed on the console.

2. **readFromFile(String filename):**
   This method reads the content of the given file line by line. It uses the `Scanner` class along with a `File` object to achieve this. The method reads each line using the `hasNextLine()` method of the `Scanner` class inside a loop and prints it to the console. After reading, the scanner is closed to free up resources. If the file does not exist or the path is incorrect, a `FileNotFoundException` is caught and an error message is displayed. This ensures that the program does not crash and informs the user about the missing file gracefully.

3. **appendToFile(String filename, String newData):**
   This method allows the program to append additional data to the end of an existing file. It again uses the `FileWriter` class, but this time it passes `true` as the second argument to the constructor. This enables append mode rather than overwrite mode. A newline character is added before the new content to keep formatting clean and organized. The writer is closed after the operation to prevent resource leakage. Any I/O exception encountered is caught and handled with a user-friendly message.

4. **main(String[] args):**
   The `main` method is the entry point for the program. It performs three operations in sequence to demonstrate the functionality of the above methods. First, it writes an initial message to `sample.txt` using `writeToFile`. Then, it appends another line using `appendToFile`. Finally, it reads the entire content of the file using `readFromFile` and displays it on the console. This step-by-step demonstration showcases a real-world usage pattern for file handling.

Overall, the program is designed to be beginner-friendly and educational. It makes use of simple syntax, consistent structure, and explanatory comments to help users understand the flow. The use of meaningful console output (including emojis) adds to user interaction and clarity. This code lays a strong foundation for understanding file handling in Java, which is essential for applications like log processing, data storage, configuration management, and more.
