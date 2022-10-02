/**
 * // This is the ImmutableListNode's API interface.
 * // You should not implement it, or speculate about its implementation.
 * interface ImmutableListNode {
 *     public void printValue(); // print the value of this node.
 *     public ImmutableListNode getNext(); // return the next node.
 * };
 */

class Solution {
    public void printLinkedListInReverse(ImmutableListNode head) {
        Stack<ImmutableListNode> s = new Stack<>();
        
        ImmutableListNode curr = head; 
        
        while (curr != null) {
            s.push(curr);
            curr = curr.getNext();
        }
        
        ImmutableListNode temp;
        while (!s.isEmpty()) {
            temp = s.pop();
            temp.printValue();
        }
    }
}