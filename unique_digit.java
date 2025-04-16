public class unique_digit {
   
        public static int countNumbersWithUniqueDigits(int n) {
            if (n == 0) return 1;
            int count = 10, uniqueDigits = 9, available = 9;
            for (int i = 2; i <= n && available > 0; i++) {
                uniqueDigits *= available;
                count += uniqueDigits;
                available--;
            }
            return count;
        }
    
        public static void main(String[] args) {
            System.out.println("Unique numbers (2 digits): " + countNumbersWithUniqueDigits(2));
        }
    }
    

