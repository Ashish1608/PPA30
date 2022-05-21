// Demo program for Array in java 
import java.lang.*;

class Array1
{
    public static void main(String arg[])
    {
        System.out.println("Inside main\n");

        int iCnt = 0;
        int arr[] = new int[5];

        arr[0] = 10;
        arr[1] = 20;
        arr[2] = 30;
        arr[3] = 40;
        arr[4] = 50;

        System.out.println("Length of the array is : " + arr.length);   // length is the property of array in java

        System.out.println("\nElements of array by using for loop :");
        for(iCnt = 0; iCnt < arr.length; iCnt++)
        {
            System.out.println(arr[iCnt]);
        }

        System.out.println("\nElements of array by using while loop :");
        iCnt = 0;
        while(iCnt < arr.length)
        {
            System.out.println(arr[iCnt]);
            iCnt++;
        }

        System.out.println("\nElements of array by using for each loop :");
        for(int no : arr)
        {
            System.out.println(no);
        }
    }
}


