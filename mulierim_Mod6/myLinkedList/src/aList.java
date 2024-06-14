import java.util.LinkedList;
/**
 * This class adds the data gathered from the user to a LinkedList via
 * the populateLinkedList() class method. 
 */

public class aList {
    /**
     * This method instantiates a LinkedList then adds the user data to it.  
     * @param userNumbers
     * @return myLinkedList
     */
    public static LinkedList<Integer> populateLinkedList(String[] userNumbers){
        LinkedList<Integer> myLinkedList = new LinkedList<Integer>();
        /**
         * Iterate through userNumbers array and add the integers to 
         * myLinkedList.
         */
        for (String str : userNumbers){
            /**
             * try/catch validates the user input. If user includes invalid values
             * they are omitted and are not added to the LinkedList.
             */
            try{
            myLinkedList.add(Integer.parseInt(str));
            }catch(NumberFormatException nfe){
                System.out.println("Invalid character(s) " + "--"+str+"--" + " has been omitted.");
            }
        }
        return myLinkedList;
    }
}
