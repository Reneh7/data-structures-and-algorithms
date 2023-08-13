package challenge2;
import java.util.Arrays;


public class Shift
{
    public static void main(String args[])
    {
        
        int[] evenArray = {1,2,3,4};
        int newValue = 6;
        System.out.println((Arrays.toString(insertShiftArray(evenArray, newValue))));

        int[] oddArray = {42,8,15,23,42};
        int newValue1 = 16;
        System.out.println((Arrays.toString(insertShiftArray(oddArray, newValue1))));

        int[] emptyArray = {};
        int newValue2 = 8;
        System.out.println((Arrays.toString(insertShiftArray (emptyArray , newValue2))));

        int[] oneElementArray = {1};
        int newValue3 = 9;
        System.out.println((Arrays.toString(insertShiftArray(oneElementArray, newValue3))));
    }


    public static int[] insertShiftArray(int[] array, int n)
   {
        int mid=(int) Math.ceil((double) array.length / 2);
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
        

