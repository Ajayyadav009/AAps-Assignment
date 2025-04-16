public class question_ten {
        public static void permute(String s, String answer) {
            if (s.length() == 0) {
                System.out.println(answer);
                return;
            }
            for (int i = 0; i < s.length(); i++) {
                permute(s.substring(0, i) + s.substring(i + 1), answer + s.charAt(i));
            }
        }
    
        public static void main(String[] args) {
            permute("abc", "");
        }
    }
    

