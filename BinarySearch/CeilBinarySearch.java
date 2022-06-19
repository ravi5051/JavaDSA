// return index of floor element=> smallest element in array which is >= target element
public class CeilBinarySearch {
    public static int ceil(int[] arr, int target) {
        int start = 0;
        int end = arr.length - 1;
        boolean isAscending = arr[0] < arr[arr.length - 1];
        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (arr[mid] == target) {
                return mid;
            }
            if (isAscending) {
                if (target < arr[mid]) {
                    end = mid - 1;
                } else {
                    start = mid + 1;
                }
            } else {
                if (target > arr[mid]) {
                    end = mid - 1;
                } else {
                    start = mid + 1;
                }
            }
        }
        if (isAscending)
            return start; // if element is not present is array
        else
            return end;
    }

    public static void main(String[] args) {
        // int []arr={1,2,3,4,5,6,7,9,10};
        int[] arr = { 10, 9, 8, 6, 4, 3, 1 };
        int result = ceil(arr, 3);
        System.out.println(result);
    }
}
