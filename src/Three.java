/*
The prime factors of 13195 are 5, 7, 13 and 29.

What is the largest prime factor of the number 600851475143 ?
 */

public class Three
{
    public static void main(String[] args)
    {
        long n = 600851475143L; // value to find largest prime factor of (note: the L is needed for long literals)
        int factor = 0;
        for(int i = 2; i <= n; i++){ // start at 2 since 1 causes an infinite loop
            while(n % i == 0){
                factor = i;
                n = n / i;
            }
        }
            System.out.println(factor);
    }
}
