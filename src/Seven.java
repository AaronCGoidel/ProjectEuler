/*
By listing the first six prime numbers: 2, 3, 5, 7, 11, and 13, we can see that the 6th prime is 13.

What is the 10 001st prime number?
 */
public class Seven
{
    public static boolean isPrime(int num)
    {
        for(int i = 2; i < (int) Math.sqrt(num) + 1; i++){ // check if the number is divisible by the numbers through its sqrt + 1
            if(num % i == 0){
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args)
    {
        int max = 10001;
        int count = 1; // we can start counting at 1 because we know 2 is the first prime
        int check = 2; // start with 2

        while(count < max){
            check++; // increment number to test
            if(isPrime(check)){ // if the current number is a prime increment number of primes we found
                count++;
            }
        }
        System.out.println(check);
    }
}
