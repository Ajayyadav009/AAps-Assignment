public class question_four {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 3};
        int total = 0, prefix = 0;

        for (int num : arr) total += num;

        for (int i = 0; i < arr.length - 1; i++) {
            prefix += arr[i];
            if (prefix == total - prefix) {
                System.out.println("Can split at index " + i);
                return;
            }
        }
        System.out.println("Cannot split");
    }
}
