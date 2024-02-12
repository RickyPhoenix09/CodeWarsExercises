/*Complete the solution so that it splits the string into pairs of two characters.
If the string contains an odd number of characters then it should replace the missing 
second character of the final pair with an underscore ('_').

* 'abc' =>  ['ab', 'c_']
* 'abcdef' => ['ab', 'cd', 'ef']
*/

import java.util.*;

public class StringSplit {
    public static String[] solution(String s) {
        int slength = s.length();
        int mod = slength % 2;
        int div = slength / 2;
        String[] arrS = new String[div + 1];
        if(mod == 1){       //Array impar
            char lastChar = s.charAt(slength -1);
            String lastSubString = lastChar +"_";
            String sSubString;
            int j = 0;
            for(int i = 0; i < slength; i++){
                if(i % 2 == 0 && i != slength - 1){
                    sSubString = s.substring(i,i + 2);
                    arrS[j] = sSubString;
                    j++;
                }
                if(j == div){
                    arrS[j] = lastSubString;
                }
            }
            System.out.println(Arrays.toString(arrS));
        }else{
            
        }
        return null;
    }

    public static void main(String[] args){
        solution("HelloWorldd");
    
    
    
    }
}