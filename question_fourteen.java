public class question_fourteen {

        public static double findMedian(int[] A, int[] B) {
            if (A.length > B.length) return findMedian(B, A);
    
            int x = A.length, y = B.length;
            int low = 0, high = x;
    
            while (low <= high) {
                int partitionX = (low + high) / 2;
                int partitionY = (x + y + 1) / 2 - partitionX;
    
                int maxX = (partitionX == 0) ? Integer.MIN_VALUE : A[partitionX - 1];
                int minX = (partitionX == x) ? Integer.MAX_VALUE : A[partitionX];
                int maxY = (partitionY == 0) ? Integer.MIN_VALUE : B[partitionY - 1];
                int minY = (partitionY == y) ? Integer.MAX_VALUE : B[partitionY];
    
                if (maxX <= minY && maxY <= minX) {
                    if ((x + y) % 2 == 0)
                        return ((double)Math.max(maxX, maxY) + Math.min(minX, minY)) / 2;
                    else
                        return (double)Math.max(maxX, maxY);
                } else if (maxX > minY)
                    high = partitionX - 1;
                else
                    low = partitionX + 1;
            }
    
            throw new IllegalArgumentException("Input arrays are not sorted");
        }
    
        public static void main(String[] args) {
            int[] nums1 = {1, 3};
            int[] nums2 = {2};
            System.out.println("Median: " + findMedian(nums1, nums2));
        }
    }
    
