package challenge27;

public class App {
    public static void main(String[] args) {
        MergeSort merge=new MergeSort();
        int[] arr = {8,4,23,42,16,15};

        merge.mergeSort(arr);

        System.out.println("Sorted Array:");
        for (int num : arr) {
            System.out.print(num + " ");
        }
    }
}