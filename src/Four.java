/*
A palindromic number reads the same both ways. The largest palindrome made from the product of two 2-digit numbers is 9009 = 91 × 99.

Find the largest palindrome made from the product of two 3-digit numbers.
 */

public class Four
{
    public static boolean isPalindrome(int n)
    {
        String stringCast = String.valueOf(n);
        return stringCast.equals(new StringBuilder(stringCast).reverse().toString());
    }

    public static void main(String[] args)
    {

        int largestPalindrome = 0;
        int min = 100;
        int max = 999;

        for(int i = max; i >= min; i--){
            if(largestPalindrome >= i * max){
                break;
            }
            for(int j = max; j >= i; j--){
                int product = i * j;
                if(largestPalindrome < product && isPalindrome(product)){
                    largestPalindrome = product;
                }
            }
        }
        System.out.println(largestPalindrome);
    }

}
