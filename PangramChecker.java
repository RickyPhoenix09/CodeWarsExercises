/*
A pangram is a sentence that contains every single letter of the alphabet at least once.
 For example, the sentence "The quick brown fox jumps over the lazy dog" is a pangram, 
 because it uses the letters A-Z at least once (case is irrelevant).

Given a string, detect whether or not it is a pangram. Return True if it is, False if not. Ignore numbers and punctuation.
*/

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.stream.Collectors;

public class PangramChecker {

    public static boolean check(String sentence){

        String phraseString = sentence;
        List<Character> charStr = new ArrayList<>();
        List<Character> alphabCharStr = new ArrayList<>();
        
        phraseString.chars().forEach(y -> charStr.add(Character.valueOf((char) y)));
        HashMap<Integer, String> finalMap = new HashMap<>();
        String alphabet = "abcdefghijklmnopqrstuvwxyz";
        char[] charAplab = alphabet.toCharArray();
        List listaAlpha = Arrays.asList(charAplab);

        System.out.println(Arrays.toString(listaAlpha.toArray()));
        for(int i=0;i<listaAlpha.toArray().length;i++){
            System.out.println(listaAlpha.get(i));
        } 

        charStr.stream().forEach( y -> {
            alphabet.chars().forEach(x -> alphabCharStr.add(Character.valueOf((char)x)));

            //alphabCharStr.stream().map(mapper)
            //System.out.println(alphabCharStr);
        });
        /**/
        //System.out.println(charStr);
        //Boolean checkString = phraseString.matches("[a-zA-Z]+");
        
        List<Character> listOfAdditionalItems = alphabCharStr.stream()
            .filter(item -> !charStr.contains(item)).collect(Collectors.toList());
            
        System.out.println(listOfAdditionalItems);
        
            return false;
    }

    public static void main(String[] args){
        System.out.println(check("The quick brown fox jumps over the lazy dog."));

    }

}