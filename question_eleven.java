public class question_eleven {
        public static void main(String[] args) {
            int[] arr = {1, 2, 3, 4, 6};
            int target = 6, left = 0, right = arr.length - 1;
    
            while (left < right) {
                int sum = arr[left] + arr[right];
                if (sum == target) {
                    System.out.println("Indexes: " + left + " and " + right);
                    return;
                } else if (sum < target) left++;
                else right--;
            }
        }
    }
    
