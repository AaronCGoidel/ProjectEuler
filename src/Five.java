/*
2520 is the smallest number that can be divided by each of the numbers from 1 to 10 without any remainder.

What is the smallest positive number that is evenly divisible by all of the numbers from 1 to 20?
 */

public class Five
{
    /**
     * Checks if a number is divisible by all the numbers in a range
     * @param num The number we want to check
     * @param max The largest number which we want to divide into the original number
     * @return boolean Whether or not the number is divisible by the numbers [1, max]
     */
    public static boolean check(int num, int max)
    {
        // this is not the best approach there is no need to check every single number
        for(int divisor = 1; divisor <= max; divisor++){
            if(num % divisor != 0){
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args)
    {
        int max = 20;
        int num = 20;
        while(!check(num, max)){ // keep incrementing until the number passes the test
            num += 20; // the number must be a multiple of 20 so we will increment by 20 every time
        }
        System.out.println(num);
    }
}
