
public class Main {

    static int longestSum(int[] arr) {

        int max = 0;
        int max_sub = Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {
            max = max + arr[i];

            if (max < arr[i])
                max = arr[i];
            if (max_sub < max)
                max_sub = max;
        }
        return max_sub;
    }

    public static void main(String[] args) {
        int arr[] = {-2, -3, 4, -1, -2, 1, 5, -3};

        System.out.println(longestSum(arr));
    }
}
