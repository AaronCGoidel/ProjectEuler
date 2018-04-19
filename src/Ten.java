/*
The sum of the primes below 10 is 2 + 3 + 5 + 7 = 17.

Find the sum of all the primes below two million.
 */
public class Ten
{
    public static void main(String[] args)
    {
        long sum = 2; // start total at 2 since it is the only even prime
        for(int num = 3; num < 2000000; num+=2){ // start at 3 and increment by 2 to avoid all even numbers
            if(Seven.isPrime(num)){ // borrowing the prime checker method from problem 7
                sum += num;
            }
        }
        System.out.println(sum);
    }
}
