import java.sql.PseudoColumnUsage;
import java.util.Arrays;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


public class Session2Assignment {
    public static void main (String [] args){
        //1.
        Scanner sc = new Scanner(System.in);
        int x [] = new int[10];
        int input;


        for(int i = 0; i< x.length ;i++){
            System.out.printf("enter the " + i +" index = ");
            input = sc.nextInt();
            x[i] = input;
        }
        System.out.println();
        System.out.println(Arrays.toString(x));
        System.out.println();
        // 2.
        Scanner sc1 = new Scanner(System.in);
        int y [] = new int[10];
        int input1;
        int userinput;
        int i;


        for( i = 0; i< y.length  ;i++){
            System.out.print("enter the " + i +" index = ");
            input1 = sc1.nextInt();
            y[i] = input1;
        }
        Scanner sc2 = new Scanner(System.in);
        System.out.print("Input the number you want to see if it exists or not in the array = ");
        userinput = sc2.nextInt();
        for(i = 0; i<y.length ;i++){
            if(y[i] == userinput){
                System.out.println("true");
                break;
            }
            else
            {
                System.out.println("false");
                break;
            }
        }

        System.out.println();
        System.out.println(Arrays.toString(y));
        System.out.println();
        //3.
        Scanner scan = new Scanner(System.in);
        int arr3[] = new int[20];
        ArrayList<Integer> arrofpositive = new ArrayList<>();
        int counterofpositive = 0;
        ArrayList<Integer> arrofnegative = new ArrayList<>();;
        int counterofnegative = 0;
        ArrayList<Integer> arrofodd = new ArrayList<>();;
        int counterofodd = 0;
        ArrayList<Integer> arrofeven = new ArrayList<>();;
        int counterofeven = 0;
        ArrayList<Integer> arrofzero = new ArrayList<>();
        int counterofzeros = 0;
        int input_user;

        for(i=0; i<arr3.length ;i++){
            System.out.printf("enter the " + i + " index = ");
            input_user = scan.nextInt();
            arr3[i] = input_user;
            if (arr3[i] > 0)
            {
                arrofpositive.add(arr3[i]);

            }
            else if(arr3[i] < 0)
            {
                arrofnegative.add(arr3[i]);

            }
            else if(arr3[i] == 0)
            {
                arrofzero.add(arr3[i]);

            }
            if (arr3[i] % 2 != 0)
            {
                arrofodd.add(arr3[i]);

            }
            else if(arr3[i] % 2 == 0)
            {
                arrofeven.add(arr3[i]);

            }

        }
        System.out.println();
        System.out.println(Arrays.toString(arr3));
        System.out.println(arrofpositive);
        System.out.println(arrofnegative);
        System.out.println(arrofodd);
        System.out.println(arrofeven);
        System.out.println(arrofzero);
        System.out.println();
        // 4.
        int arr4 [] = {1,2,3,4,5};
        int sumofarr4 = 0;
        int productofarr4 = 1;

        for(i=0; i<arr4.length; i++)
        {
            sumofarr4 += arr4[i];
            productofarr4 = productofarr4 * arr4[i];
        }
        System.out.println(Arrays.toString(arr4));
        System.out.println("sum of array = " + sumofarr4);
        System.out.println("product of array = " + productofarr4);
        System.out.println();
        //5.
        int arr5 [] = {5,2,3,4,5};
        int max = arr5[0];
        int min = arr5[0];

        for(i=0; i<arr5.length; i++)
        {
            if(arr5[i] > max)
            {
                max = arr5[i];
            }
            else if(arr5[i] < min)
            {
                min = arr5[i];
            }
        }
        System.out.println(Arrays.toString(arr5));
        System.out.println("Max num in array is = " + max);
        System.out.println("Min num in array is = " + min);
        System.out.println();
        //6
        int arr6 [] = {1,1,1,1,1};
        for(i=0 ;i<arr6.length; i++)
        {
            if(arr6[i] == arr6[arr6.length-i-1])
            {
                System.out.println("True");
                break;
            }
            else
            {
                System.out.println("False");
                break;
            }
        }
        int arr7 [] = {1,2,3,4,5,6,7,8,9,10};
        int totalofarr7 = arr7.length;

        int arr7part1 [] = new int[totalofarr7/2];
        int arr7part2 [] = new int[arr7.length - totalofarr7/2];

        for( i=0; i<arr7.length; i++)
        {
            if(i < (arr7.length/2))
            {
                arr7part1[i] = arr7[i];
            }
            else if(i >= arr7.length - totalofarr7/2)
            {
                arr7part2[i - totalofarr7/2] = arr7[i]; //untuk set indeks ke 0 mulai nya
            }
        }
        System.out.println(Arrays.toString(arr7));
        System.out.println(Arrays.toString(arr7part1));
        System.out.println(Arrays.toString(arr7part2));
        System.out.println();
        //8
        int array8 [] = {4,8,6,3,2};
        int max1 = array8[0];
        int secondmax1 = array8[0];


        for( i=0 ; i< array8.length; i++)
        {
            if (array8[i] > max1)
            {
                max1 = array8[i];
            }
        }
        for( i = 0; i<array8.length;i++)
        {
            if (secondmax1 < array8[i] && array8[i] < max1)
            {
                secondmax1 = array8[i];
            }
        }
        for( i=0 ; i<array8.length;i++)
        {
            if(array8[i] == max1)
            {
                int difference;
                difference = max1 - secondmax1;
                System.out.print(secondmax1 + " " + difference + " ");
            }
            else
            {
                System.out.print(array8[i] + " ");
            }
        }
        System.out.println();
        System.out.println();
        //9
        int array9 [] = {1,2,3,4,5};
        int temp1 = array9[array9.length - 1];

        for(i=0 ; i<array9.length;i++)
        {
            System.out.print(array9[i] + " ");

        }
        for( i = 1; i<=array9.length;i++)
        {
            if(i < array9.length)
            {
                array9[array9.length - i] = array9[array9.length - i -1];
            }
            else if(i == array9.length)
            {
                array9[0] = temp1;
            }
        }
        System.out.println();
        for( i = 0; i<array9.length; i++)
        {

            System.out.print(array9[i] + " ");
        }
        System.out.println();
        //10
        int arr10 [] = {2,5,6,0,8,9};
        int temp3;
        for( i = 0; i < arr10.length - 1;i++)
        {
            for(int  j = i +1  ;j < arr10.length; j++)
            {
                if(arr10[j] < arr10[i])
                {
                    temp3 = arr10[j];
                    arr10[j] = arr10[i];
                    arr10[i] = temp3;

                }
            }
        }
        System.out.println(Arrays.toString(arr10));


    //11 ITERATING THROUGH ELEMENTS
        int temp2;
        int e[] = {1,2,3,4,5};
        System.out.println();
        System.out.println(Arrays.toString(e));
        for(i=0; i<e.length/2 ; i++){
            temp2 = e[i];
            e[i] = e[e.length-1-i];
            e[e.length-1-i] = temp2;
        }
        System.out.println(Arrays.toString(e));
        System.out.println();
        //12 ASCII TO DIGITS
        int mask2 = '\u000F';
        int num2 = '0';
        int lc  = num2 & mask2;

        System.out.printf("%d" ,lc);
        System.out.println();
        //13 DIGITS TO ASCII
        int mask3 = '\u0030';
        int num3 = '0';
        int l = num3 | mask3;

        System.out.printf("%d", l);

    }
}
