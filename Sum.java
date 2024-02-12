
/*
Given two integers a and b, which can be positive or negative, 
find the sum of all the integers between and including them and return it. 
If the two numbers are equal return a or b.
(1, 0) --> 1 (1 + 0 = 1)
(1, 2) --> 3 (1 + 2 = 3)
(0, 1) --> 1 (0 + 1 = 1)
(1, 1) --> 1 (1 since both are same)
(-1, 0) --> -1 (-1 + 0 = -1)
(-1, 2) --> 2 (-1 + 0 + 1 + 2 = 2)
*/

public class Sum {
    public static int GetSum(int a, int b) {
        int A = a;
        int B = b;
        int c = 0;
        if (a == b) {
            c = a;
        } else {
            if (a < b) {
                B = a;
                A = b;
            }
            for (int i = B; i <= A; i++) {
                System.out.println("i: " + i);
                c = c + i;
            }
        }
        return c;
    }

    /*
     * public int GetSum(int a, int b) {
     * int res = 0;
     * for (int i = Math.min(a, b); i <= Math.max(a, b); i++) {
     * res += i;
     * }
     * return a == b ? a : res;
     * }
     */

    public static void main(String[] args) {
        int C = GetSum(2, 2);
        System.out.println("Salida: " + C);
    }

}