// Jan 26, 2023

class Solution {
    public boolean backspaceCompare(String s, String t) {
        Stack<Character> first =  new Stack<>();
        Stack<Character> second =  new Stack<>();

        removeBackspaces(s, first);
        removeBackspaces(t, second);

        String editedFirst = reverseString(first);
        String editedSecond = reverseString(second);

        return editedFirst.equals(editedSecond);
    }

    public void removeBackspaces(String s, Stack<Character> stack) {
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (c == '#' && !stack.isEmpty()) {
                stack.pop();
            } else if (c != '#') {
                stack.add(c);
            }
        }
    }

    public String reverseString(Stack<Character> s) {
        StringBuilder sb = new StringBuilder();
        while (!s.isEmpty()) {
            sb.append(s.pop());
        }
        return sb.toString();
    }
}