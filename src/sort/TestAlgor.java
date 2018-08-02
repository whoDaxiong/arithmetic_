package sort;

import java.util.Arrays;

public class TestAlgor {
    public static void main(String[] args) {
        int[] arrays = {9, 8, 7, 6, 5, 4, 3, 2, 1, 0};
        /// bubble(arrays);
        // choose(arrays);
         insert(arrays);
        // quick(arrays, 0, arrays.length - 1);
        // mergeSort(arrays, 0, arrays.length - 1);
        // redix(arrays);
        // shellsort(arrays);

        System.out.println(Arrays.toString(arrays));
    }

    private static void insert(int[] arrays) {
        for (int i=1;i<arrays.length;i++) {
            int temp = arrays[i];
            while (i > 0 && arrays[i - 1] > temp) {
                arrays[i] = arrays[i-1];
                i--;
            }
            arrays[i] = temp;
        }
    }


}
