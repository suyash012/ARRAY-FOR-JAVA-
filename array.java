public class array {
    public static int largest(int[] arr) {
        int max = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }

        }
        return max;
    }

    public static void main(String[] args) {
        int[] arr = { 1, 4, 6, 7, 8, 9, 10 };
        System.out.println("largest element in array is  : " + largest(arr));
    }
}