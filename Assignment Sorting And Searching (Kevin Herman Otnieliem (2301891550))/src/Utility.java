import java.util.Scanner;

public class Utility {
    //1.
    public void inputValues(int [] a, int n)
    {
        int inputuser;
        Scanner scan = new Scanner(System.in);
        for (int i = 0; i < n; i++) {
            System.out.printf("enter the " + i + " index = ");
            inputuser = scan.nextInt();
            a[i] = inputuser;
        }
    }
    public void splitMaxAndMin(int [] a, int n) {

        int max1 = a[0];
        int secondmax1 = a[0];


        for (int j = 0; j < a.length; j++) {
            if (a[j] > max1) {
                max1 = a[j];
            }
        }
        for (int j = 0; j < a.length; j++) {
            if (secondmax1 < a[j] && a[j] < max1) {
                secondmax1 = a[j];
            }
        }
        for (int j = 0; j < a.length; j++) {
            if (a[j] == max1) {
                int difference;
                difference = max1 - secondmax1;
                System.out.print(secondmax1 + " " + difference + " ");
            } else {
                System.out.print(a[j] + " ");
            }
        }
        System.out.println();
        System.out.println();
    }

    public boolean isNonNegative(int a[] , int n)
    {
        boolean condition = true;
        for( int i = 0; i <a.length ; i++)
        {
            if (a[i] < 0)
            {
                condition = false;
                return condition;

            }
        }
        return condition;
    }
    public boolean isUnique( int a [], int n)
    {
        boolean condition = true;
        for( int i = 0; i <a.length ; i++)
        {
            for (int j = i+1 ; j < a.length ; j++)
            {
                if(a[i] == a[j]) {
                    condition = false;
                    return condition;
                }
            }
        }
        return condition;
    }


    //2.
    public void rot(int a [], int n)
    {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the Rot : ");
        int rot  = scan.nextInt();
        int temp1;

        for(int i=0 ; i<a.length;i++)
        {
            System.out.print(a[i] + " ");

        }
        for( int i = 1; i <= rot ;i++)
        {
            temp1 = a[a.length - 1];
            for ( int j = 1; j <=a.length  ; j++)
            {
                if(j < a.length)
                {
                    a[a.length - j] = a[a.length - j - 1];
                }
                else if(j == a.length)
                {
                    a[0] = temp1;
                }
            }

        }
        System.out.println();
        for( int i = 0; i<a.length; i++)
        {

            System.out.print(a[i] + " ");

        }
        System.out.println();
    }
    //3.

    public void inputValues(int array [][], int x, int y)
    {
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i< x; i++)
        {
            for (int j = 0; j < y; j++)
                {
                    System.out.println("Enter the row " + i + " and column " + j + "= " );
                    array[i][j]= sc.nextInt();
                }
        }
    }
    public void printValues(int array [][], int x, int y)
    {
        for (int i = 0; i< x; i++)
        {
            for (int j = 0; j < y; j++)
            {
                System.out.printf(" %d", array[i][j]);
            }
            System.out.println();
        }

    }
    public boolean isSymetric(int array [][], int x, int y)
    {
        boolean symetric = true;
        for (int i = 0; i< x; i++)
        {
            for (int j = 0; j < y; j++)
            {
                if (array[i][j] != array [j][i])
                {
                    symetric = false;
                    return symetric;

                }
            }

        }
        return symetric;
    }


    //4.
    public int[][] createOddMagicSquare(int order) {
        int[][] magicSquare = new int[order][order];
        int r = 0;
        int number = 0;
        int size = order * order;
        int c = order / 2;

        while (number++ < size)
        {
            magicSquare[r][c] = number;
            if (r == 0)
            {
                if (c == order - 1)
                {
                    r++;
                }
                else
                {
                    r = order - 1;
                    c++;
                }
            }
            else
            {
                if(c == order - 1)
                {
                    r--;
                    c = 0;
                }
                else
                {
                    if(magicSquare[r - 1][c + 1] == 0)
                    {
                        r--;
                        c++;
                    }
                    else
                    {
                        r++;
                    }
                }
            }
        }
        return magicSquare;
    }

    public void displayOddMagicSquare(int order) {
        for(int[] row: createOddMagicSquare(order))
        {
            for(int number: row)
            {
                System.out.printf("%2s ", number);
            }

            System.out.println();
        }

        System.out.printf("Magic constant = %d\n", (order * order + 1) * order / 2);
    }

    public int[][] createSinglyEvenMagicSquare(int order) {
        int size = order * order;
        int halfOrder = order / 2;
        int subMagicSquareSize = size / 4;
        int[][] subMagicSquare = createOddMagicSquare(halfOrder);
        int[] quadrantFactors = {0, 2, 3, 1};
        int[][] magicSquare = new int[order][order];

        for (int r = 0; r < order; r++)
        {
            for (int c = 0; c < order; c++)
            {
                int quadrant = (r / halfOrder) * 2 + (c / halfOrder);

                magicSquare[r][c] = subMagicSquare[r % halfOrder][c % halfOrder];
                magicSquare[r][c] += quadrantFactors[quadrant] * subMagicSquareSize;
            }
        }

        int numberOfLeftColumns = halfOrder / 2;
        int numberOfRightColumns = numberOfLeftColumns - 1;

        for (int r = 0; r < halfOrder; r++)
        {
            for (int c = 0; c < order; c++)
            {
                if (c < numberOfLeftColumns || c >= order - numberOfRightColumns || (c == numberOfLeftColumns && r == numberOfLeftColumns))
                {
                    if (c == 0 && r == numberOfLeftColumns)
                    {
                        continue;
                    }

                    int temp = magicSquare[r][c];

                    magicSquare[r][c] = magicSquare[r + halfOrder][c];
                    magicSquare[r + halfOrder][c] = temp;
                }
            }
        }

        return magicSquare;
    }

    public void displaySinglyEvenMagicSquare(int order) {
        for (int[] row: createSinglyEvenMagicSquare(order))
        {
            for (int number: row)
            {
                System.out.printf("%2s ", number);
            }

            System.out.println();
        }

        System.out.printf("Magic constant = %d\n", (order * order + 1) * order / 2);
    }

    public int[][] createDoublyEvenMagicSquare(int order) {
        int bits = 0b1001_0110_0110_1001;
        int size = order * order;
        int multiples = order / 4;
        int[][] magicSquare = new int[order][order];

        for(int r = 0, i = 0; r < order; r++)
        {
            for(int c = 0; c < order; c++, i++)
            {
                int bitPosition = c / multiples + (r / multiples) * 4;

                magicSquare[r][c] = (bits & (1 << bitPosition)) != 0 ? i + 1 : size - i;
            }
        }

        return magicSquare;
    }

    public void displayDoublyEvenMagicSquare(int order) {
        for(int[] row: createDoublyEvenMagicSquare(order))
        {
            for(int number: row)
            {
                System.out.printf("%2s ", number);
            }

            System.out.println();
        }

        System.out.printf("Magic constant = %d\n", (order * order + 1) * order / 2);
    }

}













