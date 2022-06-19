// import myPack.pack;

class BinarySearch {
    public int binarySearch(int[] arr, int search) {
        int start = 0;
        int end = arr.length - 1;
        boolean isAsc = arr[start] < arr[end]; // to check if given array is in ascending order or descending order
        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (arr[mid] == search) {
                return mid;
            }
            if (isAsc) {    // if array is in ascending order
                if (arr[mid] < search) {
                    start = mid + 1;
                } else {
                    end = mid - 1;
                }
            } else {        // if array is in descending order
                if (arr[mid] > search) {
                    start = mid + 1;
                } else {
                    end = mid - 1;
                }
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        // pack.msg();
        BinarySearch obj = new BinarySearch();
        // int[] arr = { 11, 22, 37, 41, 56, 79, 99, 222 }; // in ascending order
        int []arr={222,99,79,88,65,11,4,3,-1,-22}; // in descending order
        int result = obj.binarySearch(arr, 222);
        System.out.println(result);
    }
}