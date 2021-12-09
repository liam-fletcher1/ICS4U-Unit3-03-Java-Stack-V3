/*
 * The Mr.Coxall Stack Program
 *
 * @author  Liam Fletcher
 * @version 1.0
 * @since   2021-12-09
 */

// Import the Scanner class
import java.util.Scanner;

public class Input {

    public static void main(String[] args) {

        Scanner userInput = new Scanner(System.in);

        MrCoxallStack clasStack = new MrCoxallStack();

        try {
            System.out.println("Enter the amount of integers you wish to push: ");
            int stackNum = userInput.nextInt();

            if (stackNum < 1) {
                System.out.println("Invalid Input. Input only integers above 0");
            } else {
                for (int counter = 0; counter < stackNum; counter++) {
                    System.out.println("Enter an integer to push onto the stack ");
                    int numberChosen = userInput.nextInt();
                    System.out.println();

                    clasStack.push(numberChosen);
                }

                System.out.println("Enter the amount of integers you wish to pop: ");
                System.out.println();
                int popNum = userInput.nextInt();
                if (popNum < 1) {
                    System.out.println("Invalid pop number assuming you want" +
                        " nothing popped...");
                } else {
                    for (int popCount = 0; popCount < popNum; popCount++) {
                        System.out.println("Popped Num: " + clasStack.pop());
                    }
                }

                System.out.println("Values in Stack: " + clasStack.currentStack());
            }
        } catch (NullPointerException e) {
            System.out.println("Invalid Input. More numbers Popped than in stack");
        } catch (Exception e) {
            System.out.println("Invalid Input");
        }
    }
}
