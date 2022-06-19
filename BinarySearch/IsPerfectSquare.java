class IsPerfectSquare {
    public static boolean isPerfectSquare(int num) {
        int start = 1;
        int end = num;
        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (mid <= num / mid) {
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }
        return end * end == num;
    }

    public static void main(String[] args) {
        System.out.println(isPerfectSquare(5));
    }

}
