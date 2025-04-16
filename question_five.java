public class question_five {
   
        public static void main(String[] args) {
            int[] arr = {100, 200, 300, 400};
            int k = 2;
            int windowSum = 0, maxSum;
    
            for (int i = 0; i < k; i++) windowSum += arr[i];
            maxSum = windowSum;
    
            for (int i = k; i < arr.length; i++) {
                windowSum += arr[i] - arr[i - k];
                maxSum = Math.max(maxSum, windowSum);
            }
    
            System.out.println("Max sum of subarray size " + k + ": " + maxSum);
        }
    
    
}
