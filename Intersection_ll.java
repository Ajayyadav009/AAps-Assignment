public class Intersection_ll {
    static class ListNode2 {
        int val;
        ListNode2 next;
        ListNode2(int x) { val = x; }
    }
    
   
        public static ListNode2 getIntersectionNode(ListNode2 a, ListNode2 b) {
            ListNode2 p1 = a, p2 = b;
    
            while (p1 != p2) {
                p1 = (p1 == null) ? b : p1.next;
                p2 = (p2 == null) ? a : p2.next;
            }
    
            return p1;
        }
    
        public static void main(String[] args) {
            // Skip testing here – needs linked list setup with shared node
            System.out.println("Intersection example – create nodes manually to test");
        }
    }
    

