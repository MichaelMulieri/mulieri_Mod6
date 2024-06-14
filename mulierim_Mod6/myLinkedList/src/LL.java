import java.util.LinkedList;
/**
 * Class to facilitate the creation of a sorted Linked List via user provided data.
 * Code reuse can be found in the sorter class and aList class. Collections.sort() of the Collections Framework
 * is used to sort the LinkedList in the sorter class. myLinkedList.add() is used to add
 * data to the LinkedList in the aList class. parseInt() is also used within the aList class.
 * 
 * The seperation of code into classes will make code reuse easier. For example the userInput class can be 
 * reused to collect user data even if the data is used by a new class to create a Stack instead of a LinkedList.   
 *
 * 
 * To run the program cd to src directory within mulierim_04, type java LL in terminal.
 * To generate javadocs via the terminal cd to src directory and use:
 * javadoc -version -author -d mulierim_04_docs LL.java aList.java sorter.java userInput.java
 * To open javadocs in browser, right click on index.html file within mulierim_04_docs directory. 
 * 
 * @author Michael Mulieri
 * @version 1.0.0
 * @since Week 4 of CSC6031
 */
public class LL {
    /**
     * Main method of class
     * 
     * <p>The main method initializes a variable userNumbers with data collected from the user via the 
     * getUserInput() method of the userInput class. A Linked List named myLinkedList is then populated 
     * with the data of userNumbers via the populateLinkedList() method of the aList class. 
     * myLinkedList is sorted in ascending order via the sortLinkedList() method of the sorter class. 
     * Finally the sorted linked list is displayed via the displaySortedLinkedList() method of the main class. 
     *   
     *  
     * @param args Default parameter for a main - not used
     * @since Week 4 of CSC6031
     */
    public static void main(String[] args) {
        
        String[] userNumbers = userInput.getUserInput();

        LinkedList<Integer> myLinkedList = aList.populateLinkedList(userNumbers);

        LinkedList<Integer> sortedLinkedList = sorter.sortLinkedList(myLinkedList);
        
        displaySortedLinkedList(sortedLinkedList);
    }
    /**
     * This method displays the sorted LinkedList.
     * @param sortedLinkedList
     */

    private static void displaySortedLinkedList(LinkedList<Integer> sortedLinkedList){
        System.out.println("The sorted Linked List is: " + sortedLinkedList);
    }
}
