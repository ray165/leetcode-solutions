// Sept 18, 2022
// Note: to push an array onto a stack, push it in reverse fron index (length -1)
// Challenge for this problem is to use some sort of cycle detection mention on the Q
// Since Java queue is made of a linked list, not sure if we can check if each
// object node reference has been visited to determine if we hit a cycle
// Instead... in this version I use a int-counter to determine if we have a cycle
// We have a cycle 
// 	IF no sandwiches gets popped off the stack 
//	AND
//	The number of times a student that re-queues == q.size()
class Solution {
    public int countStudents(int[] students, int[] sandwiches) {
        Queue<Integer> q = new LinkedList<>();
        Stack<Integer> s = new Stack<>();
        
        // Add into the queue from 0...n
        for (int i = 0; i < students.length; i++) {
            q.add(students[i]);
        }
        
        // push onto the stack in reverse
        for (int i = sandwiches.length - 1; i >= 0; i--) {
            s.push(sandwiches[i]);
        }
        
        // need some sort of cycle detection
        int fullLoopDetector = 0;
        while (!q.isEmpty()) {
            if (q.peek() == s.peek()) {
                q.remove();
                s.pop();
                fullLoopDetector = 0;
                System.out.println("cleared");
            } else {
                int endOfLine = q.remove();
                q.add(endOfLine);
                fullLoopDetector++;
                System.out.println(fullLoopDetector);
            }
            
            if (fullLoopDetector == q.size()) {
                return q.size();
            }
            
        }
        return 0;
    }
}