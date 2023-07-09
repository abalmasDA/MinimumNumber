import java.util.InputMismatchException;
import java.util.LinkedList;
import java.util.Scanner;

/**
 * Мінімальне з N чисел (використовувати LinkedList):
 * 1. Введіть із клавіатури число N.
 * 2. Вважати N цілих чисел і заповнити ними список - метод getIntegerList.
 * 3. Знайти мінімальне число серед елементів списку – метод getMinimum.
 */

public class Main {

    public static void main(String[] args) {
        Scanner scannerInputNumber = new Scanner(System.in);
        try {
            System.out.print("You need to input number (only integer type) of elements of the list: ");
            int numberList = scannerInputNumber.nextInt();
            LinkedList<Integer> someList = NumberManipulation.getIntegerList(numberList);
            System.out.println("Some list integer numbers:" + someList);
            System.out.println("Minimum number is: " + NumberManipulation.getMinimum(someList));

        } catch (InputMismatchException exception) {
            System.out.println("You entered the wrong number format ");
        }


    }


}
