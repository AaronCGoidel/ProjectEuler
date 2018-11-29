/*
If we list all the natural numbers below 10 that are multiples of 3 or 5, we get 3, 5, 6 and 9. The sum of these multiples is 23.

Find the sum of all the multiples of 3 or 5 below 1000.
 */

public class One
{
    public static void main(String[] args)
    {
        long sum = 0;
        int max = 1000; // maximum value
        for(int i = 3; i < max; i++){ // start at 3 because we know 0, 1, and 2 don't work
            if(i % 3 == 0 || i % 5 == 0) // check if i is a multiple of 3 or 5 (checks 3 first because there are more multiples of 3 than 5 so there is a higher chance of a short circuit)
                sum += i;
        }
        System.out.println(sum);
    }
}
