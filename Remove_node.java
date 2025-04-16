public class Remove_node {
    static class ListNode {
        int val;
        ListNode next;
        ListNode(int x) { val = x; }
    }
    
  
        public static ListNode removeNthFromEnd(ListNode head, int n) {
            ListNode dummy = new ListNode(0);
            dummy.next = head;
            ListNode fast = dummy, slow = dummy;
    
            for (int i = 0; i <= n; i++)
                fast = fast.next;
    
            while (fast != null) {
                fast = fast.next;
                slow = slow.next;
            }
    
            slow.next = slow.next.next;
            return dummy.next;
        }
    
        public static void main(String[] args) {
            ListNode head = new ListNode(1);
            head.next = new ListNode(2);
            head.next.next = new ListNode(3);
            ListNode result = removeNthFromEnd(head, 2);
            while (result != null) {
                System.out.print(result.val + " ");
                result = result.next;
            }
        }
    }
    

