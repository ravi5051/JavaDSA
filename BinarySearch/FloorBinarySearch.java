// return index of floor element=> greatest element in array which is <= target element
public class FloorBinarySearch {
    public static int floor(int[] arr, int target) {
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
            return end; // if element is not present is array
        else
            return start;
    }

    public static void main(String[] args) {
        // int[] arr = { 1, 2, 3, 4, 5, 6, 7, 9, 10 };
        // int result = floor(arr, 8);
        int[] arr = { 10, 9, 8, 6, 4, 3, 1 };
        int result = floor(arr, 3);
        System.out.println(result);
    }
}
