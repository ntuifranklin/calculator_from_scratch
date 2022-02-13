## New Update 2022

## **Guide to build a Simple Command-Line Calculator in Java.**

The instructions will describe step by step how to build a calculator in Java. The

instructions are meant for students studying computer science or any related field at the

University of Maryland. These instructions assume the student took CMSC131 and/or

CMSC132. CMSC131/132 are titled Object-Oriented Programming I, and II, respectively.

These instructions use the knowledge learned from the two above courses to complete the

project. It is intended to show how to use the skills learned in these two courses to build a useful

tool in real life.

As a computer science student, I noticed that most of my friends and classmates who

study computer science have difficulty getting an internship. This is very tied to not having

enough programming projects on their resume to show to potential employers. Most of the

projects done at school are prohibited from being posted online. It is convincing to show a

project you completed by yourself on your resume. It is even more convincing if the project is

posted on GitHub for potential employers to see.

In these instructions, you will build a Calculator from scratch.

## **Warnings/Caution**

The code used to complete the project is not certified to be completely free of errors. You

should not use the calculator as an actual calculator. The project is just meant to show how to

build a project step by step. To use the project as an actual calculator, you need to thoroughly test

the program with multiple test inputs.





## **Technical Background**

\- The instructions assume the students have taken either CMSC131 or CMSC132. Any

student who have taken an entry level Java Programming course should be able to follow

the instructions.

\- It also assumes the student knows how to program in Java. It also assumes the student has

a basic understanding of the command line, and how to compile and run java programs.

\- It also assumes the user knows how to use the ***vim*** utility available on Mac and Linux

## **Materials**

You need a laptop or desktop with an Operating System installed. It could be Windows, Mac, or

Linux. Your laptop/desktop needs a Random-Access Memory (RAM) of at least 4 Gigabytes

(GB). Preferably 8GB and above. You need a hard drive of at least 1 GB of free space. Most

laptops or desktops that were manufactured in the last 5 years should the job be perfectly fine.

## **Steps in building the calculator**

The instructions will be subdivided into the following sections:

### ** 1. Download and the Java compiler Software.**

