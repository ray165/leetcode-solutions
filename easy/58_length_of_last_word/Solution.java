// Sept 24, 2022

class Solution {
    public int lengthOfLastWord(String s) {
        String[] arr = s.split(" ");        
        return arr[arr.length - 1].length();
    }
}