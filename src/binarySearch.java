/**
 *  有序数组 中 查找某一特定元素 的搜索算法
 *
 *  时间复杂度:折半搜索每次把搜索区域减少一半，时间复杂度为O(log n)。（n代表集合中元素的个数）
    空间复杂度: O(1)。虽以递归形式定义，但是尾递归，可改写为循环。
 */
public class binarySearch {
    public static void main(String[] arg) {
        int[] array = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        //递归方式
        System.out.println("index:"+recurrence(array,0,array.length-1,555));
        //非递归方式
        System.out.println("index:"+NotRecurrence(array,9232));
    }

    private static int NotRecurrence(int[] array,int key) {
        int low = 0;
        int high=array.length-1;
        while (low <= high) {
            int mid = low+(high-low)/2;//（low+high)/2存在溢出风险
            if (array[mid] > key) {
                high=mid-1;
            } else if (array[mid] < key) {
                low = mid + 1;
            } else {
                return mid;
            }
        }
        return -1;
    }

    private static int recurrence(int[] array,int low,int high,int target) {
        if (low > high) {
            return -1;
        }
        int mid = low+(high-low)/2;
        if (array[mid] > target) {
            return recurrence(array, low, mid - 1, target);
        }
        if (array[mid] < target) {
            return recurrence(array, mid + 1, high, target);
        }
        return mid;
    }
}
