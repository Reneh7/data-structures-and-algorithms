package challenge4;

import java.util.ArrayList;

public class matrix
{
    public static void main(String[] args)
    {
        int[][] array1 = {{1, 2, 3}, {3, 5, 7}, {1, 7, 10}};
        int[][] array2 = {{0, 1, 5}, {-4, 7, 2}, {-3, 11, 12}};

        System.out.println(calSum(array1));
        System.out.println(calSum(array2));

        int fibNumber=14;
        System.out.println(interview2(fibNumber));

    }

    public static ArrayList<Integer> calSum(int[][] arr)
    {
        ArrayList<Integer> result = new ArrayList<>(arr.length);
        for(int i=0; i< arr.length; i++ )
        {
            int sum=0;
            for(int j=0; j<arr[i].length;j++)
            {
                sum += arr[i][j] ;
            }
            result.add(sum) ;
        }
        return result;
    }

    public static int interview2(int n)
    {
        if(n==0 || n==1)
        {
            return n;
        }else
            return interview2(n-1)+interview2(n-2);
    }

}
