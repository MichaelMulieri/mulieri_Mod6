import java.util.Stack;
/**
 * Class to facilitate the creation of a sorted Stack via user provided data.
 * Code reuse can be found in the sorter class and aStack class. Collections.sort() of the Collections Framework
 * is used to sort the Stack in the sorter class. myStack.push() is used to add
 * data to the Stack in the aStack class. parseInt() is also used within the aStack class.
 * 
 * The modularity of the userInput class from Mod 4's project allowed it to be reused in this weeks 
 * project without being altered in any way. The sorter class from Mod 4's project was also reused.
 * The aStack class is derived from the aList class of Mod 4's project. The data type needed to be altered 
 * to accomadate a Stack. Also myStack.push() was implemented via the Collections framework instead of 
 * myList.add().  Aside from these minor changes the rest of the code was reused and unaltered.  
 *      
 *
 * 
 * To run the program cd to src directory within mulierim_05, type java S in terminal.
 * To generate javadocs via the terminal cd to src directory and use:
 * javadoc -author -version -d mulierim_05_docs *.java
 * To open javadocs in browser, right click on index.html file within mulierim_05_docs directory. 
 * 
 * @author Michael Mulieri
 * @version 2.0.0
 * @since Week 5 of CSC6031
 */
public class S {
    /**
     * Default constructor.  
     */
    public S(){
        //Defaulst constructor, no additional data needed. 
    }
    /**
     * Main method of class
     * 
     * <p>The main method initializes a variable userNumbers with data collected from the user via the 
     * getUserInput() method of the userInput class. A Stack named myStack is then populated 
     * with the data of userNumbers via the populateStack() method of the aStack class. 
     * myStack is sorted in ascending order via the sortStack() method of the sorter class. 
     * Finally the sorted Stack is displayed via the displaySortedStack() method of the main class. 
     *   
     *  
     * @param args Default parameter for a main - not used
     * @since Week 5 of CSC6031
     */
    public static void main(String[] args) {
        
        String[] userNumbers = userInput.getUserInput();

        Stack<Integer> myStack = aStack.populateStack(userNumbers);

        Stack<Integer> sortedStack = sorter.sortStack(myStack);
        
        displaySortedStack(sortedStack);
    }
    /**
     * This method displays the sorted Stack.
     * @param sortedStack
     */

    private static void displaySortedStack(Stack<Integer> sortedStack){
        System.out.println("The sorted Stack is: " + sortedStack);
    }
}
