package ArraysAndStrings;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Implement a method to perform basic string compression using the counts of repteated characters.
 * For example,the string aabcccccaaa would become a2b1c5a3
 * If the "compressed" string will not become smaller than the original, the method should return the original string.
 * You can assume the string has only uppercase and lowercase letters.
 */

public class Q6_StringCompression {

    public static String compressedString(String input){
        Map<Character,Integer> map = new HashMap<>();
        List<Character> listOfChars = new ArrayList<>();
        for (int i = 0; i < input.length(); i++) {
            char c = input.charAt(i);
            if(!map.containsKey(c)){
                map.put(c, 1);
            }else{
                map.put(c, map.get(c) + 1);
            }
        }
        for(Map.Entry<Character, Integer> entry : map.entrySet()) {
            int value = entry.getValue();
            listOfChars.add( entry.getKey());
            listOfChars.add((char)value);
            System.out.println("KEY: " + entry.getKey() + " VALUE: " + value);
        }
        String finalString = String.valueOf(listOfChars);
        return  finalString;
    }

    public static void main(String[] args) {
        String s = "aabcccccaaa";
        System.out.println(compressedString(s));
    }
}
