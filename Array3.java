import java.lang.*;
import java.util.*;

class Array3
{
    public static void main(String arg[])
    {
        System.out.println("Inside main\n");

        int iCnt1 = 0;
        int iCnt2 = 0;
//         Scanner sObj = new Scanner(System.in);

        int Arr[][][] = new int[2][2][2];

        Arr[0][0][0] = 10;
        Arr[0][0][1] = 20;
        Arr[0][1][0] = 30;
        Arr[0][1][1] = 40;
        Arr[1][0][0] = 50;
        Arr[1][0][1] = 60;
        Arr[1][1][0] = 70;
        Arr[1][1][1] = 80;

        System.out.println("\nElements of array are :");
        for(iCnt1 = 0; iCnt1 < Arr.length; iCnt1++)
        {
            for(iCnt2 = 0; iCnt2 < Arr[iCnt1].length; iCnt2++)
            {
                System.out.println(Arr[iCnt1][iCnt2]);
            }

        }
    }
}


