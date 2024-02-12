

/* * 
 * Complete the method/function so that it converts dash/underscore delimited words into camel casing. 
 * The first word within the output should be capitalized only if the original word was capitalized 
 * (known as Upper Camel Case, also often referred to as Pascal case). 
 * The next words should be always capitalized.

Examples
"the-stealth-warrior" gets converted to "theStealthWarrior"
*/

public class Solution {

    static String toCamelCase(String s){
        String[] pieces = s.split("[-_]");
        int i = 0;
        String str = "";
        if(s.length() != 0){
            for(String p :pieces){
                //System.out.println(p);
                char charInicial = p.charAt(0);
                if(i != 0){
                    char v = p.toUpperCase().charAt(0);
                    //System.out.println(lastChar);
                    p = p.replaceFirst(String.valueOf(charInicial), String.valueOf(v));
                }            
                i++;
                str = str.concat(p);
            }            
        }
        return str;
    }
    
    /*
     *   static String toCamelCase(String str){
            String[] words = str.split("[-_]");
            return Arrays.stream(words, 1, words.length)
            .map(s -> s.substring(0, 1).toUpperCase() + s.substring(1))
            .reduce(words[0], String::concat);
        }
     */
    public static void main(String[] args) {
        String input = "";
        String output = toCamelCase(input);
        System.out.println(output);
    }
}
