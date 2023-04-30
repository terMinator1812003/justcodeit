public class MiniNumInLS {
    public static void main(String[] args) {
        int[] arr = { 5, 6, 1, 7, 8, 9, 2 };
        System.out.println(min(arr));
    }

    // return the minimum value in the array
    static int min(int[] arr) {

        int ans = arr[0];
        for (int i = 1; i < arr.length; i++) {

            if (arr[i] < ans) {
                ans = arr[i];

            }

        }
        return ans;

    }
}
