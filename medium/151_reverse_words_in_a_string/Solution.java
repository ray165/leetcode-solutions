class Solution {
    public String reverseWords(String s) {
        String clean = s.trim().replaceAll(" +", " ");

        String[] tokens = clean.split(" ");

        StringBuilder sb = new StringBuilder();

        for (int i = tokens.length - 1; i >= 0; i--) {
            if (i != 0) {
                sb.append(tokens[i] + " ");
            } else {
                sb.append(tokens[i]);
            }
        }

        return sb.toString();

    }
}