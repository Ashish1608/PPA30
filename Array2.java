import java.lang.*;
import java.util.*;

class Array2
{
    public static void main(String arg[])
    {
        System.out.println("Inside main\n");

        int iCnt = 0;
        Scanner sObj = new Scanner(System.in);

        System.out.println("Enter the number of elements in the array :");
        int size = sObj.nextInt();

        int Arr[] = new int[size];

        System.out.println("\nEnter the elements of array :");
        for(iCnt = 0; iCnt < Arr.length; iCnt++)
        {
            Arr[iCnt] = sObj.nextInt();
        }

        System.out.println("\nElements of array are :");
        for(iCnt = 0; iCnt < Arr.length; iCnt++)
        {
            System.out.println(Arr[iCnt]);
        }
    }
}


