package org.tfoc.helpers;

import lombok.experimental.UtilityClass;
import org.tfoc.ListNode;

@UtilityClass
public class DataFaker {

    public ListNode createListNodeFronArray(int[] arrayList) {

        ListNode result = null;
        ListNode currentNode = null;
        if(arrayList != null) {
            for (int element : arrayList) {
                if (result == null) {
                    result = new ListNode(element);
                    currentNode = result;
                } else {
                    currentNode.next = new ListNode(element);
                    currentNode = currentNode.next;
                }

            }
        }
        return result;
    }
}
