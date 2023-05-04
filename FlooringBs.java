
public class FlooringBs {

    public static void main(String[] args) {
        int[] arr = { 5, 6, 7, 8, 9, 11, 13, 14, 16, 17, 18, 19, 21 };
        int target = 16;
        int ans = flooring(arr, target);
        System.out.println(ans);
    }

    // return the index of greatest <= target
    static int flooring(int[] arr, int target) {

        // but what if the target is greater than the greatest number in the array
        if (target > arr[arr.length - 1]) {
            return -1;
        }
        int start = 0;
        int end = arr.length - 1;

        while (start <= end) {
            // find the middle element
            // int mid = (start + end) / 2; // might be possible that (start + end) exceeds
            // the range of int in java
            int mid = start + (end - start) / 2;

            if (target < arr[mid]) {
                end = mid - 1;
            } else if (target > arr[mid]) {
                start = mid + 1;
            } else {
                // ans found
                return mid;
            }
        }
        return end;
    }
}