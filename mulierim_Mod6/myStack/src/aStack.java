import java.util.Stack;
/**
 * This class adds the data gathered from the user to a Stack via
 * the populateStack() class method. 
 */

public class aStack {
    /**
     * Default constructor. 
     */
    public aStack(){
        //Default constructor, no additional data needed.
    }
    /**
     * This method instantiates a Stack then pushes the user data to it.  
     * @param userNumbers - array of integers 
     * @return myStack - Stack comprised of userNumbers
     */
    public static Stack<Integer> populateStack(String[] userNumbers){
        Stack<Integer> myStack = new Stack<Integer>();
        /**
         * Iterate through userNumbers array and push the integers to 
         * myStack.
         */
        for (String str : userNumbers){
            /**
             * try/catch validates the user input. If user includes invalid values
             * they are omitted and are not added to the Stack.
             */
            try{
            myStack.push(Integer.parseInt(str));
            }catch(NumberFormatException nfe){
                System.out.println("Invalid character(s) " + "--"+str+"--" + " has been omitted.");
            }
        }
        return myStack;
    }
}

