public class MyInsertionSort {
    static int[] arr1 = {10, 34, 2, 56, 7, 67, 88, 42};
    static int temp;

    public static void main(String a[]) {
        for (int i = 1; i < arr1.length; i++) {
            for (int j = i; j > 0; j--) {
                if (arr1[j] < arr1[j - 1]) {
                    temp = arr1[j];
                    arr1[j] = arr1[j - 1];
                    arr1[j - 1] = temp;
                }
            }
        }
        for (int i : arr1) {
            System.out.print(i);
            System.out.print(", ");
        }
    }
}
