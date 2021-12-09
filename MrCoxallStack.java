/* 
 * The Mr.Coxall Stack Program
 *
 * @author  Liam Fletcher
 * @version 1.0
 * @since   2021-12-09
 */

// Import the ArrayList class
import java.util.ArrayList;

public class MrCoxallStack {

    private ArrayList < Integer > stackAsArray = new ArrayList < Integer > ();

    public void push(int receivedNum) {
        stackAsArray.add(receivedNum);
    }

    /**
     * pop method 
     */

    public int pop() {
        if (this.stackAsArray.size() == 0) {
            throw null;
        } else {
            int poppedNumber = this.stackAsArray.get(stackAsArray.size() - 1);
            stackAsArray.remove(stackAsArray.size() - 1);
            return poppedNumber;
        }
    }

    /**
     * Getter 
     */

    public String currentStack() {
        String arrayVal = "Current ArrayList: ";
        for (int counter = 0; counter < stackAsArray.size(); counter++) {
            arrayVal = arrayVal + stackAsArray.get(counter) + ", ";
        }
        return arrayVal;
    }
}
