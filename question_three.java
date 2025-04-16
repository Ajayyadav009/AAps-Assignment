public class question_three {
    
        public static void main(String[] args) {
            int[] arr = {-7, 1, 5, 2, -4, 3, 0};
            int total = 0, leftSum = 0;
    
            for (int num : arr) total += num;
    
            for (int i = 0; i < arr.length; i++) {
                total -= arr[i];
                if (leftSum == total) {
                    System.out.println("Equilibrium index: " + i);
                    return;
                }
                leftSum += arr[i];
            }
            System.out.println("No equilibrium index");
        
    }
    
    
}
