/*
A Pythagorean triplet is a set of three natural numbers, a < b < c, for which,

a^2 + b^2 = c^2
For example, 3^2 + 4^2 = 9 + 16 = 25 = 5^2.

There exists exactly one Pythagorean triplet for which a + b + c = 1000.
Find the product abc.
 */

public class Nine
{
    /*
    I also solved this one with some "cheat-y" math instead of having the computer brute force it
     */
    public static void main(String[] args)
    {
        // this whole algorithm is based on Euclid's formula for generating pythagorean triples
        int total = 1000; // the sum we are trying to make
        int m = (int) Math.sqrt(total/2);
        int n, a, b, c;

        for(; m > 0; m--){
            n = (int) (total/2 - Math.pow(m, 2))/m;
            if(n < m && 2 * m * (m + n) == total){
                a = (m * m) - (n * n);
                b = 2 * m * n;
                c = (m * m) + (n * n);
                System.out.println("a: " + a + ", b: " + b + ", c: " + c);
                System.out.println(a * b * c);
            }
        }
    }
}
