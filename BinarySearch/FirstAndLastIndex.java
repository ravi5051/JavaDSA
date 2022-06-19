// find first and last position of element in sorted numsay
// if target is not found in numsay then return[-1,-1]
// nums=[5,7,7,8,8,8,9,19] => input 
// target = 8
// expected output => [3,5]
public class FirstAndLastIndex {
    public static int[] searchRange(int[] nums, int target) {
        int[] ans = { -1, -1 };
        ans[0] = search(nums, target, true);
        if (ans[0] != -1) {
            ans[1] = search(nums, target, false);
        }
        return ans;
    }

    public static int search(int[] nums, int target, boolean findFirstIndex) {
        int ans = -1;
        int start = 0;
        int end = nums.length - 1;
        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (target < nums[mid]) {
                end = mid - 1;
            } else if (target > nums[mid]) {
                start = mid + 1;
            } else {
                ans = mid;
                if (findFirstIndex) {
                    end = mid - 1;
                } else {
                    start = mid + 1;
                }
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        int[] nums = { 5, 7, 7, 8, 8, 8, 9, 19 };
        // Receiving the answer
        int []ans=searchRange(nums, 8);
        // printing the answer
        System.out.println("{" + ans[0] + "," + ans[1] + "}");
    }
}
