public class productSubarray {

        public static int maxProduct(int[] nums) {
            int max = nums[0], minProd = nums[0], maxProd = nums[0];
            for (int i = 1; i < nums.length; i++) {
                int temp = maxProd;
                maxProd = Math.max(nums[i], Math.max(maxProd * nums[i], minProd * nums[i]));
                minProd = Math.min(nums[i], Math.min(temp * nums[i], minProd * nums[i]));
                max = Math.max(max, maxProd);
            }
            return max;
        }
    
        public static void main(String[] args) {
            int[] nums = {2,3,-2,4};
            System.out.println("Max product: " + maxProduct(nums));
        }
    }
    
    
    
