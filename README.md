# Lab 1
Introduction to Java Programming
# 1. Compulsory (1p)
1. [x] Write a Java application that implements the following operations:
2. [x] Display on the screen the message "Hello World!". Run the application. If it works, go to step 2 :) Define an array of strings languages, containing {"C", "C++", "C#", "Python", "Go", "Rust", "JavaScript", "PHP", "Swift", "Java"}
3. [x]  Generate a random integer n: int n = (int) (Math.random() * 1_000_000);
4. [x]  Compute the result obtained after performing the following calculations:
5. [x]  multiply n by 3;
6. [x]  add the binary number 10101 to the result;
7. [x]  add the hexadecimal number FF to the result;
8. [x]  multiply the result by 6;
9. [x]  Compute the sum of the digits in the result obtained in the previous step. This is the new result. While the new result has more than one digit, continue to sum the digits of the result.
10. [x]  Display on the screen the message: "Willy-nilly, this semester I will learn " + languages[result].
# Homework (2p)

1. [x] Let n be an integer given as a command line argument. Validate the argument!
2. [x] Create a n x n Latin Square as a matrix, having as symbols numbers from 1 to n.
3. [x] For each line, and each column of the matrix, create and display on the screen String objects representing the concatenation of the symbols in the respective line or column.
4. [x] For larger n display ONLY the running time of the application in nanoseconds or milliseconds. Try n > 30_000. You might want to adjust the JVM Heap Space using the VM options -Xms4G -Xmx4G.
5. [x] Launch the application from the command line, for example: java Lab1 9.
# Bonus (2p)
1. [ ] Create the adjacency matrix A of a cycle graph Cn and compute the powers A2, A3, .... An. Give an interpretation of the result.
2. [ ] Create the adjacency matrix of a regular graph. The number of vertices and the vertex degree are given as arguments.
# Notes
Create a new project for each laboratory. In a project, create at least one package. Create classes as necessary, do not use the same class for unrelated tasks. Each class must contain the name(s) of the author(s) as a comment.
Please consult the API documentation to learn more information about the classes and methods used!
Write code faster using keyboard shortcuts.
Resources

Slides
Download JDK
Download Netbeans or other Java IDE.
Language Basics
Numbers and Strings
NetBeans IDE Java Quick Start Tutorial
Objectives

Get used with an integrated development environment (IDE): Netbeans.
Get used with the Java language syntax.
Create and run a simple application.
Understand the following concepts: compiler, interpreter, byte-code, Java Virtual Machine (JVM), portability.
Use the Unicode alphabet and Java special characters.
Work with primitive data types and strings (String, StringBuilder).
Work with one- and multi-dimensional arrays.
Parse command line arguments.
Perform conversions between strings and numbers.
Split a string into tokens.
Generate random numbers.
Create multiple methods in the main class of the application.