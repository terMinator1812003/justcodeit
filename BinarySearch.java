//BINARY SEARCH CODE
public class BinarySearch {
    public static void main(String[] args) {
        int[] arr = { 5, 6, 7, 8, 9, 11, 13, 14, 16, 17, 18, 19, 21 };
        int target = 5;
        int ans = binarySearch(arr, target);
        System.out.println(ans);
    }

    static int binarySearch(int[] arr, int target) {
        int start = 0;
        int end = arr.length - 1;

        while (start <= end) {
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
        return -1;
    }
}