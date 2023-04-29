public class Searching {
    public static void main(String[] args) {
        int[] numbers = { 5, 6, 4, 8, 8, 9, 1, 8, 7, 19, 55, 88, 45, 26, 44 };
        int target = 55;
        int ans = linerSearching(numbers, target);
        System.out.println(ans);
    }

    static int linerSearching(int[] arr, int target) {
        if (arr.length == 0) {
            return -1;
        }

        // RUN A FOR LOOP
        for (int i = 0; i < arr.length; i++) {
            int element = arr[i];
            if (element == target) {
                return i;
            }
        }
        return -1;
    }
}