Visit the website [Oracle](https://www.oracle.com/java/technologies/downloads/)[ ](https://www.oracle.com/java/technologies/downloads/)[Java](https://www.oracle.com/java/technologies/downloads/)[ ](https://www.oracle.com/java/technologies/downloads/)[Compiler](https://www.oracle.com/java/technologies/downloads/). Based on the operating system installed on your

computer, choose the software that matches your operating system. Download it and place it

somewhere on your pc. I downloaded and placed it in the ***/Users/franklin/java*** directory

### **2. Install the Java Compiler**
Most often, the compiler is compressed into a zip file or any popular compression format.

Extracting the compressed file into your computer allows you to start compiling java code

instantly. After the compiler has been extracted, you can already start compiling java programs.

But there is a hiccup: Every time you want to compile a java program you have written;

you will have to tell the computer the location of the compiler. This means you must give the

computer the absolute location of the compiler. Absolute means starting from the root directory,

down all subdirectories all the way to the compiler. This is tedious. Too much typing will be

needed depending on where the compiler is located.

However, there is a simple solution. Place the location of the compiler where the computer can

easily see it. Then just call the compiler whenever needed. This implies setting the PATH

environment variable to contain the location of the compiler.

### **3. Set the PATH environment variable of your Operating system**

Setting the path environment variable helps tell the computer where your java compiler and java

virtual machine software are located.

### **4. Setting the path on a MAC or Linux**

A file called ***.bash\_profile*** located in every logged-in user’s directory stores the content of the

***PATH*** environment variable.

We therefore need to edit the content of the ***.bash\_profile***

Open the command line and type the following command:

***vim $HOME/.bash\_profile***

This command tells the computer to tell the ***vim*** software open the ***.bash\_profile.***


The ***$HOME*** is to check the location placed in the ***HOME*** environment variable. Placing a ***$***

sign before an environment variable like ***HOME***, simply means the content of the ***HOME***

environment variable. So ***HOME*** is another environment variable that stores the location of the

current logged in user’s home directory.

Another way to do this will be to tell ***vim*** to open the ***.bash\_profile*** file by giving ***vim*** the full

location just like the screen below :

This tells ***vim*** to open the ***.bash\_profile*** file located in the ***franklin*** directory, that is in turn

located in the ***Users*** directory, that is also found in the root directory, designated by the first **/**

Every ***/*** character in between directory names, after the first **/** is used to separate directories from

each other. However, on john or peter’s computer, the ***HOME*** environment variable will not be

franklin. It could be john or doe, or any other name the user chooses. So it’s best practice to use

the ***$HOME/.bash\_profile*** to tell **vim** how to locate and change the **.bash\_profile** file on any

computer.

After typing the above command screen that looks like the below will show up:

The above screen shows that the PATH variable has a list of locations separated by colons.

Every location contains an app, software or command that you can access from any directory on

the command line. The above screen says the **PATH** variable has a **/Applications** location in it.

This means there is an ***Applications*** directory, in the root directory( designated by the first





character / ). The second says ***/usr/local/bin*** location shows that the root directory (/) has a ***usr***

directory, that contains a ***local*** directory, then a ***bin*** directory.

Now we must add a line that says the PATH environment variable now has the additional

/Users/franklin/java/bin directory.

Type ***Esc ,*** then the ***:*** character at the keyboard. Use the arrow keys to navigate to the end of the

last line of the file and press enter to go to a new line.

At the beginning of the new line, type the following:

***export PATH="$PATH:/Users/franklin/java/bin"***

This simply tells the computer to append the location **/Users/franklin/java/bin** to the current

content of **PATH** variable.

This assumes the java compiler was downloaded and placed in the location

**/Users/franklin/java**. If it was placed in a different location, then use the correct location.

Once the java compiler is installed, check by typing the command **javac –version** at the

command line. You should get a result that looks like the image below:

If you did not get the above, then the path variable was not set correctly. Repeat the above steps

carefully.

### **5. Install the Java Virtual Machine(JVM) Software**





You might or might not have the java virtual machine installed. Most computers come

with the JVM already installed by default. If it is not, you can download it from the same website

as in step 4. The JVM is a software that allows you to run the bytecode generated by the

compiler on computers with different operating systems. This means the bytecode generated

from compiling the java program, can be executed on a Windows, Linux or Mac operating

system. A bytecode is a chunk of 0s and 1s that the compiler software generates. These 0s and 1s

are instructions telling the Java Virtual Machine how to run the code you wrote flawlessly,

independent if the code was written on a Mac, a Linux, or a Windows operating system. The java

virtual machine might not be installed on your computer already. Most of the time it is not. To

check if you have a JVM, open the command line and type the command **java –version**

You should see something on the screen that looks like the screen below:

If the JVM was not installed, then follow the instructions here at

<https://www.java.com/en/download/help/mac_install.html>

### **6. Choose and Install a Source code Editor**





The source editor is a software to help you type code. It is like the Microsoft Word software you

use to type that long history paper due Sunday night at 11:59 PM. A source editor is just an

editor for code and not papers. Here we will use an editor called ***atom*** to build the calculator.

You can download and install atom by following the instructions here : [https://flight-](https://flight-manual.atom.io/getting-started/sections/installing-atom/)

[manual.atom.io/getting-started/sections/installing-atom/](https://flight-manual.atom.io/getting-started/sections/installing-atom/)

**7. Organizing the code**

Before we jump into coding, let us explain how the program will run.

When the user launches the software you wrote, the program will behave as follows :

The program will read inputs from the user say: 4 + 5.

The program will interpret this as a list of characters containing the character ***4***, the character

***space*** , the character ***+,*** and finally the character ***5***. Your program will transform the characters 4

and 5 to numbers. Then it will ***perform*** the operation ***add*** to the number ***4*** to the number ***5***.

Performing the operation is not enough. The result must be printed to the command line so you

can see the result.

If you entered the input 9 \* 3, the program should interpret just as above. It should multiply 9 by

3 and print the correct result.

The software will therefore behave as follows in the above examples:

\- Read the user’s input from the command line as a string of characters.

\- Interpret the input as performing an operation (add, subtract, multiply or divide), on two

operands.

\- Evaluate the operation





\- Print the result.

You will call the class that will run the code ***Calculator.java***

Here is a link to the source code to the Calculator.java code on GitHub [Calculator.java](https://raw.githubusercontent.com/ntuifranklin/engl393/main/Calculator.java)

Here is a screen shot of the ***main*** method

In the above screenshot we have :

\- ***keyboard*** variable from the Scanner class that is used to read input you type at the

command line. It ***scans*** whatever you type at the command line.

\- The ***operands*** and ***operators*** variables represent two separate ***Stacks*** that keep track of

the mathematical operands and operators, respectively.

\- The ***mathExpr*** variable stores the characters read from the keyboard scanner.

\- ***L*** has the length of the characters stored in the ***mathExpr*** variable.





The mathematical expression must be split into three parts: two operands and one operator.

Scanning through the inputs looking for operands and operators requires a loop. The loop will

scan through each character and check if it is an operand, or an operator. The loop could be a ***for***

loop, a ***do-while*** loop or a ***while*** loop. You will chose a ***while*** loop for the first version of your

calculator.

Below is a snippet of the while loop code:

\- The loop above loops through every character and checks if it is a ***+, -,\**** or ***/*** character,

respectively for the addition, subtraction, multiplication, and division operators.





\- It then stores the operators in a stack represented by the ***operators*** variable shown in the

first screen shot above.

\- It also checks if the number given the character is any digit between 0 and 9. If it is, then

it stores it as an operand in the ***operand*** stack declared previously in the first screen shot

above.

\- Once the operands and operators have been read, the next step is to perform the

operation.

The perform method has been defined and will be called right after the while loop:

When the while loop ends it’s run, (line 46), we take out the operator that was stored in the

operators’ stack(line 48). Then we also take out the two operands from the operands stack(line

49 and 50).

We send the operands and the operator to the ***perform*** method. The ***perform*** method simply

performs the operation and returns the result.

The below ***perform*** method receives as input the operands and operator, and performs the

operator





\- Line 60 and 61 transforms the operands from characters to numbers, precisely real

numbers.

\- Lines 64 to 72 will perform addition, subtraction, multiplication of the left and right

operand.

\- Line 73 to 85 performs the division operation.

\- Division is tricky because you cannot divide by the number 0. The computer will

complain if we attempt to divide by 0. Nothing prevents you from trying to divide by 0.

So, you need to check if the second operand of a division is not zero. If it is, the program

should say there is an error. If it is not, the program should perform the operation and

print result.





**8. Compile your Calculator.java code file**

Open the command line. Navigate to the location of the file containing the code for the

calculator. In our case the file name is ***Calculator.java***. It is found in the ***/Users/franklin***

directory.

At the command line, simply type ***javac Calculator.java***

You should have a screen that looks like this if no error was reported in the code by the

compiler:

The fact that the command went through and gave you no feedback implies the compilation went

through successfully.

**9. Run your Calculator Source Code**

Now we can run the calculator by typing ***java Calculator*** at the command line





We just evaluated 1 + 2 and the result was 3.

However instead of showing 3, it shows 3.0. We must fix that.

We can fix that by transforming every result back from real number to integer if it is not

division. Simply changed the ***perform*** method as shown below.

If the operator is a division operator (line 89) then we return the real number obtained from the

operation. If it is not (line 91), then transform it to a whole number (an integer) then return the

result.

So below is a series of 4 operations performed one after the other. Each operation requires the

calculator program to be rerun





We can also perform mathematical expressions with brackets. This is where the stacks above

will come in handy. Every time we meet a closing bracket, we assume we need to perform an

operation and store the result in the operands stack. That is the only change.

Here is an updated version of the Calculator code that considers the use of brackets:

[CalculatorUsesBrackets.java](https://github.com/ntuifranklin/engl393/blob/main/CalculatorUsesBrackets.java)

Below is a screen shot of a few math operations with brackets.

We see that our calculator performs well with brackets

**10.Test for bugs in the source code**





Below is a screenshot of a few math operations on your newly built calculator:

We see that the calculator is performing the operation backwards :

\- 3 – 2 is 1 and not –1

\- 6 / 3 is 2 and not ½

So, we are sending operands to the function that does math in the opposite way.

Let’s check everywhere the ***perform*** method is called and make sure we are giving it the

operands in the right order. We call the ***perform*** method in the while loop, and after the while

loop.





The while loop reads the characters entered left to right. It inserts the operands it reads into the

operands stack in order. But just like a stack of books, the first book you place will be at the

bottom and the last book you place will be at the top. We need to reverse the operands order.

Variables ***oper1*** needs to become ***oper2*** and vice versa.





Here is an updated version that fixes the operand order so that it performs operations in the right

order :

Line 47 and line 48 changed a bit. The order of the operands extracted from the stack changed.

The updated code will be renamed and can be downloaded here at [CalculatorUpdated.java](https://github.com/ntuifranklin/engl393/blob/main/CalculatorUpdated.java)

**11.Improve the Calculator**

Another bug is that the calculator does not perform operations on multiple digits numbers.

That can be changed. To perform operations multiple digit numbers, we must read inputs as

strings and convert them to numbers. What you would do will be to split the input line into

several strings separated by spaces. Then scan through each string and do the following:





\- If the string is an operator, then push it into the operator stack

\- If the string is a number with digits or not, then push that into the operands stack.

\- At the end of the string pop the result.

The same algorithm for the single digit calculator will work.

Here is an updated version available here [CalculatorMultipleDigits.java](https://github.com/ntuifranklin/engl393/blob/main/CalculatorMultipleDigits.java)

Below is a screenshot of some operations with multiple digits operations:

Your calculator above now accepts multiple digits operations.

\- Make the Calculator a looping program that keeps reading input from the user until the

user enters the word ***exit.*** All you must do is to move the instructions that read the line

entered by the user, in a while loop. The while loop will check that the user did not enter

the word ***exit***. If the user reads the word ***exit***, the calculator should exit.

Below are screen shots of the program :

\- Code header and declaration of variables:





\- The while loop right after the declaration:





Everything else remains unchanged.

The new calculator can be found here [CalculatorFinalVersion.java](https://github.com/ntuifranklin/engl393/blob/main/CalculatorFinalVersion.java)

**12.Upload your code to GitHub.**

All the code in this document can be found at the GitHub repository [calculator_from_scratch](https://github.com/ntuifranklin/calculator_from_scratch)

Instructions on how to upload to a GitHub repository can be found [here](https://docs.github.com/en/repositories/working-with-files/managing-files/adding-a-file-to-a-repository):

You now have a working calculator. You can download the code and test it for yourself and see

that it works.






