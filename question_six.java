
import java.util.*;
public class question_six {
   

    
        public static void main(String[] args) {
            String s = "abcabcbb";
            Set<Character> set = new HashSet<>();
            int left = 0, maxLen = 0;
    
            for (int right = 0; right < s.length(); right++) {
                while (set.contains(s.charAt(right))) {
                    set.remove(s.charAt(left++));
                }
                set.add(s.charAt(right));
                maxLen = Math.max(maxLen, right - left + 1);
            }
    
            System.out.println("Longest unique substring length: " + maxLen);
        }

     
}
