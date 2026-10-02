Java DSA Placement Practice 🚀

Java Skill Enhancement – 20 Programs

This repository contains 20 Java programs based on LeetCode-style problems. The programs cover numbers, conditions, loops, binary operations, and strings.

---

🛠️ Technologies Used

- Java
- Scanner
- Conditional Statements
- For Loop
- While Loop
- String
- StringBuilder
- Character Methods
- Mathematical Operations
- Binary Operations

---

📚 Programs

1. Fizz Buzz

Description

Print numbers from "1" to "n".

- Multiples of "3" → "Fizz"
- Multiples of "5" → "Buzz"
- Multiples of both "3" and "5" → "FizzBuzz"

Sample Input

15

Sample Output

1 2 Fizz 4 Buzz Fizz 7 8 Fizz Buzz 11 Fizz 13 14 FizzBuzz

How to Run

javac Problem01_FizzBuzz.java
java Problem01_FizzBuzz

---

2. Palindrome Number

Description

Check whether a number reads the same forward and backward.

Sample Input

121

Sample Output

true

How to Run

javac Problem02_PalindromeNumber.java
java Problem02_PalindromeNumber

---

3. Add Digits

Description

Repeatedly add all the digits of a number until only one digit remains.

Sample Input

38

Sample Output

2

How to Run

javac Problem03_AddDigits.java
java Problem03_AddDigits

---

4. Number of 1 Bits

Description

Count the number of "1" bits in the binary representation of a positive integer.

Sample Input

11

Sample Output

3

How to Run

javac Problem04_NumberOf1Bits.java
java Problem04_NumberOf1Bits

---

5. Count the Digits That Divide a Number

Description

Count how many digits of a number divide the original number exactly. The digit "0" is ignored.

Sample Input

1248

Sample Output

4

How to Run

javac Problem05_CountDigitsThatDivide.java
java Problem05_CountDigitsThatDivide

---

6. Number of Steps to Reduce a Number to Zero

Description

Reduce a number to zero using these rules:

- If the number is even, divide it by "2".
- If the number is odd, subtract "1".
- Count the total number of steps.

Sample Input

14

Sample Output

6

How to Run

javac Problem06_NumberOfStepsToZero.java
java Problem06_NumberOfStepsToZero

---

7. Find Common Factors

Description

Given two positive integers, count the positive integers that are factors of both numbers.

Sample Input

12 6

Sample Output

4

How to Run

javac Problem07_FindCommonFactors.java
java Problem07_FindCommonFactors

---

8. Count Digits That Divide a Number

Description

Count the non-zero digits of a number that divide the original number without a remainder.

Sample Input

1012

Sample Output

3

How to Run

javac Problem08_CountDigitsThatDivide.java
java Problem08_CountDigitsThatDivide

---

9. Add Binary

Description

Add two binary numbers represented as strings and print the result as a binary string.

Sample Input

1010 1011

Sample Output

10101

How to Run

javac Problem09_AddBinary.java
java Problem09_AddBinary

---

10. Convert Binary Number to Integer

Description

Convert a binary number represented as a string into its decimal integer value.

Sample Input

10110

Sample Output

22

How to Run

javac Problem10_BinaryToInteger.java
java Problem10_BinaryToInteger

---

🔤 String Programs

11. Reverse String

Description

Reverse the characters of a given string.

Sample Input

hello

Sample Output

olleh

How to Run

javac Problem11_ReverseString.java
java Problem11_ReverseString

---

12. Length of Last Word

Description

Find the length of the last word in a string containing words separated by spaces.

Sample Input

Hello World

Sample Output

5

How to Run

javac Problem12_LengthOfLastWord.java
java Problem12_LengthOfLastWord

---

13. Longest Common Prefix

Description

Find the longest common prefix shared by all strings.

Sample Input

flower flow flight

Sample Output

fl

How to Run

javac Problem13_LongestCommonPrefix.java
java Problem13_LongestCommonPrefix

---

14. Valid Palindrome

Description

Check whether a string is a palindrome after:

