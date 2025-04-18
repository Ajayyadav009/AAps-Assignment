public class question_eight {
   
        public static String expand(String s, int left, int right) {
            while (left >= 0 && right < s.length() && s.charAt(left) == s.charAt(right)) {
                left--; right++;
            }
            return s.substring(left + 1, right);
        }
    
        public static void main(String[] args) {
            String s = "babad", longest = "";
            for (int i = 0; i < s.length(); i++) {
                String odd = expand(s, i, i);
                String even = expand(s, i, i + 1);
                if (odd.length() > longest.length()) longest = odd;
                if (even.length() > longest.length()) longest = even;
            }
            System.out.println("Longest palindrome: " + longest);
        }
    }
    

