public class SearchingInRange {
    public static void main(String[] args) {
        int[] numbers = { 2, 5, 7, 9, 6, 33, 65, 8, 41, 96, 97, 45 };
        // problem is to search for 6 from range btw index[1,5]
        int target = 6;
        int ans = linearSearch(numbers, target, 1, 6);
        System.out.println(ans);
    }

    static int linearSearch(int[] arr, int target, int start, int end) {

        if (arr.length == 0) {
            return -1;
        }

        // run a for loop
        for (int index = start; index <= end; index++) {
            // check for element at index form range mentioned
            int element = arr[index];
            if (element == target) {
                return index;
            }

        }
        return -1;
    }

}