public class MyInsertionSortParam {
    public static void main(String a[]) {
        int[] arr1 = {10, 34, 2, 56, 7, 67, 88, 42};
        insertionSort(arr1);
        for (int i : arr1) {
            System.out.print(i);
            System.out.print(", ");
        }
    }

    private static void insertionSort(int a[]) {
        int temp;
        for (int i = 1; i < a.length; i++) {
            for (int j = i; j > 0; j--) {
                if (a[j] < a[j - 1]) {
                    temp = a[j];
                    a[j] = a[j - 1];
                    a[j - 1] = temp;
                }
            }
        }
    }
}