package challenge3;

public class arrayBinarySearch 
{
    public static void main(String[] args)
    {
       int[] array= {-131, -82, 0, 27, 42, 68, 179};
       int k=42;
       System.out.println(BinarySearch(array,k));
       
    }

    public static int BinarySearch(int[] array, int k)
    {
        int high=array.length-1;
        int low=0;
       
        while (low <= high) {
            int mid = low + (high - low) / 2;

            if (array[mid] == k) {
                return mid; 
            }
            if (array[mid] < k) {
                low = mid + 1;
            } else {
                high = mid - 1; 
            }
        }
        return -1;

    }
}
