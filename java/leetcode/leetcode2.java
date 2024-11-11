package leetcode;

public class leetcode2 {
    //https://leetcode.com/problems/add-two-numbers/
    public static void main(String[] args) {
        Solution solution = new Solution();

        ListNode l1 = new ListNode(2);
        l1.next = new ListNode(4);
        l1.next.next = new ListNode(3);

        ListNode l2 = new ListNode(5);
        l2.next = new ListNode(6);
        l2.next.next = new ListNode(4);

        ListNode result = solution.addTwoNumbers(l1, l2);

        printList(result);
    }

    public static class ListNode {
        int val;
        ListNode next;
        ListNode() {}
        ListNode(int val) { this.val = val; }
        ListNode(int val, ListNode next) { this.val = val; this.next = next; }
    }

    static class Solution {
        public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
            int ost = 0;
            ListNode result = new ListNode(0);
            ListNode current = result;
            while (l1 != null || l2 != null || ost != 0) {
                int one = 0;
                int two = 0;
                if (l1 != null) {
                    one = l1.val;
                }
                if (l2 != null) {
                    two = l2.val;
                }
                int sum = one + two + ost;
                current.next = new ListNode(sum % 10);
                ost = sum / 10;

                if (l1 != null) {
                    l1 = l1.next;
                }
                if (l2 != null) {
                    l2 = l2.next;
                }
                current = current.next;
            }

            return result.next;
        }
    }

    public static void printList(ListNode node) {
        while (node != null) {
            System.out.print(node.val);
            node = node.next;
        }
        System.out.println();
    }
}
