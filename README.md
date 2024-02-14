# CS201_LAB01
 
## Prime Number Checker
This Java program reads a list of integers from an input file Input.txt, checks whether each number is prime or not, and writes the result to an output file Output.txt.

## Usage
Input File Format: The input file Input.txt should contain the following format:

The first line should contain an integer n representing the number of integers to check.
The subsequent n lines should contain the integers to be checked for primality.
Output File Format: The output file Output.txt will contain the result of each integer's primality check, with each result written on a separate line.

## Compile and Run:

Compile the Java program using any Java compiler.
Run the compiled program. Ensure that the input file Input.txt is in the same directory as the compiled program.
### Example
Suppose the Input.txt contains the following:

Copy code
5
2
3
4
5
6
After running the program, the Output.txt will contain:

Prime
Prime
Not Prime
Prime
Not Prime
Improvements
The program uses efficient prime checking algorithm by iterating up to the square root of the number.
Proper exception handling is implemented to gracefully handle I/O operations.
Author
This program is authored by Bora Şimşek.
