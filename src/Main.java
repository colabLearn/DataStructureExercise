
public class Main {
    public static void main(String[] args) {

        /*
         * Test implementation of numOfOccurence in Main
         */
        String [] input = {"1","1","1","1","3","4","5","6","7","7","7","8","8"};
        DSA_Exercise.numberOfOccurence(input);

        /*
        * Output of DSA_Exercise.numberOfOccurence(input);
        * 1: 4
        * 3: 1
        * 4: 1
        * 5: 1
        * 6: 1
        * 7: 3
        * 8: 2
         */

        /*
        * Test implmentmentation of mostNumOfOccurence in Main
        * This should return 1 as this is most number of occrence iin the array
         */
        System.out.println(DSA_Exercise.mostNumOfOccurence(input));

        /*
        * Output of - System.out.println(DSA_Exercise.mostNumOfOccurence(input));
        *  1
         */

        //Creating and initializing String parenthesis
        String par1 = "([[]])";
        String par2 = "{[[{()}]]";
        System.out.println(DSA_Exercise.parenthesisChecker(par1));
        System.out.println(DSA_Exercise.parenthesisChecker(par2));

        /*
        * Output of:  System.out.println(DSA_Exercise.parenthesisChecker(par1));
        *             System.out.println(DSA_Exercise.parenthesisChecker(par2));
        * true
        * false
         */
    }
}