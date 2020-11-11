# CodeDebugging
Starter project for debugging code challenges locally

## Table of contents
* [Setup](#setup)
* [Explanation of Classes](#explanation-of-classes)
* [How to Use](#how-to-use)
* [Status](#status)

## Setup
This is targeted for people who are new [Maven](https://maven.apache.org/) and/or Java and wish to debug code challenges locally.

To build it, you will need to download and unpack the latest (or recent) version of Maven (https://maven.apache.org/download.cgi) and put 
the `mvn` command on your path.

Then, you will need to install a Java 1.8 (or higher) JDK (not JRE!), and make sure you can run `java` from the command line. Now you can run 
`mvn clean install` and Maven will compile your project, an put the results it in a jar file in the `target` directory.

How you run this code is up to you, some great IDEs are: [NetBeans](https://netbeans.org/), [Intellij IDEA](https://www.jetbrains.com/idea/), or [Eclipse](https://eclipse.org/ide/).

The Maven dependencies may lag behind the official releases a bit.

## Explanation of Classes
`Program` should be replaced with whatever code challenge or kata you are trying to solve.

`ProgramTest` is a class for testing your Program code. It's purpose is (you might have guessed it) test method(s) within 
`Program`. You may copy and paste any existing tests here. An additional use case is using this class for Test Driven Development (TDD) and 
writing tests as you go. Writing code using TDD is a great skill to strengthen, especially as you are learning to develop code.

`Main` is a class for passing in custom arguments. I don't advise testing your code here, but the option is there in case you 
want to test a quick scenario.

## How to Use
Once your code has been written, you may run `ProgramTest` to see which tests are currently passing or failing. Debug  as needed to solve
your respective kata.

## Status
Project is: _in progress_.
If you notice any problems with this setup, would like to improve this README.md file, or have suggestions for improvements, please open an issue. This 
was a project I created quickly for personal use, but I am open to feedback.
