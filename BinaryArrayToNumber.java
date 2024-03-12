
/*
Given an array of ones and zeroes, convert the equivalent binary value to an integer.
Eg: [0, 0, 0, 1] is treated as 0001 which is the binary representation of 1.

Examples:
Testing: [0, 0, 0, 1] ==> 1
Testing: [0, 0, 1, 0] ==> 2
Testing: [0, 1, 0, 1] ==> 5
Testing: [1, 0, 0, 1] ==> 9
Testing: [0, 0, 1, 0] ==> 2
Testing: [0, 1, 1, 0] ==> 6
Testing: [1, 1, 1, 1] ==> 15
Testing: [1, 0, 1, 1] ==> 11
*/
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class BinaryArrayToNumber {

    public static int ConvertBinaryArrayToInt(List<Integer> binary) {
        // Your Code

        binary.stream().findAny().equals(1);
        String k = Arrays.toString(binary.toArray());
        System.out.println(k);
        boolean si = k.startsWith("[1");
        System.out.println("si: " + si);
        System.out.println(Arrays.toString(binary.toArray()));

        int indice = Arrays.binarySearch(binary.toArray(), 1);
        System.out.println("indice: " + indice);

        int a = 1;
        return a;
    }

    public static void main(String[] args) {
        List<Integer> binary = new ArrayList<>(Arrays.asList(1, 0, 1, 1));
        ConvertBinaryArrayToInt(binary);
    }

}