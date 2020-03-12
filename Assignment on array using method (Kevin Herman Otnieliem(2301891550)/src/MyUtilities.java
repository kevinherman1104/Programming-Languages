import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class MyUtilities {
    public void inputValues(int[] a, int n) {
        Scanner sc = new Scanner(System.in);
        int input;

        for (int i = 0; i < n; i++) {
            System.out.printf("enter the " + i + " index = ");
            input = sc.nextInt();
            a[i] = input;
        }

    }

    public String printValues(int[] a) {
        return Arrays.toString(a);
    }

    public boolean isFound(int[] a, int n) {
        Scanner sc2 = new Scanner(System.in);
        int input1;
        int userinput;
        int i;


        for (i = 0; i < n; i++) {
            System.out.print("enter the " + i + " index = ");
            input1 = sc2.nextInt();
            a[i] = input1;
        }

        System.out.print("Input the number you want to see if it exists or not in the array = ");
        userinput = sc2.nextInt();
        boolean present = false;
        for (i = 0; i < n; i++) {
            if (a[i] == userinput) {
                present = true;
                break;
            }
        }
        return present;
    }

    public void categorizedValues(int[] a, int n) {
        ArrayList<Integer> arrofpositive = new ArrayList<>();
        ArrayList<Integer> arrofnegative = new ArrayList<>();
        ;
        ArrayList<Integer> arrofodd = new ArrayList<>();
        ;
        ArrayList<Integer> arrofeven = new ArrayList<>();
        ;
        ArrayList<Integer> arrofzero = new ArrayList<>();
        int input_user;
        Scanner scan = new Scanner(System.in);

        for (int i = 0; i < n; i++) {
            System.out.printf("enter the " + i + " index = ");
            input_user = scan.nextInt();
            a[i] = input_user;
            if (a[i] > 0) {
                arrofpositive.add(a[i]);

            } else if (a[i] < 0) {
                arrofnegative.add(a[i]);

            } else if (a[i] == 0) {
                arrofzero.add(a[i]);

            }
            if (a[i] % 2 != 0) {
                arrofodd.add(a[i]);

            } else if (a[i] % 2 == 0) {
                arrofeven.add(a[i]);

            }
        }
        System.out.println(Arrays.toString(a));
        System.out.println("positive num: " + arrofpositive);
        System.out.println("negative num: " + arrofnegative);
        System.out.println("odd num: " + arrofodd);
        System.out.println("even num: " + arrofeven);
        System.out.println("zero num: " + arrofzero);


    }

    public void sumAndProduct(int[] a, int n) {
        Scanner scan = new Scanner(System.in);
        int sumofarr4 = 0;
        int productofarr4 = 1;

        for (int i = 0; i < n; i++) {
            System.out.printf("enter the " + i + " index = ");
            int input_user = scan.nextInt();
            a[i] = input_user;
        }

        for (int j = 0; j < a.length; j++) {
            sumofarr4 += a[j];
            productofarr4 = productofarr4 * a[j];
        }
        System.out.println(Arrays.toString(a));
        System.out.println("sum of array = " + sumofarr4);
        System.out.println("product of array = " + productofarr4);
        System.out.println();

    }

    public void maxAndMin(int[] a, int n) {
        Scanner scan = new Scanner(System.in);
        int max = a[0];
        int min = a[0];

        for (int i = 0; i < n; i++) {
            System.out.printf("enter the " + i + " index = ");
            int input_user = scan.nextInt();
            a[i] = input_user;
        }
        for (int j = 0; j < a.length; j++) {
            if (a[j] > max) {
                max = a[j];
            } else if (a[j] < min) {
                min = a[j];
            }
        }
        System.out.println(Arrays.toString(a));
        System.out.println("Max num in array is = " + max);
        System.out.println("Min num in array is = " + min);
        System.out.println();

    }

    public boolean isPalindrome(int[] a, int n) {
        Scanner scan = new Scanner(System.in);
        for (int i = 0; i < n; i++) {
            System.out.printf("enter the " + i + " index = ");
            int input_user = scan.nextInt();
            a[i] = input_user;
        }
        boolean arraycheck = false;
        for (int j = 0; j < a.length; j++) {
            if (a[j] == a[a.length - j - 1]) {
                arraycheck = true;
                break;
            }
        }
        return arraycheck;


    }

    public void splitArray(int[] a, int n) {
        Scanner scan = new Scanner(System.in);
        for (int i = 0; i < n; i++) {
            System.out.printf("enter the " + i + " index = ");
            int input_user = scan.nextInt();
            a[i] = input_user;
        }
        int totalofarr = a.length;

        int arr7part1[] = new int[totalofarr / 2];
        int arr7part2[] = new int[a.length - totalofarr / 2];

        for (int j = 0; j < a.length; j++) {
            if (j < (a.length / 2)) {
                arr7part1[j] = a[j];
            } else if (j >= a.length - totalofarr / 2) {
                arr7part2[j - totalofarr / 2] = a[j]; //untuk set indeks ke 0 mulai nya
            }
        }
        System.out.println(Arrays.toString(a));
        System.out.println(Arrays.toString(arr7part1));
        System.out.println(Arrays.toString(arr7part2));
        System.out.println();

    }

    public void splitMaxAndMin(int [] a, int n) {
        Scanner scan = new Scanner(System.in);
        for (int i = 0; i < n; i++) {
            System.out.printf("enter the " + i + " index = ");
            int input_user = scan.nextInt();
            a[i] = input_user;
        }
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

    public void switchFirstLast(int a [], int n)
    {
        Scanner scan = new Scanner(System.in);
        for (int i = 0; i < n; i++) {
            System.out.printf("enter the " + i + " index = ");
            int input_user = scan.nextInt();
            a[i] = input_user;
        }
        int temp1 = a[a.length - 1];

        for(int i=0 ; i<a.length;i++)
        {
            System.out.print(a[i] + " ");

        }
        for( int i = 1; i<=a.length;i++)
        {
            if(i < a.length)
            {
                a[a.length - i] = a[a.length - i -1];
            }
            else if(i == a.length)
            {
                a[0] = temp1;
            }
        }
        System.out.println();
        for( int i = 0; i<a.length; i++)
        {

            System.out.print(a[i] + " ");
        }
        System.out.println();

    }

    public void sort(int [] a, int n)
    {
        Scanner scan = new Scanner(System.in);
        for (int i = 0; i < n; i++) {
            System.out.printf("enter the " + i + " index = ");
            int input_user = scan.nextInt();
            a[i] = input_user;
        }
        int temp3;
        for( int i = 0; i < a.length - 1;i++)
        {
            for(int  j = i +1  ;j < a.length; j++)
            {
                if(a[j] < a[i])
                {
                    temp3 = a[j];
                    a[j] = a[i];
                    a[i] = temp3;

                }
            }
        }
        System.out.println(Arrays.toString(a));



    }

}


