import java.util.Collections;
import java.util.LinkedList;
/**
 * This class reuses methods of the Collections Framework to sort a LinkedList
 * in ascending order. 
 */


public class sorter {
public sorter(){
    /**
     * Default constructor, no additional data needed.
     */
}
    /**
     * This method sorts a LinkedList in ascending order. 
     * @param myLinkedList
     * @return myLinkedList
     */
    public static LinkedList<Integer> sortLinkedList(LinkedList<Integer> myLinkedList){
        Collections.sort(myLinkedList);
        return myLinkedList;
    }
}
