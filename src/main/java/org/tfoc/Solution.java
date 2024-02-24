package org.tfoc;

/**
 * The class containing the solution to this exercise
 */
public class Solution {

    public ListNode mergeTwoLists(
            ListNode list1,
            ListNode list2) {

        ListNode result = null;
        ListNode currentNode = null;
        if(list1==null || list2==null)
            result = list1==null? list2 : list1;
        else {
            while(list1 !=null || list2 !=null) {
                ListNode newNode;
                if(list1==null || (list2 != null && list2.val < list1.val)) {
                    newNode = new ListNode(list2.val);
                    list2 = list2.next;
                } else {
                    newNode = new ListNode(list1.val);
                    list1 = list1.next;
                }
                if(result==null) {
                    result = newNode;
                    currentNode = result;
                }
                else {
                    currentNode.next = newNode;
                    currentNode = currentNode.next;
                }
            }
        }

        return result;
    }

}
