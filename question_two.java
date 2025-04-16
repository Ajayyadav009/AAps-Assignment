public class question_two {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        int L = 1, R = 3;

        int[] prefix = new int[arr.length];
        prefix[0] = arr[0];

        for (int i = 1; i < arr.length; i++) {
            prefix[i] = prefix[i - 1] + arr[i];
        }

        int sum = L == 0 ? prefix[R] : prefix[R] - prefix[L - 1];
        System.out.println("Sum from " + L + " to " + R + " is: " + sum);
    }
}
