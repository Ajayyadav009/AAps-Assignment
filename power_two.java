public class power_two {
        public static boolean isPowerOfTwo(int n) {
            return n > 0 && (n & (n - 1)) == 0;
        }
    
        public static void main(String[] args) {
            System.out.println("Is 16 power of two? " + isPowerOfTwo(16));
        }
    }

