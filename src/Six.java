/*
The sum of the squares of the first ten natural numbers is,
1^2 + 2^2 + ... + 10^2 = 385

The square of the sum of the first ten natural numbers is,
(1 + 2 + ... + 10)^2 = 55^2 = 3025

Hence the difference between the sum of the squares of the first ten natural numbers and the square of the sum is 3025 − 385 = 2640.

Find the difference between the sum of the squares of the first one hundred natural numbers and the square of the sum.
 */

public class Six
{
    /*
    We can cheat in this one a bit if we have some math knowledge
     */
    public static void main(String[] args)
    {
        int range = 100;

        int sumSquares; // add the numbers squared individually
        int squareSum; // square the sum of the numbers

        squareSum = (int) Math.pow((range * (range + 1))/2, 2);
        sumSquares = (range * (range + 1) * (2 * range + 1))/6;

        System.out.println(squareSum - sumSquares);
    }
}
