import java.util.Scanner;

// week 4
public class Method {
    public static void main(String [] args )
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter size of Array: ");
        int n =  sc.nextInt();
        int myArray[] = new int [n];
        MyUtilities m = new MyUtilities();

        // 1.
        m.inputValues(myArray,n);

        System.out.println(m.printValues(myArray));

        //2.
        if(m.isFound(myArray, n)){
            System.out.println("The number is present !");
        }
        else{
            System.out.println("The number is not present :(");
        }
        //3.
        m.categorizedValues(myArray, n);

        //4.
        m.sumAndProduct(myArray, n);

        //5.
        m.maxAndMin(myArray, n);

        ///6.
        if(m.isPalindrome(myArray, n)){
            System.out.println("Array is Palindrome");
        }
        else
        {
            System.out.println("Array is not Palindrome");
        }
        //7.
        m.splitArray(myArray, n);

        //8.
        m.splitMaxAndMin(myArray, n);

        //.9
        m.switchFirstLast(myArray, n);

        //10.
        m.sort(myArray , n);





    }
}