1. Converting uppercase letters to lowercase.
2. Removing non-alphanumeric characters.

Sample Input

A man, a plan, a canal: Panama

Sample Output

true

How to Run

javac Problem14_ValidPalindrome.java
java Problem14_ValidPalindrome

---

15. Detect Capital

Description

Check whether a word uses capital letters correctly.

Valid cases:

- All letters are uppercase.
- All letters are lowercase.
- Only the first letter is uppercase.

Sample Input

USA

Sample Output

true

How to Run

javac Problem15_DetectCapital.java
java Problem15_DetectCapital

---

16. Reverse Prefix of Word

Description

Reverse the part of a word from the beginning through the first occurrence of a given character.

If the character does not exist, the original word is printed.

Sample Input

abcdefd d

Sample Output

dcbaefd

How to Run

javac Problem16_ReversePrefixOfWord.java
java Problem16_ReversePrefixOfWord

---

17. Check If Two String Arrays are Equivalent

Description

Concatenate all strings in each array and check whether both resulting strings are equal.

Example

["ab", "c"]
["a", "bc"]

Output

true

How to Run

javac Problem17_StringArraysEquivalent.java
java Problem17_StringArraysEquivalent

---

18. Goal Parser Interpretation

Description

Interpret the following commands:

Command| Result
"G"| "G"
"()"| "o"
"(al)"| "al"

Sample Input

G()(al)

Sample Output

Goal

How to Run

javac Problem18_GoalParser.java
java Problem18_GoalParser

---

19. Defanging an IP Address

Description

Given a valid IPv4 address, replace every "." with "[.]".

Sample Input

1.1.1.1

Sample Output

1[.]1[.]1[.]1

How to Run

javac Problem19_DefangingIPAddress.java
java Problem19_DefangingIPAddress

---

20. To Lower Case

Description

Convert all uppercase English letters in a string to lowercase.

Sample Input

Hello

Sample Output

hello

How to Run

javac Problem20_ToLowerCase.java
java Problem20_ToLowerCase

---

▶️ How to Run the Programs

Step 1 – Install Java

Check whether Java is installed:

java -version

Check the Java compiler:

javac -version

Step 2 – Clone the Repository

git clone YOUR_GITHUB_REPOSITORY_URL

Move into the project directory:

cd Java-Skill-Enhancement

Step 3 – Compile a Program

For example:

javac Problem01_FizzBuzz.java

Step 4 – Run the Program

java Problem01_FizzBuzz

Step 5 – Run Other Programs

Change the filename according to the problem:

javac Problem02_PalindromeNumber.java
java Problem02_PalindromeNumber

---

📂 Project Structure

Java-Skill-Enhancement/
│
├── README.md
│
├── Problem01_FizzBuzz.java
├── Problem02_PalindromeNumber.java
├── Problem03_AddDigits.java
├── Problem04_NumberOf1Bits.java
├── Problem05_CountDigitsThatDivide.java
├── Problem06_NumberOfStepsToZero.java
├── Problem07_FindCommonFactors.java
├── Problem08_CountDigitsThatDivide.java
├── Problem09_AddBinary.java
├── Problem10_BinaryToInteger.java
├── Problem11_ReverseString.java
├── Problem12_LengthOfLastWord.java
├── Problem13_LongestCommonPrefix.java
├── Problem14_ValidPalindrome.java
├── Problem15_DetectCapital.java
├── Problem16_ReversePrefixOfWord.java
├── Problem17_StringArraysEquivalent.java
├── Problem18_GoalParser.java
├── Problem19_DefangingIPAddress.java
└── Problem20_ToLowerCase.java

---

🎯 Learning Objectives

Through these 20 programs, the following Java concepts are practiced:

- Variables and data types
- User input using "Scanner"
- "if-else" statements
- "for" loops
- "while" loops
- Mathematical operations
- Digit manipulation
- Binary number operations
- String manipulation
- "StringBuilder"
- Character methods
- String comparison
- String replacement
- Basic problem-solving

---

⭐ If this repository helps you, consider giving it a star!
