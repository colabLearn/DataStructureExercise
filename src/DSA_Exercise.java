import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
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

    /*
    * Exercise 2:
    * Most Number of Occurrences
    * -- Given the following array of strings. String[] input = "1,1,1,1,3,4,5,6,7,7,7,8,8";
    * -- Find the element that has the most number of occurrences
    * -- Your method should return something like the 1 since it occurs 4 times
    * -- Think about the data structure that you should use
    * -- Create a method. Think about the return type and parameters
    * -- Write unit tests for your method
    */

    public static String mostNumOfOccurence(String [] input){
        Map<String, Integer> myMap = new HashMap<>();
        for (String s : input) {
            if(myMap.containsKey(s)){
                myMap.put(s, myMap.get(s)+1);
            }else{
                myMap.put(s, 1);
            }
        }
        String most=null;
        int max = 0;
        for (String Key : myMap.keySet()){
            if(myMap.get(Key)>max){
                max = myMap.get(Key);
                most = Key;
            }
        }
        return most;
    }

    /*
    * Exercise 3
    * Parenthesis Checker Given the following inputs
    * String brackets = "[{{[(){}]}}[]{}{{(())}}]";
    * String brackets = "[{{}}[]{}{{(())}}]";
    * String brackets = "[{}{}{{()}}]";
    * String brackets = "[{}{{}}]";
    * String brackets = "[{{}}]";
    * String brackets = "[{}]";
    * String brackets = "";
    * Check if the following parenthesis are balanced. i.e
    * [] - true
    * [[] - false
    * ({[]}) - true
    * ({[}) - false
    */

    public static boolean parenthesisChecker(String parenthesis){
        Map<String, String> parMap =
                new HashMap<>();
        parMap.put("(", ")");
        parMap.put("[", "]");
        parMap.put("{", "}");
        parMap.put(")", "(");
        parMap.put("]", "[");
        parMap.put("}", "{");

        List<String> myPar = new ArrayList<>();
        String [] myChars = parenthesis.split("");
        for (String myChar : myChars) {
            if(myPar.isEmpty()){
                myPar.add(myChar);
            }else{
                if(myPar.contains(parMap.get(myChar))) {
                    myPar.remove(parMap.get(myChar));
                }else{
                    myPar.add(myChar);
                }
            }
        }
        return myPar.isEmpty();
    }
}
