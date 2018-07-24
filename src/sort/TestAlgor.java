package sort;

import java.util.Arrays;

public class TestAlgor {
	public static void main(String[] args) {
		int[] arrays = { 3, 7, 4, 46, 7, 4, 567, 898, 6, 65, 5, 5, 454, 78, 7 };
		// bubble(sz);
		// choose(arrays);
		// insert(arrays);
		quick(arrays, 0, arrays.length - 1);
		// mergeSort(sz, 0, sz.length - 1);
		// redix(arrays);
		// shellsort(arrays);

		System.out.println(Arrays.toString(arrays));
	}

	private static void quick(int[] arrays, int L, int R) {
		int i = L;
		int j = R;
		int point = arrays[(i + j) / 2];
		while (i <= j) {
			while (arrays[i] < point) {
				i++;
			}
			while (arrays[j] > point) {
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
		if (i > R) {
			quick(arrays, i, R);
		}
	}

}
