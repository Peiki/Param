public class MyInsertionSortSpec {
    public static void main(String a[]){
        int[] array = {10,34,2,56,7,67,88,42};
        insertionSort(array);
        print(array);
    }

    /**
     * MODIFY the array so that the elements are ordered in ascending order
     * @param a array that will be sorted
     */
    private static void insertionSort(int a[]) {
        for (int i = 1; i < a.length; i++) {
            for (int j = i; j > 0; j--) {
                if (a[j] < a[j - 1]) {
                    swap(a,j,j-1);
                }
            }
        }
    }

    /**
     * MODIFY two elements of the array, moving their positions
     * @param a array of integers, REQUIRE at least two elements
     * @param j first index to be swapped, REQUIRE to be valid and >0
     * @param k second index to be swapped, REQUIRE to be valid and >0
     */
    private static void swap(int []a, int j,int k){
        int temp;
        temp = a[j];
        a[j] = a[k];
        a[k] = temp;
    }

    /**
     * Prints the elements of an array
     * @param a array which elements will be printed
     */
    private static void print(int []a){
        for(int i:a){
            System.out.print(i);
            System.out.print(", ");
        }
    }
}