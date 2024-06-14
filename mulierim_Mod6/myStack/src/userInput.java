import java.util.Scanner;
/**
 * This class allows the collection of user data via a Scanner.
 * methods nextLine() and split() are reused within the getUserInput() method. 
 */

public class userInput {
    /**
     * Default constructor. 
     */
    public userInput(){
        //Defualt constructor, no additional data needed.
    }
    /**
     * This method collects user data.
     * @return userNumbers
     */
    public static String[] getUserInput(){
        /**
         * Instantiate a Scanner
         */
        Scanner userInput = new Scanner(System.in);
        System.out.println("Enter a list of integers, seperated by spaces. Hit enter when finished: ");
        /**
         * Instantiate a variable userNumbers with input from user. Input is entered on one
         * line and seperated by spaces.
         */
        String[] userNumbers = userInput.nextLine().split(" ");
        userInput.close();
        return userNumbers;
    }
}
