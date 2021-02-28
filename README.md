# Module5

Fibonacci sequence (iterative and recursive) assignment.

This simple java program prompts the user for an input (int), then runs both an iterative method of the Fibonacci sequence and a recursive method of the Fibonacci sequence using the input value as the value 'n'.

The Fibonacci sequence can be defined as a series of numbers, where any one value in the array is the sum of the previous two numbers in the array (except in the case of 0 and 1, whose respective values are 0 and 1).

One way of understanding this is as such:

previouspreviousNum (undefined), previousNum = 0, currentNum = 1

Given input n = some positive integer:

for (int i = 1; i < n; i++)
{
previouspreviousNum = previousNum;
previousNum = currentNum;
currentNum = previouspreviousNum + previousNum;
}

That is to say, if n = 7, the previous numbers (previouspreviousNum and previousNum) will iterate and become the next number in the sequence, then the current number (the next value in the array) is determined by combining those two values.
