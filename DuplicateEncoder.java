

/*
 * The goal of this exercise is to convert a string to a new string where each character 
 * in the new string is "(" if that character appears only once in the original string, or ")" 
 * if that character appears more than once in the original string. 
 * Ignore capitalization when determining if a character is a duplicate.
 */

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class DuplicateEncoder {
	static String encode(String word){
        int[] words = word.chars().toArray();
        List newOut = new ArrayList<>();

        Arrays.stream(words,0,words.length).forEach((val) -> {
            System.out.println("comparador: " + val);
            int i = 0;
            Arrays.stream(words).forEach(value -> {
                System.out.println("  comparado: "+ value);
                int j = i;
                if(value == val){
//                    System.out.println(value + " ==" +  val);
                    j++;
                }
                //System.out.println(j);
            });                
            //String.valueOf(val).equals(words);
            //return Arrays.stream(words).equals(val);
        });
        //System.out.println(Arrays.toString(words));
    return word;
  }


  public static void main(String[] args) {
    encode("Success");
  }

}
