public class Solution {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        int lenA = 0;
        int lenB = 0;

        ListNode tempA = headA;
        ListNode tempB = headB;

        while (tempA != null) {
            lenA++;
            tempA = tempA.next;
        }

        while (tempB != null) {
            lenB++;
            tempB = tempB.next;
        }

        tempA = headA;
        tempB = headB;

        while (lenA > lenB) {
            tempA = tempA.next;
            lenA--;
        }
        while (lenB > lenA) {
            tempB = tempB.next;
            lenB--;
        }

        while (tempA != tempB) {
            tempA = tempA.next;
            tempB = tempB.next;
        }

        return tempA;
    }
}