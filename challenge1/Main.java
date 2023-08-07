public class Main
{
    public static void main(String args[])
    {
        int[] array = {1, 2, 3, 4, 5, 6};
        int[] reversedArray = reverseArray(array);
        
        System.out.print("[");
        for (int i = 0; i < reversedArray.length; i++) 
        {
            System.out.print(reversedArray[i]);
            if (i < reversedArray.length - 1) {
                System.out.print(", ");
            }
        }
        System.out.println("]");
    }

    public static int[] reverseArray(int[] array)
    {
        int[] reversedArray = new int[array.length];
        int lastIndex = array.length - 1;

        for (int i = 0; i < array.length; i++) 
        {
            reversedArray[lastIndex - i] = array[i];
        }
        return reversedArray;
    }
}
