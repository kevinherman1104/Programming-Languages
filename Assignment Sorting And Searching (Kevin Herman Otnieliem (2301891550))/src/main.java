import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter size of Array: ");
        int n = sc.nextInt();
        int myArray[] = new int[n];
        Utility m = new Utility();

        //1.

        m.inputValues(myArray, n);
        if (m.isNonNegative(myArray, n) && m.isUnique(myArray, n)) {
            m.splitMaxAndMin(myArray, n);
        }


        //2.
        m.inputValues(myArray, n);
        m.rot(myArray, n);

        //3.
        System.out.printf("Input row = ");
        int x = sc.nextInt();
        System.out.printf("Input Column = ");
        int y = sc.nextInt();

        int multiDimensionalArray[][] = new int[x][y];


        m.inputValues(multiDimensionalArray, x, y);

        m.printValues(multiDimensionalArray, x, y);

        if (x == y) {
            System.out.println("Symetric = " + m.isSymetric(multiDimensionalArray, x, y));
        } else {
            System.out.println("Not Symetric");
        }

        //4.
        System.out.print("Enter order of magic square >> ");
        int order = sc.nextInt();

        if (order >= 3) {
            if (order % 2 != 0) {
                m.displayOddMagicSquare(order);
            } else if (order / 2 % 2 != 0) {
                m.displaySinglyEvenMagicSquare(order);
            } else if (order / 2 % 2 == 0) {
                m.displayDoublyEvenMagicSquare(order);
            }
        } else {
            System.out.println("Invalid order!");
        }
    }
}

