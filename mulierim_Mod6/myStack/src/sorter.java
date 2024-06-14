import java.util.Collections;
import java.util.Stack;
/**
 * This class reuses methods of the Collections Framework to sort a Stack
 * in ascending order. 
 */

public class sorter {
    /**
     * Default constructor.
     */
    public sorter(){
        
        //Default constructor, no additional data needed.
    
    }
    /**
     * This method sorts a Stack in ascending order. 
     * @param myStack - Stack comprised of user provided data.
     * @return myStack
     */
    public static Stack<Integer> sortStack(Stack<Integer> myStack){
        Collections.sort(myStack);
        return myStack;
    }
}

