package challenge2;

import java.util.Arrays;

public class Shift
{
    public static void main(String args[])
    {
        int[] originalArray = {1, 2, 3, 4};
        int newValue = 6;
        System.out.println(Arrays.toString(insertShiftArray(originalArray, newValue)));
    }


    public static int[] insertShiftArray(int[] array, int n)
   {
        int mid=array.length/2;
        int newSize = array.length + 1;
        int[] newArray = new int[newSize];
        for(int i=0; i<mid; i++)
        { 
                newArray[i] = array[i];
        }
        newArray[mid] = n;
        for (int i = mid + 1; i < newSize; i++) 
        {
            newArray[i] = array[i - 1];
        }
        return newArray;
   }
}
