package class_07;

/**
*
* https://leetcode.com/problems/copy-list-with-random-pointer/
*/


public class CloneALinkedListWithNextAndRandomPointer {

}


class Solution {
    public Node copyRandomList(Node head) {
        if (head == null) {
            return null;
        }
        
        Map<Node, Node> map = new HashMap<>();
        
        Node current = head;
        while (current != null) {
            map.put(current, new Node(current.val));
            current = current.next;
        }
        
        current = head;
        
        while (current != null) {
            map.get(current).next = map.get(current.next);
            map.get(current).random = map.get(current.random);
            current = current.next;
        }
    
        return map.get(head);
    }
}
