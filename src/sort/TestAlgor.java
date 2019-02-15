package sort;

import java.util.Arrays;


public class TestAlgor {
    public static void main(String[] args) {
        int[] arrays = {99, 85, 75, 65, 56, 41, 38, 24, 12, 5};
        /// bubble(arrays);
        // choose(arrays);
        // insert(arrays);
        quick(arrays, 0, arrays.length - 1);
        // mergeSort(arrays, 0, arrays.length - 1);
        // redix(arrays);
        // shellsort(arrays);

        System.out.println(binarySearch(arrays,38));

        System.out.println(Arrays.toString(arrays));
    }

    private static int binarySearch(int[] arrays, int key) {
        int l = 0;
        int r = arrays.length-1;
        while (l<=r) {
            int m = (l + r)/2;
            if (arrays[m] > key) {
                r=m-1;
            } else if (arrays[m] < key) {
                l = m + 1;
            } else {
                return m;
            }
        }
        return -1;
    }

    private static void quick(int[] arrays, int L, int R) {
        int i = L;
        int j = R;
        int p = arrays[(L + R) / 2];
        while (i <= j) {
            while (arrays[i] < p) {
                i++;
            }
            while (arrays[j] > p) {
                j--;
            }
            if (i <= j) {
                int temp = arrays[i];
                arrays[i] = arrays[j];
                arrays[j] = temp;
                i++;
                j--;
            }
        }
        if (L < j) {
            quick(arrays, L, j);
        }
        if (R > i) {
            quick(arrays, i, R);
        }
    }


}
