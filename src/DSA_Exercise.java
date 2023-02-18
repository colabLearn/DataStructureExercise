import java.util.HashMap;
import java.util.Map;

public class DSA_Exercise {
    /*
     * Exercise 1:
     * Given the following array of strings. String[] input = {1,1,1,1,3,4,5,6,7,7,7,8,8}
     * Find the number of occurrences of each element
     * Your method should return something like the following:
     * {
     *     "1": 4,
     *     "3": 1,
     *     "4": 1,
     *     "5": 1,
     *     "6": 1,
     *     "7": 3,
     *     "8": 2
     * }
     */

    /*
     * Exercise 1 Solution:
     * Chat Gpt Questions:
     * 1. How to get value with key in java Map
     * 2. How to get if a key is in Map already
     *
     */


    public static void numberOfOccurence(String [] input){
        Map<String, Integer> myMap = new HashMap<>();
        for (String s : input) {
            if(myMap.containsKey(s)){
                myMap.put(s, myMap.get(s)+1);
            }else{
                myMap.put(s, 1);
            }
        }

       for (String Key: myMap.keySet()){
           System.out.printf("%s: %s \n", Key, myMap.get(Key));
       }

    }
}
