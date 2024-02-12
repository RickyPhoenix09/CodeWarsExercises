
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;

/*Count the number of Duplicates
Write a function that will return the count of distinct case-insensitive alphabetic characters and
numeric digits that occur more than once in the input string. The input string can be assumed to 
contain only alphabets (both uppercase and lowercase) and numeric digits.

Example
"abcde" -> 0 # no characters repeats more than once
"aabbcde" -> 2 # 'a' and 'b'
"aabBcde" -> 2 # 'a' occurs twice and 'b' twice (`b` and `B`)
"indivisibility" -> 1 # 'i' occurs six times
"Indivisibilities" -> 2 # 'i' occurs seven times and 's' occurs twice
"aA11" -> 2 # 'a' and '1'
"ABBA" -> 2 # 'A' and 'B' each occur twice
*/

public class CountingDuplicates {
    public static int duplicateCount(String text) {
    // Write your code here
    HashMap<Character, Integer> repeated = new HashMap<>();
    String alphabet = "abcdefghijklmnopqrstuvwxyz";
    List<Character> textList = new ArrayList<>();
    List<Character> alphaList = new ArrayList<>();
    List<Character> repeatedList = new ArrayList<>();

    char ch;
    int t = 0;
    
    text.chars().forEach(y -> textList.add(Character.valueOf((char) y)));
    alphabet.chars().forEach(x -> alphaList.add(Character.valueOf((char) x)));
    repeatedList = alphaList.stream().filter(y-> textList.contains(y)).collect(Collectors.toMap(keyMapper, valueMapper));
        

        /*
        repeatedList = alphaList.stream().filter(element -> 
        textList.contains(element)).collect(Collectors.toMap(keyMapper, valueMapper));
        
        for(ch = 'A'; ch <= 'Z'; ++ch){
            repeated.put(ch, 0);
            t = t++;
        }*/
        System.out.println(repeated);
        return t;
    }

    public static void main(String[] args){
        int cuenta = duplicateCount("abcdea");
        System.out.println("Cuenta: " +cuenta);
    }

}